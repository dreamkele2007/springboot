package com.huahua.service.redis;

import com.huahua.base.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;


/**
 * RedisService:redis操作
 * 
 * @Description: 简易使用方式：<br/>
 *               1.@Autowired private CacheService cacheService;<br/>
 *               2.存数据：cacheService.put("张","b");<br/>
 *               3.取数据：cacheService.getString("张");<br/>
 *               4.删数据：cacheService.delete("张");
 */
@Service
public class RedisService {

	public static Logger log = Logger.getLogger(RedisService.class);
	@Resource
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	/**
	 * 存字符串
	 *
	 * @Title: putString
	 * @Description:
	 * @param name
	 * @param value
	 * @return void
	 */
	public void putString(final String name, final String value) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize(name),
						redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
	}

	/**
	 * 存字符串
	 *
	 * @Title: putString
	 * @Description:
	 * @param name
	 * @param value
	 * @return void
	 */
	public void putString(final String name, final String value, final long expiredInterval) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize(name),
						redisTemplate.getStringSerializer().serialize(value));
				connection.expire(redisTemplate.getStringSerializer().serialize(name), expiredInterval);
				return null;
			}
		});
	}

	/**
	 * 存对象
	 *
	 * @Title: put
	 * @Description:
	 * @param name
	 * @param obj
	 * @return void
	 */
	public void put(final String name, final Object obj) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize(name),
						redisTemplate.getStringSerializer().serialize(JsonUtils.toJson(obj)));
				return null;
			}
		});
	}

	/**
	 * 存对象
	 *
	 * @Title: put
	 * @Description:
	 * @param name
	 * @param obj
	 * @return void
	 */
	public void put(final String name, final Object obj, final long expiredInterval) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize(name),
						redisTemplate.getStringSerializer().serialize(JsonUtils.toJson(obj)));
				connection.expire(redisTemplate.getStringSerializer().serialize(name), expiredInterval);
				return null;
			}
		});
	}

	/**
	 * 根据key获取String类型的值：
	 *
	 * @Title: getString
	 * @Description:
	 * @param name
	 * @return
	 * @return String
	 */
	public String getString(final String name) {
		try {
			return redisTemplate.execute(new RedisCallback<String>() {
				@Override
				public String doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] key = redisTemplate.getStringSerializer().serialize(name);
					if (connection.exists(key)) {
						byte[] value = connection.get(key);
						String val = redisTemplate.getStringSerializer().deserialize(value);
						return StringUtils.isEmpty(val) ? "" : val.replaceAll("\"", "");
					}
					return "";
				}
			});

		} catch (Exception e) {
			log.error("redis获取值(" + name + ") 异常", e);
			return null;
		}
	}

	/**
	 * 根据key获取对象
	 *
	 * @Title: get
	 * @Description:
	 * @param name
	 * @param classname
	 * @return
	 * @return Object
	 */
	public Object get(final String name, @SuppressWarnings("rawtypes") final Class classname) {
		try {
			return redisTemplate.execute(new RedisCallback<Object>() {
				@Override
				@SuppressWarnings("unchecked")
				public Object doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] key = redisTemplate.getStringSerializer().serialize(name);
					if (connection.exists(key)) {
						byte[] value = connection.get(key);
						String val = redisTemplate.getStringSerializer().deserialize(value);
						return JsonUtils.jsonToObject(val, classname);
					}
					return null;
				}
			});
		} catch (Exception e) {
			log.error("redis获取对象(" + name + " )异常", e);
			return null;
		}
	}

	/**
	 * 根据key删除
	 *
	 * @Title: delete
	 * @Description:
	 * @param name
	 * @return void
	 */
	public void delete(final String name) {
		redisTemplate.delete(name);
	}

}
