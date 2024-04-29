package April2024.Class17;

public class switchBest {
    // use the switch pock through
    public static void main(String[] args) {
        //int inputNumber;// This is wrong, no value in side.
        int inputNumber = 3;
        

        //
        /*switch (inputNumber) {
            case 1:
                //if this is true and the result is the same as follow, we only need one result.
            case 2:
                // if true, move done
            case 3:
                System.out.println("This is a number");
                break;// stop moving at break.
            default:
                System.out.println("This is not a number in range 1-3");
                break;

        }

        switch (inputNumber) {// arrow form will not work with break, cus it inluce break inside
            case 1->{}
            case 2->{}
            case 3->{System.out.println("This is a number");}
            default->{System.out.println("This is not a number in range 1-3");}
        }
        
        
        switch (inputNumber) {// organize the same case result
            case 1,2,3:
                System.out.println("This is a number");
                break;
            default:System.out.println("This is not a number in range 1-3");
                break;
        }
        switch (inputNumber) {
            //just for fun, this is not workin cus arrow come with break even without braces
            // if input = 2, it will break and stop at case 2 for arrow style.
            case 1-> 
                inputNumber=inputNumber;
                
            case 2-> 
                inputNumber=inputNumber;
            case 3->System.out.println("This is a number");
            default->System.out.println("This is not a number in range 1-3");
        }

        switch (inputNumber) {// organize the same case result
            case 1,2,3->{System.out.println("This is a number");}
               
            default->{System.out.println("This is not a number in range 1-3");}
        }*/
        switch (inputNumber) {// no need braces if only one command 
            case 1,2,3->System.out.println("This is a number");
               
            default->System.out.println("This is not a number in range 1-3");
        }

        
    }

}
