package sample;
import java.util.Scanner;

/**
 * Created by user on 1/24/2017.
 */
public class Name {
    public static void main(String[] args) {
        System.out.println("Please enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        System.out.print("Congratulation Mr/Mrs/Miss ");
        for (int i=name.length()-1;i>=0;i--){
            char c = name.charAt(i);
            System.out.print(c);
        }
        //System.out.print("Congratulation Mr/Mrs/Miss " + c);
    }
}
