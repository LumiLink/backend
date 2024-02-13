package net.lumilink.api.views.attributes.interactives;

import net.lumilink.api.views.attributes.ViewAttribute;

abstract class Interactive extends ViewAttribute {
    public Interactive(String id) {
        super(id);
    }

    public abstract void onInteract(Object obj);
}
