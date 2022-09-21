package com.example.demo_crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PICcontroller {
    @Autowired
    private PICRepository picRepository;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<PIC> listPIC = picRepository.list();
        model.addAttribute("listPIC", listPIC);
        return "index";
    }
}