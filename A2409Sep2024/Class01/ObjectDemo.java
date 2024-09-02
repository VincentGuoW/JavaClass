package A2409Sep2024.Class01;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        //print => object (String s = String.valueOf(x);)
        //valueof => return (obj == null) ? "null" : obj.toString();
        //obj.toString() => go student class and rewrite it
        /*
         use override to over write the Object toSthing() method.
         @Override
            public String toString() {
                return super.getName()+" , " + super.getAge();
            }
        */
        System.out.print(s1);

        Student s2 = new Student();

        System.out.println(s1.equals(s2));
    }
    
}
