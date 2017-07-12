package com.turesw.oms.cafecounter.dto;

public class EventInfo {
    String eventitle;
    String eventContent;
    String eventStart;
    String eventEnd;
    int state;

    public EventInfo() {

    }

    public EventInfo(String _eventitle, String _eventContent, String _eventStart, String _eventEnd, int _state)

    {
        this.eventitle = _eventitle;
        this.eventContent = _eventContent;
        this.eventStart = _eventStart;
        this.eventEnd = _eventEnd;
        this.state = _state;
    }

    public void put(String key, String object) {
        if (key.equals("eventitle"))
            this.eventitle = object;
        else if (key.equals("eventContent"))
            this.eventContent = object;
        else if (key.equals("eventStart"))
            this.eventStart = object;
        else if (key.equals("eventEnd"))
            this.eventEnd = object;
        else if (key.equals("state"))
            this.state = Integer.parseInt(object);
    }

    public String get_eventitle() {
        return eventitle;
    }

    public String get_eventContent() {
        return eventContent;
    }

    public String get_eventStart() {
        return eventStart;
    }

    public int get_state() {
        return state;
    }
}
