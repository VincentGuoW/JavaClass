package May2024.Class06.ThisDemo;

public class GirlFriend {
    /*
        when ever use this.  => means they are looking around in the whole class!!
     */
    private int age;
    private double height;
    private String name;

    //set
    public void setAge0(int test){
        age=test;  //not suggest. If use static one, get use to this.get               
        //age looking for local first, but if local doesnt have age, it will still go for the static one.
    }
    public  void setAge1(int age){ //!!!! no static ！!!!
        age=age;//never get to the static age, only input=input.
        
    }
    public void setAge2(int age){ //!!!! no static ！!!!
       
        this.age=age;   //This only in non static  cus they need to get 
    }

    public void setAge4(int test){
        this.age=test;  //this works, but try to name it the same so easy to read.
    }
    //get
    public int getAge(){
        return  age;
    }
    


}
