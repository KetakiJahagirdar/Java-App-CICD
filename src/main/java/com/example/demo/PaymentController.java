package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/payment")
    public String payment() {
        return "Payment Processed";
    }
    @GetMapping("/slow")
public String slow() throws InterruptedException {
    Thread.sleep(3000);
    return "slow response";
}
}
