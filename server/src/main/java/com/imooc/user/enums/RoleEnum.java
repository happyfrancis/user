package com.imooc.user.enums;

import lombok.Getter;

/**
 * @program: user
 * @description:
 * @author: Francis
 * @create: 2018-04-26 19:42
 **/
@Getter
public enum RoleEnum {

     BUYER(1, "买家"),
     SELLER(2, "卖家"),
   ;
    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;
}
