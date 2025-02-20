package A202502Feb2024.Class02;

import java.util.ArrayList;

//Diff between <E> & <?>

public class GenericsDemo6 {
    public static void main(String[] args) {
        ArrayList<Grandpa> gpa = new ArrayList<>();
        ArrayList<Dad> dad = new ArrayList<>();
        ArrayList<Son> son = new ArrayList<>();
        ArrayList<student> student = new ArrayList<>();
        ArrayList<Integer> intlist = new ArrayList<>();
        ArrayList<?> smaple1 = new ArrayList<>();
      

    };

    public static void method1(ArrayList<?> inpuList) {

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
