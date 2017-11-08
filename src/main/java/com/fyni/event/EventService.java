package com.fyni.event;

import java.util.List;

public interface EventService {
	public int eventCreate(EventDTO event) throws Exception;
	public int eventUpdate(EventDTO event) throws Exception;
	public EventDTO eventRead(int event_ID) throws Exception;
	public List<EventDTO> eventReadAll() throws Exception;
	public List<EventDTO> eventUserOwn(String user_ID) throws Exception;
	public List<EventDTO> eventInCircle(String lon, String lat) throws Exception;
	public int eventDelete(int event_ID) throws Exception;
	public int eventUpDown(int event_Up, int event_Down) throws Exception;
	public int eventHit(int event_ID) throws Exception;
}
