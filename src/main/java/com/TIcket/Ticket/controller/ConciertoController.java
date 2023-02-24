/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TIcket.Ticket.controller;

import com.TIcket.Ticket.entity.Concierto;
import com.TIcket.Ticket.entity.Lugar;
import com.TIcket.Ticket.service.IConciertoService;
import com.TIcket.Ticket.service.ILugarService;
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
public class ConciertoController {
    
    @Autowired
    private ILugarService lugarService;    
    @Autowired
    private IConciertoService conciertoService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Concierto");
        model.addAttribute("concierto", listaConcierto);
        return "conciertos";        
    }
    
    @GetMapping("/conciertoN")
    public String crearConcierto(Model model){
        List<Lugar> listaLugar = lugarService.listPlace();
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("conciertos", listaLugar);
        return "crear";
    }
}
