package com.vplan.backend.controller;

import com.vplan.backend.service.base.LoginServiceBase;
import com.vplan.backend.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user/")
public class LoginController {

    @Autowired
    private LoginServiceBase loginService;

    @ResponseBody
    @PostMapping("login")
    @Transactional
    public JsonResult login(HttpServletRequest request) {
        return loginService.login(request.getParameter("userId"),request.getParameter("password"));
    }

}

