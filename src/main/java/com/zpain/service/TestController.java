package com.zpain.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/z")
public class TestController {

//    @Autowired
//    FeignController feignController;

    @GetMapping("/p")
    public String getP(){
        return "p";
    }

//    @GetMapping("/p3")
//    public String getP2(){
//        return feignController.getP();
//    }

}
