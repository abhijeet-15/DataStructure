package OOPS;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
       // student.name = "Shiva";

        System.out.println(student.name);
        System.out.println("Printing the object directly..." + student);

        final Student student1 = new Student();
        student1.name = "allowed";

        Student student2 = new Student();
      //  student1 = student2;

        for(int i = 0; i < 100000; i++)
            student2= new Student();
    }


//    @Override
//    public String toString(Student student){
//        System.out.println("overiding toString");
//        System.out.println(student.name);
//        return " ";
//    }

//    @Override
//    protected void finalize () throws Throwable{
//        try{
//        System.out.println("Object has been destroyed");
//    }catch (Exception e){
//            System.out.println("not called");}
//    }
}

    class Student{
       String name = "Abhijeet";
       int roll;
       float marks;
       static String surname = "Singh";

       @Override
        public String toString(){
           return name;
       }

    }









