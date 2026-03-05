class student{
   private int id,cgpa;
   private String name;
    public student() {
    }
    public student(int id, int cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }
   
    public int getId() {
        return id;
    }
    
}
public class a {


public static void main(String[] args) {
    
    student s1=new student(21,3,"nupur");

    System.out.println(s1.getId());

}    
}
