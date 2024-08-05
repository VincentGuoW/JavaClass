package A2408Aug2024.Class02;

public class FinialDemo {
    
}


class Dad{
    // public  void  show(){
    //     System.out.println("This is class dad");
    // }

    //With finial, the following class been extended can't use anymore.
    //Final will be the last one. offen used in rules that you dont want people to change it

    public final void  show(){
        System.out.println("This is class dad");
    }
}

class son extends Dad{
    @Override
    public void show() {
        System.out.println("This is class son");
    }
}