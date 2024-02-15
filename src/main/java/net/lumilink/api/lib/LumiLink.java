package net.lumilink.api.lib;

public final class LumiLink {

    private static Server server;

    private LumiLink() {
    }

    public static void log(String s){
        server.log(s);
    }

    public static void setServer(Server server){
        LumiLink.server = server;
    }
}
