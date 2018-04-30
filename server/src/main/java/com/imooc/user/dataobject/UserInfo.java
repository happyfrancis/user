package com.imooc.user.dataobject;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: user
 * @description:
 * @author: Francis
 * @create: 2018-04-26 17:32
 **/
@Data
@Entity
public class UserInfo {

    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

    private Integer role;
}
