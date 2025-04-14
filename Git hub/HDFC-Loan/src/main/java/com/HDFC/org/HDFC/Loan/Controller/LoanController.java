package com.HDFC.org.HDFC.Loan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/getPlans")

    public  String getPlans(){
        return "Get Insurance Plans";
    }

}
