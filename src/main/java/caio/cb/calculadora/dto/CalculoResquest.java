package caio.cb.calculadora.dto;

public class CalculoResquest {
    public record  CalculoRequest(double numero1, double numero2, String operador){

    }
    public record CalculoResponse(double resultado){

    }
}
