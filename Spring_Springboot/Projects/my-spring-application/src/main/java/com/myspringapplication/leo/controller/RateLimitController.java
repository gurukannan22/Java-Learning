package com.myspringapplication.leo.controller;

import com.myspringapplication.leo.model.UserRequest;
import com.myspringapplication.leo.service.RateLimiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {
    @Autowired
    RateLimiterService rateLimiterService;

    public RateLimitController(RateLimiterService rateLimiterService){
        this.rateLimiterService = rateLimiterService;
    }

    @GetMapping("api/resource")
    public String accessApi(@RequestParam("userId") String UserId){
        if(!rateLimiterService.isAllowed(UserId)){
            return "Your Request limit is exceeded";
        }
        return "Request Processed";
    }

    @PostMapping("api/resource")
    public String accessApi(@RequestBody UserRequest userRequest){
        if(!rateLimiterService.isAllowed(userRequest.getUserId())){
            return "Your Request limit is exceeded";
        }
        return "Request Processed";
    }


}
