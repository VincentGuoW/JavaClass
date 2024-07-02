package June2024.Class04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountDatabase {
    private ArrayList<AccounetInfo> accountList = new ArrayList<AccounetInfo>();

    public AccountDatabase(){
        accountList.add(new AccounetInfo("username1","password1","111111",111111));
        accountList.add(new AccounetInfo("username2","password2","222222",222222));
        accountList.add(new AccounetInfo("username3","password3","333333",333333));
        accountList.add(new AccounetInfo("username4","password4","444444",444444));
        accountList.add(new AccounetInfo("username5","password5","555555",555555));
    }
    public void addAccountList(AccounetInfo newAccountInfo){
        accountList.add(newAccountInfo);
    }

    public boolean logIn(String usernameInput, String passwordInput){
        boolean successLogin = false;
        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getUsername().equals(usernameInput) && accountList.get(i).getPassword().equals(passwordInput)){
                successLogin=true;
                return successLogin;
            }
        }
        return successLogin;
    }

    public boolean usernameRegist(String usernameRegist){
        boolean successRegist = false;
        //1. no same username 2. 3-15 lenght 3. letter and number mix
        for (int i = 0; i < accountList.size(); i++) {
            if(usernameRegist==accountList.get(i).getUsername()){
                return successRegist;
            }
        }
        if(usernameRegist.length()<3 ||usernameRegist.length()>15){
            return successRegist;
        }
        boolean withNumber = false;
        boolean withLetter = false;
        for (int i = 0; i < (usernameRegist.length()-1); i++) {
            char currentChar  = usernameRegist.charAt(i);
            if(currentChar>=48 && currentChar<=57){
                withNumber = true;
            }
            else if(currentChar>=65 && currentChar<=90){
                withLetter=true;
            }
            else if(currentChar>=97 && currentChar<=122){
                withLetter=true;
            }
            else{
                return successRegist;
            }
        }
        if(withNumber && withLetter){
            successRegist = true;
        }
        return successRegist;
    }

    public boolean passwordRegist(String passwordFirst, String passwordSecond){
        if(passwordFirst.equals(passwordSecond)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean idRegist(String idInput){
        boolean correctID = false;
        if(idInput.length()!=18){
            return correctID;
        }
        if(idInput.charAt(0)=='0'){
            return correctID;
        }
        for (int i = 0; i < 17; i++) {
            char currentChar = idInput.charAt(i);
            if(currentChar<'0' || currentChar >'9'){
                return correctID;
            }
        }
        char lastChar = idInput.charAt(17);
        if ((lastChar < '0' || lastChar > '9') && lastChar != 'x' && lastChar != 'X') {
            return correctID;
        }
        correctID = true;
        return correctID;
        
    }

    public int phoneRegist(String phoneInput){
        int phoneNumber = 0;
        if(phoneInput.length()!=11){
            return phoneNumber;
        }
        if(phoneInput.charAt(0)=='0'){
            return phoneNumber;
        }
        for (int i = 0; i < phoneInput.length(); i++) {
            char currentChar = phoneInput.charAt(i);
            if(currentChar<'0'|| currentChar>'9'){
                phoneNumber=0;
                return phoneNumber;
            }else{
                phoneNumber = phoneNumber*10*i+(currentChar-48);
            }
        }
        return phoneNumber;
    }


    public boolean resetPassword(String usernameInput){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <accountList.size(); i++) {
            if(accountList.get(i).getUsername().equals(usernameInput)){
                System.out.println("Please input your id");
                String inputID = sc.next();
                sc.nextLine();
                System.out.println("Please input your phone");
                int inputPhone = sc.nextInt();
                sc.nextLine();
                if(accountList.get(i).getId().equals(inputID) &&
                    accountList.get(i).getPhone()==(inputPhone)){
                        System.out.println("Please input new password");
                        String newPassword = sc.next();
                        sc.nextLine();
                        accountList.get(i).setPassword(newPassword);
                    return true;
                }
            }
            
        }
        return false;
    }

    public String randomCode(){
        String letterList = "ABCDEFGabcdefg";
        String numberList = "0123456789";

        Random rand = new Random();

        char digit = numberList.charAt(rand.nextInt(numberList.length()));

        StringBuilder letters = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            letters.append(letterList.charAt(rand.nextInt(letterList.length())));
        }
        String output = letters.toString() + digit;

        char[] outputChar = output.toCharArray();
        for (int i = 0; i < outputChar.length; i++) {
            char temp = outputChar[i];
            int randomeNumber= rand.nextInt(outputChar.length);
            outputChar[i]=outputChar[randomeNumber];
            outputChar[randomeNumber]=temp;
        }
        output = new String(outputChar);
        return output;
    }
}
