package com.hajun.pension.controller;

import com.hajun.pension.dto.PensionCustDto;
import com.hajun.pension.service.PensionCustService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PensionRegisterController {

        @Autowired
        PensionCustService pensionCustService;

        // 회원가입 페이지 이동
        @RequestMapping("/register")
        public String MoveToRegisterPage()
        {
                return "register";
        }

        // 회원가입 진행
        @RequestMapping("/joinRegister")
        @ResponseBody
        public String joinRegister(PensionCustDto custDto)
        {
                System.out.println("회원가입 Controller 호출...");
                pensionCustService.joinCust(custDto);
                return "redirect:/login";
        }
}
