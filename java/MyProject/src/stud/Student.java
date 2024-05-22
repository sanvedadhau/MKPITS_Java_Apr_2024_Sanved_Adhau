package stud;

public class Student {
    private String name;
    private int marks;

    public Student(){
        name = "sanved";
        marks = 80;

        System.out.println("Default ");

    }
    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;

        System.out.println("Parameter");
    }


    public String getName(){return name;}

    public void setName(String name){this.name =name;}

    public int getMarks(){return marks;}

    public void setMarks(int Marks){this.marks = marks;}


}
