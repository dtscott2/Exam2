package com.example.demo.controllers;
import com.example.demo.models.Data;
import com.example.demo.models.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class DataController {

    @Autowired
    DataRepo dataRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("data");
        mv.addObject("Data", dataRepo.findAll());

        return mv;


    }
}

