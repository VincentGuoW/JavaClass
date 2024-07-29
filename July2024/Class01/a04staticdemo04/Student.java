package July2024.Class01.a04staticdemo04;

public class Student {
    String name;
    int age;
    static String teacherName;

    // public void infoShow(){
    //     System.out.println(name + " , " + age +  " , "  + teacherName);
    // }

    //"Student this" ==> address ==>  who ever use it.(s1, s2, s3....)
    public void infoShow(Student this){
        System.out.println("This address: "+this);
        System.out.println(name + " , " + age +  " , "  + teacherName);
        //method();
        this.method();
        //s1.method(), s2.method(), s3.method()ww
    }

    public static void method(){
        System.out.println(teacherName);//Use static value is fine.

        //For static method, you can't use non static info,
        //Cus you can't define which one you are using(can be s1, s2, s3....) e.g.
        //System.out.println(age);
        //System.out.println(this.age);

        System.out.println("Utility class!");
    }
}
