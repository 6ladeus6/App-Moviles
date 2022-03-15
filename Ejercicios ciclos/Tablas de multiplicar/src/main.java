import  java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int number,i;
        System.out.println("input number: ");
        number = inputData.nextInt();
        for (i = 0;i <= 10;i++){
            System.out.println(number + "X" + i + "=" + number * i);
        }
    }
}
