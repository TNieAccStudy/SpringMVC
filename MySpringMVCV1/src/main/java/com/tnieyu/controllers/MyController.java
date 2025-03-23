/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tnieyu.controllers;

import com.tnieyu.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author admin
 */
@Controller
public class MyController {
    
    @Autowired
    private CategoryService cateService;
    
    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("msg", "testconnection-1");
        model.addAttribute("cates", cateService.getCates());
        return "index";
    }
}
