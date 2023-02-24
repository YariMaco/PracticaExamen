/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TIcket.Ticket.service;

import com.TIcket.Ticket.entity.Concierto;
import java.util.List;

/**
 *
 * @author menoc
 */
public interface IConciertoService {
    public List<Concierto>getAllConcierto();
    public Concierto getConciertobyId(long id);
    public void saveConcierto(Concierto concierto);
    public void delete(long id);
    
}
