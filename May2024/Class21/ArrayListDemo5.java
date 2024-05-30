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
            Students newStudent = new Students(studentName,studentAge);
            studentList.add(newStudent);
            System.out.println("You done?(Y/N)");
            String finish = sc.next();
            if(finish.equals("Y")){ break;}
        }
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Student Name: "+studentList.get(i).getName()+
            " ; Student Age: "+studentList.get(i).getAge()+"!");
        }


    }
}
