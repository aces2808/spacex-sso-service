package com.sudocode.sso.presentation.controller;

import com.sudocode.sso.presentation.constants.SsoConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BaseController {

    @RequestMapping(value = {"", "#"})
    public String getIndex() {
        return SsoConstants.BASE_AUTH_PATH;
    }

}
