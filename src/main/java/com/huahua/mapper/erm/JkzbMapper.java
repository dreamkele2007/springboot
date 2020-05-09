package com.huahua.mapper.erm;

import com.huahua.base.web.ui.model.PageInfo;
import com.huahua.domain.system.UserDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/2 21:24
 * @Description: TODO
 */
@Repository
public interface JkzbMapper {
	UserDO selectById(Integer id);

	UserDO selectByName(String name);

	List<UserDO> selectAll();

	List<UserDO> selectAll(PageInfo pageInfo);

}
