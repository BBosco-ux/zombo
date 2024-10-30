package smile;

import java.util.Scanner;
public class ScannersMain {
    static Scanner Sc = new Scanner(System.in);
    public static void main(String[]args){
//        System.out.println("enter ID value: ");
 //       int ID = Sc.nextInt();
  //      System.out.println(ID);
        menu();
    }
    static void menu(){
        while (true) {

            System.out.println("1-user menu");
            System.out.println("2-products menu");
            System.out.println("3-HR");
            System.out.println("4-exit");

            System.out.println("enter your choice: ");
            int choice = Sc.nextInt();

            if (choice == 1) {
                printusers();
            }
        }
    }
    static void printusers(){
        System.out.println("alex");
        System.out.println("john");
        System.out.println("deo");
    }
}
