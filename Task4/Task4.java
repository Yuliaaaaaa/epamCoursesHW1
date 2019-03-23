package epamCourses.hw1.Task4;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class Task4 {
    public static int task4(int num1, int num2){
        int res = 0;
        int powOf2 = 0;
        do{
            while(num1%2==0 && num2%2==0){
                num1>>=1;
                num2>>=1;
                powOf2++;
            }
            if(num1>num2){
                res = num1%num2;
                num1 = res;
            }
            else{
                res = num2%num1;
                num2 = res;
            }
        }
        while(res!=0);
        return (max(num1, num2)*(1<<powOf2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number, please:\t");
        if(scanner.hasNextInt()) {
            int number1 = scanner.nextInt();
            System.out.print("Insert second number, please:\t");
            if(scanner.hasNextInt()) {
                int number2 = scanner.nextInt();
                System.out.print("Your NOD is " + task4(number1,number2));
            }
        }

    }
}
