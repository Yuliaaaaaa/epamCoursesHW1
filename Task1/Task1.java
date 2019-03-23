package epamCourses.hw1.Task1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task1 {
    public static void task1(){
        System.out.print("Insert number in binary look:\t");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.next();

            char[] number = str.toCharArray();

            int decimal = 0;
            for(int i = 0; i < str.length(); i++){
                decimal += Character.getNumericValue(number[i])*pow(2,str.length()-i-1);
            }

            System.out.println(decimal);

            System.out.println(Integer.parseInt(str,2));
        }

    }

    public static void main(String[] args) {
        task1();
    }
}
