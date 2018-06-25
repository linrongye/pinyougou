package cn.linry.controller;


import cn.linry.domain.TbBrand;
import cn.linry.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/brand")
@RestController
public class BrandController {
    @Reference
    private BrandService brandService;
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
}
