package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {

    public  static  void  main (String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter name: ");
        String Name =scanner.nextLine();

        System.out.print("Enter Std ID: ");
        String Id =scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter tel: ");
        String tel =scanner.nextLine();

        System.out.print("Enter Email: ");
        String Email =scanner.nextLine();

        System.out.println(Name);
        System.out.println(Id);
        System.out.println(age);
        System.out.println(tel);
        System.out.println(Email);






    }//main


}//class
