package A202502Feb2025.Class02;

import java.util.ArrayList;

public class GenericsDemo4 {

    //Request: Need a method // input is an ArrayList with unknow data type

    public static void main(String[] args) {
        ArrayList<Grandpa> gpa = new ArrayList<>();
        method(gpa);
        ArrayList<Dad> dad = new ArrayList<>();
        method(dad);
        ArrayList<Son> son = new ArrayList<>();
        method(son);

        ArrayList<student> students = new ArrayList<>();
        method(students);

    }

    public static<E> void method(ArrayList<E> inpuList){

    }
}

class Grandpa {
};

class Dad extends Grandpa {
};

class Son extends Dad {
};

class student{
    
};
