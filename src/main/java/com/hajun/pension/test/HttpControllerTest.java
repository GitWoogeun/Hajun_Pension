package com.hajun.pension.test;

import org.springframework.web.bind.annotation.*;

// 사용자가 요청 시, Data를 응답해주기 위해 사용되는 어노테이션
@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest(TestMember m) {
        return "get 요청 : " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail()  + "입니다.";
    }

    @PostMapping("/http/post")
    public String postTest(TestMember m) {
        return "post 요청 : " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail()  + "입니다.";
    }

    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }
}

