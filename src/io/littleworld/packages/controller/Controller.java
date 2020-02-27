package io.littleworld.packages.controller;


import io.littleworld.packages.service.Service;

public class Controller {
    Service service = new Service();

    public String control() {
        return service.service();
    }
}
