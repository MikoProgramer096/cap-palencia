package com.andres.N.MAD.controller;

import com.andres.N.MAD.model.Gorra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CatalogoController {

    @GetMapping("/")
    public String mostrarCatalogo(Model model) {

        List<Gorra> gorras = new ArrayList<>();

        gorras.add(new Gorra(" Gorra Blanca Basica", "New era", 65.51, "/images/Gorra1.jpg"));
        gorras.add(new Gorra("Gorra Azul Clasica", "New era", 65.51, "/images/Gorra2.jpg"));
        gorras.add(new Gorra("chicago white sox", "New era", 65.51, "/images/Gorra3.png"));

        model.addAttribute("gorras", gorras);

        return "index";
    }

}