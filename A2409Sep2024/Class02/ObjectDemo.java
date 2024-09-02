package A2409Sep2024.Class02;

public class ObjectDemo {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        String s2 = "abc";
        /* Understand String.equals works==>
         public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            return (anObject instanceof String aString)
                    && (!COMPACT_STRINGS || this.coder == aString.coder)
                    && StringLatin1.equals(value, aString.value);
        }
        ==> s.equals means String using equals method under the String class,
        ==> go String class and looking for it,
        ==> we find out the first step is to check their address, 
        ==> if its the same return true,
        ==> if false go down
        ==> then we go to return (anObject instanceof String aString)
        ==> check input anObject instanceof String aString
        */
        //How instanceof works / means =>
        if(s instanceof String){
            //understand as ==> if(s==String tpye)
            System.out.println("S is String type");
        }
        /* 

        ==> anobject is String type(Cus this euqals is under String type!!!!)
        ==> only if the input is string type, then check the value.
        
        */
        System.out.println(s.equals(sb));

        /* Understand StringBuilder.equals ==>
        When we go StringBuilder, they dont have equals methods.
        All the way until Object, so StringBuilder are getting equals methods from Object.
        In Object =>
                    public boolean equals(Object obj) {
                        return (this == obj);
                    }
        The Obeject are checking their address, not the value inside.
        So that we understand StringBuilder.equals are checking their address not value.
        */

        System.out.println(sb.equals(s));
        System.out.println(s.equals(s2));
        /*Override equals()
        After check online, override equals() is pretty common in real life.
        But if we want to use the original equals(). We can use super.equals();
        */
        

    }
}
