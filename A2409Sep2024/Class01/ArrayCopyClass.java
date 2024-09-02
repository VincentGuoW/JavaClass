package A2409Sep2024.Class01;

public class ArrayCopyClass {
    public static void main(String[] args) {
        Student s1 = new Student("SAM", 12);
        Student s2 = new Student("TOM", 13);
        Student s3 = new Student("LILI", 14);

        Student [] arr1 = {s1,s2,s3};
        Student [] arr2 = new Student[3];

        System.arraycopy(arr1, 0, arr2, 0, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].getName() + arr2[i].getAge());
        }

        System.out.println();

        Person [] arr3 = new Person[3];
        System.arraycopy(arr1, 0, arr3, 0, 3);
        for (int i = 0; i < arr3.length; i++) {
            // Student st = (Student)arr3[i];
            // System.out.println(st.getName() + st.getAge());
            System.out.println(arr3[i].getName() + arr3[i].getAge());
            
        }
    }
    
}
