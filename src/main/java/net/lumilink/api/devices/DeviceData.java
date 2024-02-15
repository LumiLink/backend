package net.lumilink.api.devices;

import java.util.List;

public class DeviceData {
    private final List<Object> data;

    public DeviceData(Object... data) {
        this.data = List.of(data);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("<Device Data: {");
        for(int i = 0; i < data.size(); i++){
            s.append(data.get(i).toString());
            if(i < data.size() - 1){
                s.append(", ");
            }
        }

        s.append(">}");
        return s.toString();
    }
}
