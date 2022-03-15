import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int  num;
        String invertedNumber = "";
        System.out.println("Input Number: ");
        num = inputData.nextInt();
        while (num >= 10){
            invertedNumber = invertedNumber + num % 10;
            num = num / 10;
        }
        System.out.println("inverted number: " + invertedNumber + num);
    }
}
