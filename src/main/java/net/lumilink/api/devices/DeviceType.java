package net.lumilink.api.devices;

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

    public String getName() {
        return name;
    }
}
