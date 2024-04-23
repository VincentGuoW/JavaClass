package April2024.Class2;
//Able to find packages under the Class2 package.
//For this case, Hello.java is under Class2 package, and Test.java able to use it.(If it's public)


public class BasicUnderstanding {
    // "BasicUnderstanding" class is part of the Class2 package
    // public --> Access modifier. Able to access from any other class.
    // class  --> Consider it's a whole group/type of varibles and methods.


    public static void basicUnderstanding(String args[]){
        //public --> Access modifier. Able to access from any other class.
        //static --> Static method(non-static/instance just empty)
        //void   --> Return type. Do not return any value. 
                        //(`int`; `boolean`; `String` if I want return somthing diff) 
        //basicUnderstanding    --> This is a name of this class. 
            //If I want to run it in java must use main as a name!!!
        //String args[]  --> args == arguments



        Hello obj1; //This is a Variable! (This is a hellow variable)
        int obj2;   //This is also a Variable!(int variable)
    }
}
