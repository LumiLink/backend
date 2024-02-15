package net.lumilink.api.events;

import net.lumilink.api.Plugin;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> events = new ArrayList<>();

    public void register(Event event){
        events.add(event);
    }
}
