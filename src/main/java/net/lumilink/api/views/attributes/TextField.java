package net.lumilink.api.views.attributes;

public abstract class TextField {
    private String text;
    int size = 1;

    public TextField(String text) {
        this.text = text;
    }

    public void changeText(String text){
        this.text = text;
        //TODO: Call a text update method
    }
}
