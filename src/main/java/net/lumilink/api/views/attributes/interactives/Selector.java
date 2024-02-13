package net.lumilink.api.views.attributes.interactives;

import net.lumilink.api.lib.Color;

public class Selector {

    public abstract class Color extends Interactive {

        final public void onInteract(Object obj) {
            onInteract((Color) obj);
        }

        public abstract void onInteract(Color color);
    }

}
