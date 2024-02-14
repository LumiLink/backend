package net.lumilink.api;

import net.lumilink.api.events.EventHandler;

public abstract class Plugin {
    public void onStart(){}
    public void onDisable(){}

    private final EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }
}
