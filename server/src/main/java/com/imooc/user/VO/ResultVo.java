/**
 * @program: product
 * @description: http请求返回的最外层对象
 * @author: Francis
 * @create: 2018-04-12 16:19
 **/

package com.imooc.user.VO;

import lombok.Data;

@Data
public class ResultVo<T> {

    /*错误码*/
    private Integer code;

    /*提示信息*/
    private String msg;

    /*具体内容*/
    private T data;
}
