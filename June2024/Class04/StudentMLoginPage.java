package June2024.Class04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import April2024.Class13.practice;

public class StudentMLoginPage {
    public static void main(String[] args) {
        AccountDatabase ad = new AccountDatabase();
        loginLoop: while (true) {
            StartPage st = new StartPage();
            st.startPage();
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            sc.nextLine();
            switch (input) {
                case "1":
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Please input your username");
                        String usernameInput = sc.next();
                        sc.nextLine();

                        System.out.println("Please input your password");
                        String passwordInput = sc.next();
                        sc.nextLine();

                        String randomCode = ad.randomCode();
                        System.out.println("Please input the code: "+ randomCode);
                        String randomCodeInput = sc.next();
                        sc.nextLine();
                        if(randomCode.equals(randomCodeInput)){

                        }else{
                            continue;
                        }
                        if (ad.logIn(usernameInput, passwordInput)) {
                            System.out.println("Successfully logged in");
                            break loginLoop;
                        } else {
                            System.out.println("Wrong password/username");
                        }
                    }

                    break;
                case "2":
                    String username = "";
                    String password = "";
                    String id = "";
                    int phone = 0;
                    // username=>
                    System.out.println("Please input your username for register");
                    String usernameRegist = sc.next();
                    sc.nextLine();
                    if (ad.usernameRegist(usernameRegist)) {
                        username = usernameRegist;
                    } else {
                        System.out.println("Username must be letter and number mix");
                        break;
                    }
                    // password=>
                    System.out.println("Please input password");
                    String passwordFirst = sc.next();
                    sc.nextLine();
                    System.out.println("Please input password again");
                    String passwordSecond = sc.next();
                    sc.nextLine();
                    if (ad.passwordRegist(passwordFirst, passwordSecond)) {
                        password = passwordFirst;
                    } else {
                        System.out.println("Password must be the same");
                        break;
                    }
                    // ID =>
                    System.out.println("Please input your ID");
                    String idInput = sc.next();
                    sc.nextLine();
                    if (ad.idRegist(idInput)) {
                        id = idInput;
                    } else {
                        System.out.println(
                                "ID must be the 18 length, cant start with zero, last dig can be x X or number");
                        break;
                    }
                    // phone=>
                    System.out.println("Please input your phone");
                    String phoneInput = sc.next();
                    sc.nextLine();
                    if (ad.phoneRegist(phoneInput) != 0) {
                        phone = ad.phoneRegist(phoneInput);
                    } else {
                        System.out.println("Wrong phone number");
                        break;
                    }
                    System.out.println("Successful regist");
                    AccounetInfo newAccount = new AccounetInfo();
                    newAccount.setUsername(username);
                    newAccount.setPassword(password);
                    newAccount.setId(id);
                    newAccount.setPhone(phone);

                    ad.addAccountList(newAccount);

                    break;
                case "3":
                    System.out.println("Please input your username");
                    String resetUsername = sc.next();
                    sc.nextLine();
                    if (ad.resetPassword(resetUsername)) {
                        System.out.println("Account reset successful");
                    } else {
                        System.out.println("Please redo it");
                    }
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }

    }

}
