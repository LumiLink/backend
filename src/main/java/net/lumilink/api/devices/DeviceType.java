package net.lumilink.api.devices;

import net.lumilink.api.Plugin;

public abstract class DeviceType implements DeviceTypeObserver {

    private String name;

    public void onDataReceived(DeviceData data){

    }

    @Override
    final public void sendData(DeviceData data){

    }

    public DeviceType(String name) {
        this.name = name;
    }
}
