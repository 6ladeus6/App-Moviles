import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int nTire;
        double PriceForTire,PriceTotal;

        System.out.println("Ingrese la cantidad de llantas compradas");
        nTire = inputData.nextInt();

        if (nTire < 5){
            PriceForTire = 30000;
        }else if ((nTire >= 5) && (nTire <= 10)){
            PriceForTire = 25000;
        }else{
            PriceForTire = 20000;
        }
        PriceTotal = nTire * PriceForTire;
        System.out.println("El valor total a pagar es: $ " + PriceTotal);
        System.out.println("EL valor unitario por llanta es: $ " + PriceForTire);

    }

}
