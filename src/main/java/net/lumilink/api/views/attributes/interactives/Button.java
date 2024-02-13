package net.lumilink.api.views.attributes.interactives;

public abstract class Button extends Interactive {
    public Button(String id) {
        super(id);
    }

    final public void onInteract(Object obj) {
        onInteract();
    }

    abstract void onInteract();
}
