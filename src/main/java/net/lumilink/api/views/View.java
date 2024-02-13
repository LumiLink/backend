package net.lumilink.api.views;

import net.lumilink.api.views.attributes.ViewAttribute;

import java.util.ArrayList;
import java.util.List;

public abstract class View {
    private final List<ViewAttribute> attributes;
    private final String title;

    public View(String title) {
        this(title, new ArrayList<ViewAttribute>());
    }

    public View(String title, List<ViewAttribute> attributes) {
        this.attributes = attributes;
        this.title = title;
    }

    public void addAttribute(ViewAttribute attribute){
        attributes.add(attribute);
    }
}
