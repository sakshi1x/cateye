package com.example.cateye.controller;


import com.example.cateye.services.user_management.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final UserService userService;


//    @GetMapping
//    public String getPage(){
//
//        return "dashboard";
//    }

//    @GetMapping("/sendEmail")
//    public String sendRegistrationEmail() {
//        this.userService.sendEmail();
//        return "emailsuccess";
//    }


    @GetMapping("/getChat")
    public String getChatPage() {
        return "chat";
    }
}
