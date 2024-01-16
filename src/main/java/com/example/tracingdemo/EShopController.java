package com.example.tracingdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EShopController {

    @RequestMapping("/checkout")
    public String checkout() {
        return "You have successfully checked out your shopping cart.";
    }
}
