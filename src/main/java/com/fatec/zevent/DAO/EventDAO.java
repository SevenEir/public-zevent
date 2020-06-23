package com.fatec.zevent.DAO;

import com.fatec.zevent.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventDAO extends CrudRepository<Evento, Integer> {

}