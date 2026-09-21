package caio.cb.calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    @GetMapping("/ola")
    public String ola() {
        return "ola, devTools cb nc";
    }
}
