package com.imooc.user.service;

import com.imooc.user.dataobject.UserInfo;

/**
 * @program: user
 * @description:
 * @author: Francis
 * @create: 2018-04-26 17:38
 **/
public interface UserService {

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
