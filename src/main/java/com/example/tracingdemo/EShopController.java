package com.example.tracingdemo;

import io.jaegertracing.Configuration;
import io.jaegertracing.internal.JaegerTracer;
import io.opentracing.Span;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class EShopController {

    private JaegerTracer tracer;

    @PostConstruct
    public void init() {
        tracer = Configuration.fromEnv("EShop").getTracer();
    }

    @RequestMapping("/checkout")
    public String checkout() {
        Span span = tracer.buildSpan("checkout").start();
        String result = "You have successfully checked out your shopping cart.";
        span.finish();
        return result;
    }
}
