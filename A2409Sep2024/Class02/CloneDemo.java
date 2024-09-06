package A2409Sep2024.Class02;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println();
        int[] data = {1,2,3,4,5,6,7,8,9};
        User u1 = new User(1, "TOM", "PASSWORD", "C\\TEST\\TEST.EXE", data);

        Object u2 = u1.clone();

        System.out.println(u1);
        System.out.println(u2);

        
        /*
         Q1. Why Override clone in User class?
         Q2. implements Cloneable whats that for in User class?
         Q3. throws CloneNotSupportedException in Clone demo class?
         Q4. Why String toString() in User class will make the System.out.println => from address to strings
         */
    }
}
