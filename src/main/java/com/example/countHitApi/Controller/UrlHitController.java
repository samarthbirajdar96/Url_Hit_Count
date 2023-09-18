package com.example.countHitApi.Controller;

import com.example.countHitApi.Entity.UserHitCount;
import com.example.countHitApi.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")

public class UrlHitController {
    @Autowired
     UrlHitService urlHitService;
    @PostMapping("visitor")
    public String addAVisitor(@RequestBody UserHitCount user)
    {
        return urlHitService.addVisitor(user);
    }

    @GetMapping("visitors")
    public List<UserHitCount> getAllVisitors()
    {
        return urlHitService.getAllVisitors();
    }

    @GetMapping("visitor/count")
    public String getTheNumberOfVisitors()
    {
        return urlHitService.getCountOfVisitors();
    }

    @GetMapping("api/v1/visitor-count-app/username/{username}")
    public UserHitCount getAVisitor(@PathVariable String username)
    {
        return urlHitService.getAVisitor(username);
    }
    @PutMapping("api/v1/count_update/username/{username}")
    public String countUpdated(@PathVariable  String username)
    {
        return urlHitService.countUpdated(username);
    }
}