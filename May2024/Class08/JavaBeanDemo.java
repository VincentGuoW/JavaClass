package May2024.Class08;

import java.util.Scanner;

public class JavaBeanDemo {
    //registration page => username; password; confirm password; email; gender; age

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Registration r = new Registration();

        System.out.println("UserName:");
        r.setUsername(sc.next());

        System.out.println("Password:");
        r.setPassword(sc.next());

        System.out.println("Confirm Password:");
        r.setConfirmPassword(sc.next());
        
        System.out.println("Gender:");
        r.setGender(sc.next().charAt(0));

        System.out.println("Age:");
        r.setAge(sc.nextInt());
       

        System.out.println("Username: "+ r.getUsername());
        System.out.println("Password: "+ r.getPassword());
        System.out.println("Gender: "+ r.getGender());
        System.out.println("Age: "+ r.getAge());
    }
}
