package net.lumilink.api.views.attributes;

import java.util.UUID;

public abstract class ViewAttribute {
    private String css;
    private String id;

    public void setCss(String css) {
        this.css = css;
    }

    public String getId() {
        return id;
    }

    public ViewAttribute(String id) {
        this.id = id;
    }
}
