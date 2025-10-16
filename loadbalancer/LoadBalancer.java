package com.oops.loadbalancer;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
    private List<Server> servers;
    public LoadBalancer() {
        this.servers = new ArrayList<>();
    }
    public void addServer(String ipAddress, int currentLoad) {
        servers.add(new Server(currentLoad, ipAddress));
    }
    public List<Server> getServers() {
        return servers;
    }

    // Method to get the next server IP address using minimum-load strategy
    public String getNextServer() {
        if (servers.isEmpty()) {
            throw new IllegalStateException("No servers available in the load balancer.");
        }

        Server minLoadServer = servers.get(0);
        for (Server server : servers) {
            if (server.getServerLoad() < minLoadServer.getServerLoad()) {
                minLoadServer = server;
            }
        }

        minLoadServer.incrementServerLoad();

        return minLoadServer.getServerIp();
    }
}
