package May2024.Class07;

import java.lang.ProcessHandle.Info;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    
    public GirlFriend(){   
    }
    /*
        1.auto creative, but if we have GirlFrind(input) => GirlFrind() must write manually.
        2.automaticly run, when ever we use this class, public ClassName will run automatically same time.
    */ 
    public GirlFriend(int age){//if we have input use this, is empty use GirlFriend(); auto pick
        setAge(age);
    }

    public void setAge(int age){
        if(age>=18){
            this.age = age;
        }
        else{
            System.out.println("Under age");
        }
    }
    public int getAge(){
        return this.age;//get use to use this.xxx . If getting from the class use this.xxx
    }
}
