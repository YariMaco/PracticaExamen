/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.Tienda.controller;

import com.Tienda.Tienda.entity.Pais;
import com.Tienda.Tienda.entity.Persona;
import com.Tienda.Tienda.service.IPaisService;
import com.Tienda.Tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author menoc
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;
    @Autowired
    private IPaisService paisService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getALLPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("persona", listaPersona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Pais> listaPaises = paisService.listCounry();
        model.addAttribute("persona",new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

}
