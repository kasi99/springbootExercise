package com.kasi.fruit.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kasi.fruit.api.service.TestService;


/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-15 05:16
 * @Version:
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Override
    public String eat(String fruit) {
        return fruit;
    }
}
