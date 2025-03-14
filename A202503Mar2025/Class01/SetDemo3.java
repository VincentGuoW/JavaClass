package A202503Mar2025.Class01;

public class SetDemo3 {
    public static void main(String[] args) {
        System.out.println();
        Student1 s1 = new Student1("Tom",12);
        Student1 s11 = new Student1("Tom",12);
        Student2 s2 = new Student2("Tom",12);
        Student2 s22 = new Student2("Tom",12);
        Student1 s3 = new Student1();
        Student1 s33 = new Student1();

        /*
         * S1==> even same value will create diff hashcode
         * S2==> been rewrite hashcode, same value == same hashCode
         */
        System.out.println(s1.hashCode());   //681842940 
        System.out.println(s11.hashCode());  //1392838282
        System.out.println(s2.hashCode());   //2613467
        System.out.println(s22.hashCode());  //2613467
        System.out.println(s3.hashCode());   //1392838282
        System.out.println(s33.hashCode());  //523429237

        //Hash Collision (rare)
        System.out.println("abc".hashCode());   //96354     
        System.out.println("acD".hashCode());   //96354 
    }
}
