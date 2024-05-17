package May2024.Class18;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        String username = "VincentGuo";
        String password = "Password";
        int maxTry = 3;
        boolean loginSuccess=false;
        for (int i = 0; i < maxTry; i++) {
            loginSuccess=login(username, password);
            if(loginSuccess){
                System.out.println("Hi "+username+", welcome!");
                break;
            };
            System.out.println("Wrong username or password!");
            System.out.println("*******************");
        }
        if(!loginSuccess){
            System.out.println("Over "+maxTry+" times of trying, please come back tomorrow!");
        };
       
    }

    public static boolean login(String username, String password){
        boolean loginSuccess = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your username: ");
        String usernameInput = sc.next();
        System.out.println("Please input your password: ");
        String passwordInput = sc.next();
        if(usernameInput.equalsIgnoreCase(username) && passwordInput.equalsIgnoreCase(password)){
            loginSuccess=true;
        }

        return loginSuccess;
        //test test 1231
    }
}
