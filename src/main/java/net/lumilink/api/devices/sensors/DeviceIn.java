package net.lumilink.api.devices.sensors;

import net.lumilink.api.devices.Device;
import net.lumilink.api.lib.Data;

import java.util.List;

public interface DeviceIn<T> extends Device {
    List<Data<T>> read();
}
