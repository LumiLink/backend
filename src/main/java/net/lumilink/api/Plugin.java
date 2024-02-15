package net.lumilink.api;

import net.lumilink.api.devices.DeviceType;
import net.lumilink.api.events.EventHandler;

import java.util.HashMap;

public abstract class Plugin {
    public void onStart(){}
    public void onDisable(){}

    private final EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    private final HashMap<String, Plugin.Method> methodExecutions = new HashMap<>();

    public final void registerDeviceType(DeviceType type){
        methodExecutions.get("registerDeviceType").execute(type);
    }

    @FunctionalInterface
    public interface Method {
        void execute(Object... args);
    }
}
