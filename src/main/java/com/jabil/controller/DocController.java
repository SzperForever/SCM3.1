package com.jabil.controller;

import com.jabil.service.Documents.DocService;
import com.jabil.util.GsonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/documents")
public class DocController {
    @Autowired
    DocService docService;
    @RequestMapping(value = "/getDocuments")
    @ResponseBody
    String getDocs(){
        return GsonFactory.getDefaultDateFormatGson().toJson(docService.findAllDocs());
    }
}
