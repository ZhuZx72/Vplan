package com.vplan.backend.service;


import com.vplan.backend.mapper.UserMapper;
import com.vplan.backend.mapper.base.UserBaseMapper;
import com.vplan.backend.model.UserModel;
import com.vplan.backend.service.base.LoginServiceBase;
import com.vplan.backend.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService implements LoginServiceBase {
    @Autowired
    private UserBaseMapper userMapper;


    @Override
    public JsonResult login(String workerId, String password) {
        UserModel bean = new UserModel();
        bean.setUser_id(workerId);
        bean.setPassword(password);
        List<UserModel> list  = userMapper.queryUserModel(bean);
        if(list.isEmpty()){
            return JsonResult.errMsg("用户名或密码错误");
        }
        return JsonResult.ok(list.get(0));
    }
}
