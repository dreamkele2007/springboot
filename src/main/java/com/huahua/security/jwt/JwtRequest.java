package com.huahua.security.jwt;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class JwtRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	@Pattern(regexp = "^[a-z0-9A-Z_]*$")
	@NotNull
	@Size(min = 1, max = 50)
	private String username;

	@NotNull
	@Size(min = 4, max = 100)
	private String password;

	private Boolean rememberMe;
}
