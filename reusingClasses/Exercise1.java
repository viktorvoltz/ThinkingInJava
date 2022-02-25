class School {
    private String s;
    School(){
        System.out.println("School()");
        s = "constructed";
    }
    public String toString(){
        return s;
    }
}

public class Exercise1{
    private String classes, students;
    private School school;
    public Exercise1(){
        System.out.println("Exercise1");
        classes = "classes";
        students = "students";
    }

    public String toString(){
        if(school == null){
            school = new School();
        }

        return classes;
    }

    public static void main(String[] args){
        Exercise1 exercise = new Exercise1();
        System.out.println("x");
    }
}