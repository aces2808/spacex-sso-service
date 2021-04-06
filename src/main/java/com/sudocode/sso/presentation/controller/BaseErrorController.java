package com.sudocode.sso.presentation.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseErrorController implements ErrorController {

    @RequestMapping(value = "/error")
    public RedirectView handleError(HttpServletRequest request) {
        return new RedirectView("/auth");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
