/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TIcket.Ticket.service;

import com.TIcket.Ticket.entity.Lugar;
import com.TIcket.Ticket.respository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author menoc
 */
@Service
public class LugarService implements ILugarService {
    @Autowired
    private LugarRepository lugarRepository;
    @Override
    public List<Lugar> listPlace() {
        return(List<Lugar>)lugarRepository.findAll();
    }
    
}
