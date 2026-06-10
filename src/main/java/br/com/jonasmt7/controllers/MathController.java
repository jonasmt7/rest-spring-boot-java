package br.com.jonasmt7.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable("n1") String n1,@PathVariable("n2") String n2){

        if(!isNumeric(n1) || !isNumeric(n2)) throw new IllegalArgumentException();
        return convertToDouble(n1) + convertToDouble(n2);
    }

    private Double convertToDouble(String n2) {
        return 1D;
    }

    private boolean isNumeric(String number) {
        return false;
    }
}
