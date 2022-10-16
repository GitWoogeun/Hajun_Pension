package com.hajun.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PensionChartController {

        @RequestMapping("/chart")
        public String getChart()
        {
                return "chart";
        }
}
