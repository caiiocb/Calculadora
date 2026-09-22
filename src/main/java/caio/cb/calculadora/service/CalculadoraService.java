package caio.cb.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public CalculadoraService(){
    }
    public double calcular(double valor1, double valor2, String operador){
        switch (operador){
            case "+":
                return soma(valor1, valor2);
            case "-":
                return subtracao(valor1, valor2);
            case "*":
                return multiplicacao(valor1, valor2);
            case  "/":
                return divisao(valor1, valor2);
            default:
                throw new IllegalArgumentException("Operador invalido" +  operador);
        }
    }
    public double soma(double num1, double num2){
        return num1 + num2;
    }
    public double subtracao(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    public double divisao(double num1, double num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Erro ao dividir por zero");
        }
        return num1 / num2;
    }
}
