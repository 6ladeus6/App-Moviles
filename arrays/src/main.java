import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int[] numero = {5, 7, 8, 10, 12};
        int dato = numero[3];
        //System.out.println(numero[2]);
        //numero[2] = 6;
        //System.out.println(numero[2]);
        //System.out.println("resultado: " + dato * 2);

       // for (int i = 0; i < 5; i++){
            //System.out.print("resultado: " + numero[i] + " , ");
       // }
        int number;
        Scanner InputData = new Scanner(System.in);
        String aux ="";
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero de comensales: " + (i+1));
            number = InputData.nextInt();
            numero[i] = number;
            aux = aux + "," + number;
        }
        System.out.println("Los datos del arreglo son: " + aux);
    }
}