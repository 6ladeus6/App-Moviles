import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner intPut = new Scanner(System.in);
        int n,i;
        System.out.println("Input N: ");
        n = intPut.nextInt();
        for (i = 0;i<= n;i++){
            if (i % 2 == 0 ){
                System.out.println("number par is: " + i);
            }
        }
    }
}
