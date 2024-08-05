package A2408Aug2024.Class01.MainFile;

import A2408Aug2024.Class01.DiffFile.Teacher;
//Can not import package with same name, computer don't know which teacher we are talking about
//import A2408Aug2024.Class01.DiffFile2.Teacher;


public class PackageDemo1 {
    public static void main(String[] args) {
        Student s = new Student();
        //package Student under the same file, no need for import
        s.setAge(10);
        s.setName("Vincent");
        System.out.println("Age: " + s.getAge());
        System.out.println("Name: " + s.getName());

        //String package belong to java.lang. no need for import
        String sample = "sample String";
        System.out.println(sample);

        //Teacher under different file, so It NEED Import
        Teacher t = new Teacher();
        t.setAge(0);
        t.setName("Teacher name");

        A2408Aug2024.Class01.DiffFile2.Teacher t2 = new A2408Aug2024.Class01.DiffFile2.Teacher();
   
    }
}
