package com.huahua.controller.system;

import com.huahua.base.web.http.Result;
import com.huahua.domain.system.SmSite;
import com.huahua.service.system.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GYM
 * @date 2020/4/17 14:20
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/api/site")
public class SiteController {
    @Autowired
    private SiteService siteService;

    /**save
     * @Description:
     * @Param: []
     */
    @PostMapping("/save")
    public Result save(@RequestBody SmSite smSite) {
        int id = siteService.insertSelective(smSite);
        SmSite site = siteService.selectById(id);
        return new Result(site);
    }

    /**
     * @Description: 查询所有
     */
    @GetMapping(value = "/all")
    public Result selectAll(){
        List<SmSite> result= siteService.selectAll();
        return new Result(result);
    }

    @PostMapping(value = "/update")
    public Result update(@RequestBody SmSite smSite){
        int i = siteService.updateByIdWithTx(smSite);
        return new Result();
    }

    @PostMapping(value = "/delete")
    public Result delete(@RequestBody SmSite smSite){
        int delete = siteService.delete(smSite);
        return new Result();
    }


}
