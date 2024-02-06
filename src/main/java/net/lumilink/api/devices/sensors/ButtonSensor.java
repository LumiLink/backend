package net.lumilink.api.devices.sensors;

import net.lumilink.api.lib.Data;

import java.util.List;

public interface ButtonSensor extends Sensor<Boolean> {

    @Override
    List<Data<Boolean>> read();
}
