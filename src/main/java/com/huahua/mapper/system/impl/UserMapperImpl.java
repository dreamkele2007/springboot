package com.huahua.mapper.system.impl;

import com.huahua.base.web.ui.model.PageInfo;
import com.huahua.domain.system.UserDO;
import com.huahua.mapper.system.UserMapper;

import java.util.List;

public class UserMapperImpl implements UserMapper {
	@Override public void insert(UserDO userDO) {

	}

	@Override public int insertSelective(UserDO userDO) {
		return 0;
	}

	@Override public UserDO selectById(Integer id) {
		return null;
	}

	@Override public UserDO selectByName(String name) {
		return null;
	}

	@Override public List<UserDO> selectAll() {
		return null;
	}

	@Override public List<UserDO> selectAll(PageInfo pageInfo) {
		return null;
	}

	@Override public int updateByPrimaryKey(UserDO userDO) {
		return 0;
	}
}
