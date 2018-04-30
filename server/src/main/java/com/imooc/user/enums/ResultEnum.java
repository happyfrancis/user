/**
 * @program: order
 * @description:
 * @author: Francis
 * @create: 2018-04-13 11:39
 **/

package com.imooc.user.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    LOGIN_FAIL(1, "登陆失败"),
    ROLE_ERROR(2,"角色权限有误"),
   ;
    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;

}
