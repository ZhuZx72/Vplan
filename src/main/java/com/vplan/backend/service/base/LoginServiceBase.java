package com.vplan.backend.service.base;

import com.vplan.backend.util.JsonResult;
import org.springframework.stereotype.Service;

@Service
public interface LoginServiceBase {
    JsonResult login(String workerId, String password);
}
