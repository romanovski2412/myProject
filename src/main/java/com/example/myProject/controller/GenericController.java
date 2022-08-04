package com.example.myProject.controller;



import com.example.myProject.model.Drug;
import com.example.myProject.model.Generic;
import com.example.myProject.repository.DrugRepository;
import com.example.myProject.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GenericController {

    @Autowired
    DrugRepository drugRepository;

    @Autowired
    GenericRepository genericRepository;

    @GetMapping("generics")
    String generics (Model model) {
        List<Generic> generics = genericRepository.findAll();
        model.addAttribute("generics", generics);
        return "generics";
    }

    @GetMapping("delete-generic")
    String delete(int id) {
        genericRepository.deleteById(id);
        return "redirect:generics";
    }

    @GetMapping("create-generic")
    String create(Model model) {
        List<Drug> drugs = drugRepository.findAll();
        model.addAttribute("drugs", drugs);
        return "create-generic";
    }

    @PostMapping("create-generic")
    String create(Generic generic) {
        genericRepository.save(generic);
        return "redirect:generics";
    }

    @GetMapping("update-generic")
    String update(Model model, int id) {
        Generic generic = genericRepository.findById(id).get();
        model.addAttribute("generic", generic);

        List<Drug> drugs = drugRepository.findAll();
        model.addAttribute("drugs", drugs);
        return "update-generic";
    }

    @PostMapping("update-generic")
    String update(Generic generic) {
        genericRepository.save(generic);
        return "redirect:generics";
    }
}
