package May2024.Class08;

public class Registration {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;
    private char gender;
    private int age;
    //FAST KEY = => right click source action
    public Registration(){

    }
    public Registration(String username,String password,String confirmPassword,char gender,int age){
        setUsername(username);
        setPassword(confirmPassword);
        setConfirmPassword(confirmPassword);
        setGender(gender);
        setAge(age);
    }

    //set username
    public void setUsername(String username){
        this.username=username;
    }
    //get username
    public String getUsername(){
        return this.username;
    }
    //set password
    public void setPassword(String password){
        this.password=password;
    }
    //get password
    public String getPassword(){
        return this.password;
    }
    //set confirmPassword
    public void setConfirmPassword(String confirmPassword){
        if(confirmPassword==this.password){
            this.password=confirmPassword;
        }
        else{
            this.password=null;
            System.out.println("Password doesn't match");
        }   
    }
    //get confirmpassword
    //email
    //set gender
    public void setGender(char gender){
        this.gender = gender;
    }
    //get gender
    public char getGender(){
        return this.gender;
    }
    //set age
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }




}
