package com.oops.loadbalancer;

public class Server {
    private int serverLoad;
    private String serverIp;
    public Server(int serverLoad, String serverIp) {
        this.serverIp = serverIp;
        this.serverLoad = serverLoad;
    }
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public int getServerLoad() {
        return serverLoad;
    }

    public void setServerLoad(int serverLoad) {
        this.serverLoad = serverLoad;
    }
    public void incrementServerLoad() {
        this.serverLoad++;
    }
}
