package epamCourses.hw1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void task2(){
        System.out.print("Insert negative number, please:\t");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            int newNumber = (number^(-1));
            System.out.println("Positive number is  " + newNumber+1);
        }
    }

    public static void main(String[] args) {
        task2();
    }
}
