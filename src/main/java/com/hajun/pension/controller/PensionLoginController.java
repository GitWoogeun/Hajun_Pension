package com.hajun.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PensionLoginController {

        @RequestMapping("/login")
        public String getRegister()
        {
                return "login";
        }

}
