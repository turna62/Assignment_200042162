package DataCoupling;

public class Student {
    private String name;
    private int ID;
    private int age;

    public Student(){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setID(int newID){
        this.ID = newID;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("lamia");
        student.setID(62);
        student.setAge(22);

        System.out.println(student.getName());
        System.out.println(student.getID());
        System.out.println(student.getAge());
    }

}
