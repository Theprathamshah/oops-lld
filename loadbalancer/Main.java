package com.oops.loadbalancer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Load balancer started....");
        LoadBalancer lb = new LoadBalancer();
        lb.addServer("127.1.1.1",1);
        lb.addServer("127.1.1.3",1);
        lb.addServer("127.1.1.2",0);
        lb.getNextServer();
        lb.getNextServer();
        lb.getNextServer();
        lb.getNextServer();
        List<Server> serverList = lb.getServers();
        for (var s: serverList) {
            System.out.println(s.getServerIp() + " " + s.getServerLoad());
        }
    }
}
