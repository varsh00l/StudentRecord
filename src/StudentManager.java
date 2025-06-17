import java.sql.SQLOutput;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> Students=new ArrayList<>();

    public void AddStudent(Student s){
        Students.add(s);
    }
    public void viewAll(){
        for(Student s:Students) {
            if (Students == null) {
                System.out.println("Add the Students:");
            } else {
                s.display();
            }
        }

    }
    public Student search(int rollno){
        for(Student s:Students){
            if(s.getRollno()==rollno){
                return s;
            }
        }
        return null;
    }
    public boolean delete(int rollno){
        Student s=search(rollno);
        if(s!=null){
            Students.remove(s);
        }
        return false;
    }


}
