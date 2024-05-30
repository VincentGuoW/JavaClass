package May2024.Class21;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Students> studentList = new ArrayList<>();
        
        Students s1 = new Students("Vincent",23);
        Students s2 = new Students("TOM",13);
        Students s3 = new Students("SAM",25);
        Students s4 = new Students("HENRY",19);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Student Name: "+studentList.get(i).getName());
        }
    }
}
