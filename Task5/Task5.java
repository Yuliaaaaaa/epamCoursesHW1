package epamCourses.hw1.Task5;

import java.util.Scanner;

public class Task5 {

    public static int task5(int num, byte pos){
        //int dividor = (int)pow(2,Integer.toBinaryString(num).length()-pos);
        int dividor = 1<<(Integer.toBinaryString(num).length()-pos);
        return num^dividor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number, please:\t");
        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.print("Insert position, please:\t");
            if (scanner.hasNextInt()) {
                int pos = scanner.nextInt();
                System.out.println("Your new number is " + task5(num, (byte)pos));
            }
        }
    }
}
