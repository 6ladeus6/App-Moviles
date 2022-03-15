import  java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in);
       int nScrewDef,nScrewPro,grade;
        System.out.println("Input Number Screw Defective: ");
        nScrewDef = inputData.nextInt();
        System.out.println("Input Number Screw Produced: ");
        nScrewPro = inputData.nextInt();
       if ((nScrewDef > 200) && (nScrewPro < 10000)){
           grade = 5;
       }else if (nScrewDef < 200){
           grade = 6;
       }else  if (nScrewPro > 10000){
           grade = 7;
       }else{
           grade = 8;
       }
        System.out.println("The grade of Operator its: " + grade);
    }
}
