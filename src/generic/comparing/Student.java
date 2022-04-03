package generic.comparing;

public class Student implements Comparable<Student> {
    int rno;
    float marks;

    public Student(int rno, float marks){
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        //diff is 0 if both this(calling object) and o(to which it is compared) have the same marks
        // diff < 1 means that this has lower marks than o else this has higher marks
        return diff;
    }
}
