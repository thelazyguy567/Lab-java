class Student{
    public String name;
    Student(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
public class Main12{
    public static void main(String[]args){
        Student[] myStudents=new Student[]{new Student("Dharma"),new Student("gokul"),new Student("gox")};
        for(Student m:myStudents){
            System.out.println(m);
        }
    }
}