package cn.linry.service.impl;

import cn.linry.domain.TbBrand;
import cn.linry.mapper.BrandMapper;
import cn.linry.service.BrandService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper dao;

    @Override
    public List<TbBrand> findAll() {
        return dao.queryAll();
    }
}
