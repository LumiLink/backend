package net.lumilink.api.devices;

public interface Device {

    void onConnection();
    void onDisconnection();

    boolean isConnected();

    String getName();

    String getId();
    String getDescription();
}
