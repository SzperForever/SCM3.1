package com.jabil.controller;

import com.jabil.service.Depart.DepartService;
import com.jabil.util.GsonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/depart")
public class DepartController {
    @Autowired
    DepartService departService;
    @RequestMapping(value = "/getDeparts")
    @ResponseBody
    String getDeparts(){
        return GsonFactory.getDefaultDateFormatGson().toJson(departService.findAllDeparts());
    }
}
