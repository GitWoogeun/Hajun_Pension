package com.hajun.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PensionTableController {

        @RequestMapping("/table")
        public String getTable()
        {
                return "table";
        }
}
