package April2024.Class17;

public class swtichPlus {
    public static void main(String[] args) {
        int inputNumber = 1;

        /*switch (inputNumber) {
            case 1:
                System.out.println("Number1");
                break;

            case 2:
                System.out.println("Number2");
                break;

            case 3:
                System.out.println("Number3");
                break;
            // case 4 -> {
            //     System.out.println("Wrong");
            // }  cant not be in the same switch : and ->

            default:
                System.out.println("Wrong");
                break;
        }*/
    
        switch (inputNumber) {
            case 1 ->{
                System.out.println("Print number1");
            }
            case 2 -> System.out.println("Print number2"); // simple way if only one line!
            case 3 ->{
                System.out.println("Print number3");
            }
            default ->{
                System.out.println("Print wrong");
            }

        }
    
    }

}
