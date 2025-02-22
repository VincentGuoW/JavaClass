package A202502Feb2024.Class02;

import java.util.ArrayList;

//Diff between <E> & <?>

public class GenericsDemo6 {
    public static void main(String[] args) {
    };

    /*
     * Major diff between <?> & <E>
     * 1.
     * <?> only need once ==>
     *      public static void method1(ArrayList<?> inpuList) {    }
     * <E> need twice  ==>
     *      public static<E> void method2(ArrayList<E> inpuList) {    }
     * 
     * 2.
     * <E> has type so as long as the type remain the same, we can use add
     * but <?> is just a simple and fast way, works for any time
     * but they don't record any type.
     * <?> can NOT use add ==>
     *          public static void method3(ArrayList<?> inpuList, String e) {
     *      inpuList.add(e); ERROR ERROR
     * <E> can use add  ==>
     *          public static<E> void method4(ArrayList<E> inpuList,E e)
     *      inpuList.add(e);
     */

    public static void method1(ArrayList<?> inpuList) {    }
    public static<E> void method2(ArrayList<E> inpuList) {    }
    public static void method3(ArrayList<?> inpuList, String e) {  
    //public static void method3(ArrayList<?> inpuList, ? e) {  ? e can not be use
        inpuList.add(null);
        //inpuList.add(e); 
        //we can't add detail value inside since <?> cant be define
        //<?> just a fast way but also lost ability as<E>
    }
    public static<E> void method4(ArrayList<E> inpuList,E e) {  //E e is fine  
        inpuList.add(null);
        inpuList.add(e);
        
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
