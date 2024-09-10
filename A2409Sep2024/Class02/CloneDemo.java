package A2409Sep2024.Class02;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println();
        int[] data = {1,2,3,4,5,6,7,8,9};
        User u1 = new User(1, "TOM", "PASSWORD", "C\\TEST\\TEST.EXE", data);

        //Need override the clone method.
        //Implements cloneable.
        //==> created new object and use clone method.
        User u2 = (User)u1.clone();

        u2.setUsername("Henry");

        int[] arr = u1.getData();
        System.out.println("ARR SAMPLE: "+arr);
        System.out.println("U1 SAMPLE: "+u1.getData());
        System.out.println("U2 SAMPLE: "+u2.getData());
        arr[0]=100;


        System.out.println(u1);
        System.out.println(u2);

        
        /*
         Q1. Why Override clone in User class?
            Cus user class has data. And it will be saved as an address.
            If we don't override EACH Instance Variable they will use the same for each clone.
            So we have to override Instance Variable for Deep Clone.
            Shallow Clone just override it to use it. Cus protected class.
         Q2. implements Cloneable whats that for in User class?
            for java to realize this is cloneable 
         Q3. throws CloneNotSupportedException in Clone demo class?
            cus I used clone method
         Q4. Why String toString() in User class will make the System.out.println => from address to strings
            just consider its like override
         */


         /*
         Shallow Clone(simple) 
            When use super.clone(). Dont override clone();
            E.g.:
                U1.getdata SAMPLE: [I@2f92e0f4
                U2.getdata SAMPLE: [I@2f92e0f4
        
         Deep Clone()
            Need to override clone(), cus we want each one have their own address.
            E.g.:
                U1.getdata SAMPLE: [I@2f92e0f4
                U2.getdata SAMPLE: [I@2f92e0f4


          */
    }
}
