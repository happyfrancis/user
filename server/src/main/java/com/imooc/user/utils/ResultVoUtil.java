/**
 * @program: product
 * @description:
 * @author: Francis
 * @create: 2018-04-12 17:01
 **/

package com.imooc.user.utils;

import com.imooc.user.VO.ResultVo;
import com.imooc.user.enums.ResultEnum;

public class ResultVoUtil {

    public static ResultVo success(Object obj) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(obj);
        return resultVo;
    }

    public static ResultVo success() {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo error(ResultEnum resultEnum) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg(resultEnum.getMessage());
        return resultVo;
    }
}
