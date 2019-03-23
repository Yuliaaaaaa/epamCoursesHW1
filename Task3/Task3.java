package epamCourses.hw1.Task3;

public class Task3 {

    public static void task3(){
    byte byteNum = Byte.MAX_VALUE;
    short shortNum = Short.MAX_VALUE;
    int intNum = Integer.MAX_VALUE;
    long longNum = Long.MAX_VALUE;

    countBits(byteNum, "Byte");
    countBits(shortNum, "Short");
    countBits(intNum, "Int");
    countBits(longNum, "Long");
}


    public static void countBits(long number, String type){
        byte count = 1;

        long test = number;
        do{
            test = test>>1;
            count++;
        }
        while(test!=0);

        System.out.println(type + " has " + count + " bits");
    }

    public static void main(String[] args) {
        task3();
    }
}
