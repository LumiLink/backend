package net.lumilink.api.events;

public abstract class Event {
    private String name;
    private final boolean async;

    public Event() {
        this.async = false;
    }

    public Event(boolean async) {
        this.async = async;
    }
}
