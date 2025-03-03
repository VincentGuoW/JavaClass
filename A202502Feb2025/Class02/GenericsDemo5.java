package A202502Feb2025.Class02;

//Request: Need a method 

import java.util.ArrayList;

//Input is an ArrayList with data type only extends from Grandpa

public class GenericsDemo5 {
    public static void main(String[] args) {
        ArrayList<Grandpa> gpa = new ArrayList<>();
        ArrayList<Dad> dad = new ArrayList<>();
        ArrayList<Son> son = new ArrayList<>();
        ArrayList<student> student = new ArrayList<>();
        ArrayList<Integer> intlist = new ArrayList<>();
        ArrayList<?> smaple1 = new ArrayList<>();
        //ArrayList<> smaple2 = new ArrayList();
        method1(gpa);
        method1(dad);
        method1(son);
        method1(student);
        method1(intlist);




        method2(gpa);
        method2(dad);
        method2(son);
        method2(student);
        method2(intlist);



        method3(gpa);
        method3(dad);
        method3(son);
        // method3(student); Method2 can only use extends Grandpa input

    };

    public static void method1(ArrayList<?> inpuList) {

    }

    public static <E> void method2(ArrayList<E> inpuList) {

    }

    //<? extends Grandpa> ==> Grandpa and all the extends
    public static void method3(ArrayList<? extends Grandpa> inpuList) {

    }

    //ArrayList<? super Son> == Dad and anything above it(Dad+Grandpa)
    public static void method4(ArrayList<? super Dad> inpuList) {

    }

}

class Grandpa {
};

class Dad extends Grandpa {
};

class Son extends Dad {
};

class student {

};
