package com.fatec.zevent.DAO;

import com.fatec.zevent.model.Evento;

import antlr.debug.Event;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EventDAO extends CrudRepository<Evento, Integer> {

    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Modifying
    @Query(
            value = "UPDATE evento set type = \'PRIVATE\' where id=?",
            nativeQuery = true
    )
    void setEventPrivate(String eventId);

    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Modifying
    @Query(
            value = "DELETE FROM evento WHERE id=?",
            nativeQuery = true
    )
    void deleteEvent(String id);

    @Query(
            value = "SELECT * FROM evento e WHERE id = ?",
            nativeQuery = true
    )
    Evento findPublicEventById(String eventId);

    @Query(
            value = "SELECT * FROM evento e WHERE e.type = \"PUBLIC\"",
            nativeQuery = true
    )
    List<Evento> findAllPublicEvents();
    
    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Modifying
    @Query(
    		value = "CALL `zevent`.`INSERE_NOVO_EVENTO`(?, ?, ?, ?, ?, ?, ?, ?);"
    		
    		)
    void insertEvent(String name, String category, String type, String desc, int value, int seats, 
    		String finishDate, String initDate);
    

}