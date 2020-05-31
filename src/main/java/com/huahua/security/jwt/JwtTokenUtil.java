package com.huahua.security.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description JwtTokenUtil
 * @Author GYM
 * @Date 2020/2/28 15:41
 * @Version 1.0.0
 */
public class JwtTokenUtil {
    // 签名密钥
    private static final String SECRET = "gaoyuming";
    // 过期时间默认设置24小时
    private static final Date expirationTime = new Date(System.currentTimeMillis()+24*60*60*1000);
    /**
     * 生成token
     * @param name
     * @return
     */
    public static String generateToken(String name){
        // 通过秘钥签名JWT
        SignatureAlgorithm signatureAlgorithm =  SignatureAlgorithm.HS512;
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        HashMap<String, Object> map = new HashMap<>();
        map.put("name",name);
        String jwt = Jwts.builder()
                .setClaims(map)
                .setExpiration(expirationTime)// 过期时间
                .signWith(SignatureAlgorithm.HS512, signingKey)
                .compact();

        return jwt;
    }

    /**
     * 验证token
     * @param token
     */
    public static String validateToken(String token) {
        try {
            // parse the token.
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(SECRET))
                    .parseClaimsJws(token.replace("Bearer ",""))
                    .getBody();
            return body.get("name").toString();
        }catch (Exception e) {
            throw new IllegalStateException("Invalid Token. " + e.getMessage());
        }

    }

}
