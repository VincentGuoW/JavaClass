package June2024.Class05;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<UserBean> userList = new ArrayList<UserBean>();
        database(userList);
        while (true) {
            System.out.println("Welcome to login page");
            System.out.println("Please pick your choice:");
            System.out.println("1. login 2. register 3. forgetpassword 4. logout");
            System.out.println("Your choice:");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(userList);
                case "2" -> register(userList);
                case "3" -> forgetpassword(userList);
                case "4" -> logout();
                default -> System.out.println();
            }
        }
        
    }

    private static void login(ArrayList<UserBean> userList) {

    }

    private static void register(ArrayList<UserBean> userlList) {
        UserBean newUser = new UserBean();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please input username");
            String usernameInput = sc.next();
            boolean flag1 = checkUsername(usernameInput);
            boolean flag2 = uniqueUsername(usernameInput,userlList);
            if (flag1 && flag2) {
                System.out.println("GOOD");
                break;
            } else {
                System.out.println("WRONG");
                continue;
            }
        }
        while(true){
            System.out.println("Please input password");
            String password = sc.next();
            System.out.println("Please input password again");
            String passwordAgain = sc.next();
            if(password.equals(passwordAgain)){
                System.out.println("GOOD");
                break;
            }
        }
        while(true){
            System.out.println("Please input ID");
            String personID = sc.next();
            boolean flag1 = checkPersonID(personID);
        }
    
    }

    private static boolean uniqueUsername(String usernameInput,ArrayList<UserBean> userList) {
       for (int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getUsername().equals(usernameInput)){
                return false;
            }
       }
        return true;
    }

    private static boolean checkUsername(String usernameInput) {
        int length = usernameInput.length();
        if (length < 3 || length > 15) {
            return false;
        }
        for (int i = 0; i < usernameInput.length(); i++) {
            char c = usernameInput.charAt(i);
            if (!((c > 'a' && c < 'z') || (c > 'A' && c < 'Z') || (c > '0' && c < '9'))) {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < usernameInput.length(); i++) {
            char c = usernameInput.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    private static void forgetpassword(ArrayList<UserBean> userlList) {

    }

    private static void logout() {

    }

    private static ArrayList<UserBean> database(ArrayList<UserBean> userList) {
        userList.add(new UserBean("1", "1", "1", "1"));
        userList.add(new UserBean("2", "2", "2", "2"));
        userList.add(new UserBean("3", "3", "3", "3"));
        userList.add(new UserBean("4", "4", "4", "4"));
        return userList;
    }
}
