package net.lumilink.api.lib;

public class Color {
    private int r, g, b, a;

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public Color(int r, int g, int b) {
        this(r, g, b, 1);
    }

    public Color(int r, int g, int b, int a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }
}
