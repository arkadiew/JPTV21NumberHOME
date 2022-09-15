/*
 *Пользователь вводит трехзначное число. 
 *Найдите:Число единиц, десятков. 
 *Сумму цифр
 *Для решения можно использовать арифметический оператор % 
 *-остаток от деления
 */
package jptv21number;

import java.util.Scanner;

public class JPTV21Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number(123): ");
        int number = scanner.nextInt();
        int numbersum = 0;
        int number1 = number/10%10;
        int number2 = number%10;
        while(number!=0) {
            numbersum+=number%10;
            number=number/10;
        }
        System.out.printf(String.join("единицы %d%n","десятки %d%n", "сумма %d%n"), number1, number2, numbersum);
      
        
        
        
        
        
        
       
    }
    
    }
