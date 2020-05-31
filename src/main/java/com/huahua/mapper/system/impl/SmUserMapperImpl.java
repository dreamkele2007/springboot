package com.huahua.mapper.system.impl;

import com.huahua.base.web.ui.PageInfo;
import com.huahua.domain.system.SmUser;
import com.huahua.mapper.system.SmUserMapper;

import java.util.List;

public class SmUserMapperImpl implements SmUserMapper {
	@Override public void insert(SmUser userDO) {

	}

	@Override public int insertSelective(SmUser userDO) {
		return 0;
	}

	@Override public SmUser selectById(Integer id) {
		return null;
	}

	@Override public SmUser selectByUserName(String name) {
		return null;
	}

	@Override public List<SmUser> selectAll() {
		return null;
	}

	@Override public List<SmUser> selectAll(PageInfo pageInfo) {
		return null;
	}

	@Override public int updateByPrimaryKey(SmUser userDO) {
		return 0;
	}
}
