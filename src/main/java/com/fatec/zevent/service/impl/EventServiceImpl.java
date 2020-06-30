package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.model.Evento;
import com.fatec.zevent.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements IEventService {

    @Autowired
    private EventDAO repository;

    public List<Evento> getAllPublicEvents() {
        List<Evento> publicEventos = new ArrayList<>();
        for(Evento evento : repository.findAllPublicEvents()) {
            publicEventos.add(evento);
        }
        return publicEventos;
    }

    public Evento createEvent(Evento evento) {
        //TODO: Aqui vai precisar ser setado o usuário responsavel, que será o logado a partir do token
        repository.save(evento);
        return evento;
    }

    @Override
    public Evento findPublicEventById(String id) {
        return repository.findPublicEventById(id);
    }

    @Override
    public void deleteEvent(int id) {
        repository.deleteEvent(Integer.toString(id));
    }

    @Override
    public void setEventPrivate(int eventId) {
        repository.setEventPrivate(Integer.toString(eventId));
    }

}