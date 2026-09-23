package caio.cb.calculadora.controller;

import caio.cb.calculadora.dto.CalculoRequest;
import caio.cb.calculadora.dto.CalculoResponse;
import caio.cb.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calcular")
public class CalculadoraController {
    private final CalculadoraService calculadoraService;
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    @PostMapping
    public CalculoResponse calcular(@RequestBody CalculoRequest request){
        double resultado = calculadoraService.calcular(request.numero1(), request.numero2(), request.operador());
        return new CalculoResponse(resultado);
    }
}
