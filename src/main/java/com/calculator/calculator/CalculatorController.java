package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator){
        this.calculator = calculator;
    }

    @GetMapping("/")
    public  String welcome (){
        return "Добро пожаловать в калькулятор";}
    @GetMapping("/plus")
    public String addition(@RequestParam int num1, @RequestParam int num2){
        return num1 + " + " + num2 + " = " + calculator.addition(num1, num2);
    }
    @GetMapping("/minus")
 public String subtraction(@RequestParam int num1, @RequestParam int num2){
     return num1 + " - " + num2 + " = " + calculator.subtraction(num1, num2);
 }
    @GetMapping("/multiply")
 public String multiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculator.multiplication(num1, num2);
    }
    @GetMapping("/divide")
 public String division(@RequestParam int num1, @RequestParam int num2) {
        if (num2==0){
            return "Ошибка: деление на ноль запрещено";
        }
     return num1 + " / " + num2 + " = " + calculator.division(num1 , num2);
 }


}
