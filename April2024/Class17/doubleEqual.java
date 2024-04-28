package April2024.Class17;

public class doubleEqual {
    public static void main(String[] args) {
        int a =1;
        int b =2;
        boolean c;

        // =   give  value
        // ==  check value

        c=false; //give value to c.
        //if(a=2)System.out.println("yes1"+a);//wrong cus you just give value 
        if((a=2)==2)System.out.println("yes1"+a);
        if(c)System.out.println("yes1");
        if(c=true)System.out.println("yes1");// This is also wrong, cus we give new boolean
                                                //not check boolean!
        if(a==1)System.out.println("yes2"+a);   //check value
        //if(a+b=3)System.out.println("yes3"); // you can't give value to equation.
        if(a+b==3)System.out.println("yes4"); //

    }
}
