package com.hajun.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PensionPasswordController {

        @RequestMapping("/password")
        public String getPassword()
        {
                return "password";
        }
}
