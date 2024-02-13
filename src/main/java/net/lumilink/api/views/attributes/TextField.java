package net.lumilink.api.views.attributes;

import net.lumilink.api.views.View;

public abstract class TextField extends ViewAttribute {
    private String text;
    int size = 1;

    public TextField(String id, String text) {
        super(id);
        this.text = text;
    }

    public void changeText(String text){
        this.text = text;
        //TODO: Call a text update method
    }
}
