package May2024.Class03;

public class methodDemo5 {
    
    public static void main(String[] args) {
        //circleSize(3);
        double finalSize = circleSize(3);
        System.out.println("Final result"+finalSize);
        
        //System.out.println("Final result"+circleSize(3));

        return;
        // void able to use return, but useless.
    }

    //"public static " + "<return type(int/string/boolean)>" +"<method name>" + (input)

    public static double circleSize(double radius){
        double size = Math.pow(radius,2)*Math.PI;
        size = Math.round(size*10)/10;
        //System.out.println(size);
        return size;
    }

}
