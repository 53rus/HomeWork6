public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Task 3");
        for (int i = 0; i < 17; i=i+2){
            if (i>0);
            System.out.println(i);
        }
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println("год " + i + " високосный");
        }
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
        System.out.println("Task 8");
        int total = 0;
        int contribution = 29000;
        for (int i = 1; i <=12 ; i++){
            total = total + contribution;
            System.out.println("Месяц " + i + " накопления " + total);
        }
        System.out.println("Task 9");
        total = 0;
        contribution = 29000;
        for (int i = 1; i <=12 ; i++) {
            total = total + total / 100;
            total = total + contribution;
            System.out.println("Месяц " + i + " накопления " + total);
        }
        System.out.println("Task 10");
        int numberTwo = 0;
        int numberOne = 2;
        int result = 0;
        for (int i = 1; i <=10 ; i++) {
            numberTwo = numberTwo + 1;
            result= numberOne * numberTwo;
            System.out.println(numberOne + "*" + numberTwo + "=" + result);
        }
    }
}