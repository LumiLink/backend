package net.lumilink.api;

public interface Plugin {
    void onStart();
    void onDisable();

    String getName();

}
