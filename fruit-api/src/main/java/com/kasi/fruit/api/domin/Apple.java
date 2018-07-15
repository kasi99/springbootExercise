package com.kasi.fruit.api.domin;

import lombok.Data;

import java.io.Serializable;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-15 14:19
 * @Version:
 */
@Data
public class Apple implements Serializable {

    private static final long serialVersionUID = -8459846328836180515L;

    private Long id;
    private String name;
    private String color;
    private String address;
}
