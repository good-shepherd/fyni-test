package com.fyni.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class EventDAOImpl implements EventDAO{
	
	@Inject
	SqlSession session;
	private static final String namespace = "com.fyni.mapper.eventMapper";
	@Override
	public int eventCreate(EventDTO event) {
		return session.insert(namespace + ".eventCreate", event);
	}

	@Override
	public int eventUpdate(EventDTO event) {
		return session.update(namespace + ".eventUpdate",event);
	}

	@Override
	public EventDTO eventRead(int event_ID) {
		return session.selectOne(namespace + ".eventRead",event_ID);
	}

	@Override
	public List<EventDTO> eventReadAll() {
		return session.selectList(namespace + ".eventReadAll");
	}

	@Override
	public List<EventDTO> eventUserOwn(String user_ID) {
		return session.selectList(namespace + ".eventUserOwn",user_ID);
	}

	@Override
	public List<EventDTO> eventInCircle(String lon, String lat) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("lon", lon);
		map.put("lat", lat);
		return session.selectList(namespace + ".eventInCircle",map);
	}

	@Override
	public int eventDelete(int event_ID) {
		return session.delete(namespace + ".eventDelete",event_ID);
	}

	@Override
	public int eventUpDown(int event_Up, int event_Down) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("event_Up", event_Up);
		map.put("event_Down", event_Down);
		return session.update(namespace + ".eventUpDown", map);
	}

	@Override
	public int eventHit(int event_ID) {
		return session.update(namespace + ".eventHit", event_ID);
	}

}
