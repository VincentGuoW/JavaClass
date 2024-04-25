package April2024.Class14;

public class NumberAndString {
    public static void main(String[] args) {
        System.out.println(1+2+"a"+2+1);
        System.out.println(1+2+'a'+2+1);
        System.out.println(1+2+"a"+'2'+1);
        System.out.println(1+"2"+"a"+"2"+1);

        int x = 10;
        System.out.println("x=" + x);
        System.out.println(" "); //x=10 to start with

        int y = x++;
        System.out.println("x=" + x);// when x++ they do it from left to right y = old x first!!!
        System.out.println("y=" + y);//after y = old x, then do x++
        System.out.println(" ");// so that we get y=10 first, then the new x=11;

        int z = ++x;
        System.out.println("x=" + x);// still read it from left to right.
        System.out.println("y=" + y);// so we have to do ++ before get to x
        System.out.println("z=" + z);// there for when we calcuate for z, we are waiting for ++x to get done first.
        System.out.println(" ");

        int a = 10;
        a=++a;
        System.out.println(a);//a=11
    
        /*b=b++; will not work! a will = 10;
        
        1. b=>10     => 
        2. b=b=>10   =>
        3. b++=>11  *But!! b++=11 never saved into the system!
        4. when we asking for b, it will only get the closest one which is b=b=10;
        
        Think of when b=b++; when b already got feed with the old b(b=10), 
        the new b(b++) has no where to go, so it got abandoned.
        */
        int b = 10;
        b=b++;
        System.out.println(b);
        int c=b++;
        System.out.println(c); //c got feed with the old b. witch is 10;
        System.out.println(b); // no one feed b yet, 
                    //so b++ have place to save it, so b become 11;

        /*
         if a>0 ...
         else if a<10 ...
         else ...

         if i put a=9 in, it will only go into a>0, and never get in touch with
         (else if a<10 ...), cus when the first case work, it will just move on,
         they won't go through all the options.
         
         */



    }
}
