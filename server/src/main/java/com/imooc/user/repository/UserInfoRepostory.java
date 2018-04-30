package com.imooc.user.repository;

import com.imooc.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: user
 * @description:
 * @author: Francis
 * @create: 2018-04-26 17:35
 **/
public interface UserInfoRepostory extends JpaRepository<UserInfo,String> {

    UserInfo findByOpenid(String openid);
}
