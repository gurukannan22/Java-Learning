package com.myspringapplication.leo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RateLimiterService {

    @Value("${request.rate.limit}")
    private int requestRateLimit; //injected from configuration file

    private ConcurrentHashMap<String, AtomicInteger> requestCounts = new ConcurrentHashMap<>();

    public boolean isAllowed(String userId){
        requestCounts.putIfAbsent(userId, new AtomicInteger());
        int currentRequests = requestCounts.get(userId).incrementAndGet();
        if(currentRequests > requestRateLimit){
            System.out.println("Alert User " + userId + " exceeded the request Limit");
            return false; //Deny request
        }
        return true; // Allow Request
    }

    @Scheduled(fixedRate = 3600000)
    public void resetLimit(){
        System.out.println("Resetting the Request Counts");
        requestCounts.clear();
    }





}
