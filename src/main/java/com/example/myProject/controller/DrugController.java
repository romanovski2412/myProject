package com.example.myProject.controller;

import com.example.myProject.model.Drug;
import com.example.myProject.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DrugController {

    @Autowired
    DrugRepository drugRepository;

    @GetMapping
    String drugs(Model model) {
        List<Drug> drugs = drugRepository.findAll();
        model.addAttribute("drugs", drugs);
        return "drugs";
    }

    @GetMapping("delete-drug")
    String delete(int id) {
        drugRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("create-drug")
    String create() {
        return "create-drug";
    }

    @PostMapping("create-drug")
    String create(Drug drug) {
        drugRepository.save(drug);
        return "redirect:/";
    }

    @GetMapping("update-drug")
    String update(Model model, int id) {
        Drug drug = drugRepository.findById(id).get();
        model.addAttribute("drug", drug);
        return "update-drug";
    }

    @PostMapping("update-drug")
    String update(Drug drug) {
        drugRepository.save(drug);
        return "redirect:/";
    }
}
