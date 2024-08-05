package May2024.Class21;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> studentList = new ArrayList<>();
        while (true) {
            System.out.println("Please input student Name: ");
            String studentName = sc.nextLine();

            System.out.println("Please input student Age: ");
            int studentAge = sc.nextInt();
            sc.nextLine();
            //e.g. "15/n" will be my enter, but they only take 15 for this section
            //so need sc.nextLine() to receive the "/n", since we don't need it. Just live it here.

            Students newStudent = new Students(studentName,studentAge);
            studentList.add(newStudent);

            System.out.println("You done?(Y/N)");
            String finish = sc.nextLine();
            //String finish = sc.next(); next will only take string, but "/n". it will pass to the next section
            //sc.nextLine();
            System.out.println();

            if(finish.equals("Y")){ break;}
        }
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Student Name: "+studentList.get(i).getName()+
            " ; Student Age: "+studentList.get(i).getAge()+"!");
        }


    }
}
