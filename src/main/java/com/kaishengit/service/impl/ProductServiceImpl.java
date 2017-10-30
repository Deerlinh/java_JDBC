package com.kaishengit.service.impl;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.service.ProductService;


/**
 * Created by 蔡林红 on 2017/10/30.
 */


public class ProductServiceImpl implements ProductService {


    private ProductDao productDao;


    public void setProductDao(ProductDao productDao){
        this.productDao=productDao;
    }
    @Override
    public void save() {
        productDao.save(null);
    }
}
