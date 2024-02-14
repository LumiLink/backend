package net.lumilink.api.events;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> events = new ArrayList<>();

    public void register(Event event){
        events.add(event);
    }
}
