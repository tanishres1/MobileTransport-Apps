package com.rapido.org.RapidoApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RapidoController {

    @GetMapping("/notification")
    public String  getNotification() {
        return "Rapido rider notification";
    }
    @GetMapping("/notification")
    public String  getAlert() {
        return "Rapido Alert";
    }
    @GetMapping("/rider")
    public String  getRider() {
        return "Rider added";
    }
}
