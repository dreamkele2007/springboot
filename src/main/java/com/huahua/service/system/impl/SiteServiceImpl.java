package com.huahua.service.system.impl;

import com.huahua.domain.system.SmSite;
import com.huahua.mapper.system.SmSiteMapper;
import com.huahua.service.system.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/17 14:27
 * @Description: TODO
 */
@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    SmSiteMapper smSiteMapper;
    @Override
    public int insertSelective(SmSite smSite) {
        int insert = smSiteMapper.insert(smSite);
        return 0;
    }

    @Override
    public int delete(SmSite smSite) {
        int i = smSiteMapper.deleteByPrimaryKey(smSite.getId());
        return i;
    }

    @Override
    public void insert(SmSite smSite) {
        int insert = smSiteMapper.insert(smSite);
    }

    @Override
    public SmSite selectById(Integer id) {
        SmSite smSite = smSiteMapper.selectByPrimaryKey(id);
        return smSite;
    }

    @Override
    public List<SmSite> selectAll() {
        List<SmSite> smSites = smSiteMapper.selectAll();
        return smSites;
    }

    @Override
    public int updateByIdWithTx(SmSite userDO) {
        int i = smSiteMapper.updateByPrimaryKey(userDO);
        return i;
    }
}
