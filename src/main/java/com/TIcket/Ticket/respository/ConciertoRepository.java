/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TIcket.Ticket.respository;

import com.TIcket.Ticket.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author menoc
 */
@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{
    
    
}
