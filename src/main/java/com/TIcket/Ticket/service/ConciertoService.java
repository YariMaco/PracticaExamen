/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TIcket.Ticket.service;

import com.TIcket.Ticket.entity.Concierto;
import com.TIcket.Ticket.respository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author menoc
 */
@Service
public class ConciertoService implements IConciertoService{
    @Autowired
    private ConciertoRepository conciertoRepositoy;

    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>)conciertoRepositoy.findAll();
    }

    @Override
    public Concierto getConciertobyId(long id) {
        return conciertoRepositoy.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepositoy.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepositoy.deleteById(id);
    }
    
}
