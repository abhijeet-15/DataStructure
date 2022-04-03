package generic.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 94);
        Student s2 = new Student(12,97);

        Student abhijeet = new Student(1,94.4f);
        Student rahul = new Student(56,90f);
        Student ramesh = new Student(60, 87f);
        Student lokesh = new Student(45,66.0f);

        Student[] list = {abhijeet,rahul,ramesh,lokesh};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list); // sorts on the basis of marks because we mentioned that in comparator
                           // error otherwise

        // implement its own comparator as well
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks - o2.marks);
            }
        });

       // Arrays.sort(list, (o1, o2) -> (int) (o1.marks - o2.marks));



        System.out.println("Students after sorting");
        System.out.println(Arrays.toString(list));

        if(s1.compareTo(s2) > 0)
            System.out.println("S1 has more marks");
        else if(s1.compareTo(s2) < 0)
            System.out.println("S2 has more marks");
        else
            System.out.println("Same marks");

    }
}
