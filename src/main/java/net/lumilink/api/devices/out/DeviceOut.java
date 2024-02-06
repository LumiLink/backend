package net.lumilink.api.devices.out;

import net.lumilink.api.lib.Data;

public interface DeviceOut<T> {
    boolean update(Data<T>... data);
}
