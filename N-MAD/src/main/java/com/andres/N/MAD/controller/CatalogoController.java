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
    public String inicio(Model model) {
        return "inicio";
    }

    @GetMapping("/catalogo")
    public String catalogo(Model model) {
        List<Gorra> gorras = new ArrayList<>();
    gorras.add(new Gorra("Gorra Blanca Basica", "New Era", 65.51, "/images/Gorra1.jpg"));
    gorras.add(new Gorra("Gorra Azul Clasica", "New Era", 65.51, "/images/Gorra2.jpg"));
    gorras.add(new Gorra("Chicago White Sox", "New Era", 65.51, "/images/Gorra3.png"));
        model.addAttribute("gorras", gorras);
        return "catalogo";
    }

    @GetMapping("/categorias")
    public String categorias(Model model) {
        return "categorias";
    }

    @GetMapping("/ofertas")
    public String ofertas(Model model) {
        return "ofertas";
    }

    @GetMapping("/contacto")
    public String contacto(Model model) {
        return "contacto";
    }
}