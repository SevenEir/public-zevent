package com.fatec.zevent.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.zevent.DAO.EventDAO;
import com.fatec.zevent.DAO.UserDAO;
import com.fatec.zevent.DTO.Event.PublicEventItemDTO;
import com.fatec.zevent.config.SecurityConfiguration;
import com.fatec.zevent.model.Event;
import com.fatec.zevent.model.User;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import com.fatec.zevent.service.IEventService;

@Service
public class EventServiceImpl implements IEventService {

    @Autowired
    private EventDAO repository;
    
    @Autowired
    private UserDAO userDao;

    public List<PublicEventItemDTO> getAllPublicEvents() {
        List<PublicEventItemDTO> publicEvents = new ArrayList<>();
        for(PublicEventItemDTO event : repository.findByType(EventTypeEnum.PUBLIC)) {
            publicEvents.add(event);
        }
        return publicEvents;
    }

    public Event createEvent(Event event) {
        //TODO: Aqui vai precisar ser setado o usuário responsavel, que será o logado a partir do token
        repository.save(event);
        return event;
    }

    public Optional<Event> getEventById(String id) {
        return repository.findById(id);
    }

	@Override
	public boolean subscribeEvent(String id) {
		Optional<Event> event = repository.findById(id);
		if (event.isPresent()) {
			List<String> guestUsers = event.get().getGuestsIds();
			User user = userDao.findByEmail(SecurityConfiguration.gettingActualUser()); 
			guestUsers.add(user.getId());
			repository.save(event.get());
			return true;
		}
		else 
			return false;
	}

	@Override
	public boolean deleteEvent(String id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		else
			return false;
	}

}