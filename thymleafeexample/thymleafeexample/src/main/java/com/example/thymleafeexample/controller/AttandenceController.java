package com.example.thymleafeexample.controller;

import com.example.thymleafeexample.AttandenceService;
import com.example.thymleafeexample.entity.Attandance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AttandenceController {

    @Autowired
    AttandenceService attandenceService;


    @GetMapping("/attandence")
    public String attandence(){

        return "attandence";
    }


    @PostMapping("/attandence/data")
    public String attandenceDetail(@RequestBody Attandance attandence){
        attandenceService.save(attandence);
        System.out.println(attandence.getFname());
        System.out.println(attandence.getLname());
        System.out.println(attandence.getAttandence());
        return "attandenceList";
    }

//    @PostMapping("/attandence/data")
//    public String attandenceDetail(@RequestParam("fname") String fname, @RequestParam("lname") String lname){
//        attandenceService.save(attandence);
//        System.out.println(fname);
//        System.out.println(lname);
//        return "attandence";
//    }


}
