package br.com.jonasmt7.controllers;

import br.com.jonasmt7.exception.UnsupportedMathOperationException;
import br.com.jonasmt7.math.SimpleMath;
import br.com.jonasmt7.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable("n1") String n1,@PathVariable("n2") String n2){

        if(!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }
}
