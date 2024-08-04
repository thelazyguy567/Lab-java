class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Arr2 {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[3];
        arr[0]=new Student(10,"Gox");
        arr[1]=new Student(20,"Ram");
        arr[2]=new Student(25,"Ian");
        System.out.println("Elements of the array are:");
        for(int i=0;i<3;i++)
        {
            System.out.println("Element in index "+i+" : "+arr[i].name+" his roll no is "+arr[i].roll_no);
        }
    }
}