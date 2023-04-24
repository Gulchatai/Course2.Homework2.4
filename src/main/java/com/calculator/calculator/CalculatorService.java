package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    @Override
   public int addition(int num1, int num2){
       return num1 + num2;
   }
   @Override
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
    @Override
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    @Override
    public int division(int num1, int num2){
    //  if (num2==0){
   //    return "Ошибка: деление на ноль запрещено";
     // }
       return num1 / num2;
    }
}
