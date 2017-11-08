package com.fyni.event;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

	EventDAO dao;
	@Override
	public int eventCreate(EventDTO event) throws Exception {
		return dao.eventCreate(event);
	}

	@Override
	public int eventUpdate(EventDTO event) throws Exception {
		return dao.eventUpdate(event);
	}

	@Override
	public EventDTO eventRead(int event_ID) throws Exception {
		return dao.eventRead(event_ID);
	}

	@Override
	public List<EventDTO> eventReadAll() throws Exception {
		return dao.eventReadAll();
	}

	@Override
	public List<EventDTO> eventUserOwn(String user_ID) throws Exception {
		return dao.eventUserOwn(user_ID);
	}

	@Override
	public List<EventDTO> eventInCircle(String lon, String lat) throws Exception {
		return dao.eventInCircle(lon, lat);
	}

	@Override
	public int eventDelete(int event_ID) throws Exception {
		return dao.eventDelete(event_ID);
	}

	@Override
	public int eventUpDown(int event_Up, int event_Down) throws Exception {
		return dao.eventUpDown(event_Up, event_Down);
	}

	@Override
	public int eventHit(int event_ID) throws Exception {
		return dao.eventHit(event_ID);
	}

}
