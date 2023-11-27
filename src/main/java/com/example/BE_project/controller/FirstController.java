package com.example.BE_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        //모델 객체가 "지환"값을 "username"에 연결해 웹브라우저로 보냄
        model.addAttribute("username", "지환");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "변지환");
        return "goodbye";
    }
}
