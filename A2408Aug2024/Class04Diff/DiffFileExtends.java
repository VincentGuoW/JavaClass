package A2408Aug2024.Class04Diff;

import A2408Aug2024.Class04.SampleDemo;

public class DiffFileExtends extends SampleDemo {
    public void show(){
        System.out.println(name);//can't use private from extends file

        System.out.println(age);// empty access modifiers can't be use in diff class under extends folder
    
        System.out.println(gender);// extentend can use protected value
        System.out.println(gender2);

    }
    public static void main(String[] args) {
        System.out.println(name);//can't use private from extends file

        System.out.println(age);// empty access modifiers can't be use in diff class under diff folder

        System.out.println(gender);
        System.out.println(gender2);// We can't use non static variable in static class


        SampleDemo sd = new SampleDemo();
        sd.show();//can't use private from extends file
        
        sd.showAge();// empty access modifiers can't be use in diff class under diff folder
    }
    

    //can't use private from extends file
}
