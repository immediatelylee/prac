package com.prac.prac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

//    private final ItemService itemService;

    @GetMapping(value = "/")
    public String main(){

        return "main";
    }
    @GetMapping(value ="/notification")
    public String notification(){
        return "mockup";
    }


}
