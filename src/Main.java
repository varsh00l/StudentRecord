import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentManager manager =new StudentManager();
        while(true){
            System.out.println("\n1.Add Student");
            System.out.println("2.View All Students");
            System.out.println("3.Search Student by Rollno");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Roll no.");
                    int rollno=sc.nextInt();
                    System.out.println("Enter name");
                    String n=sc.next();
                    System.out.println("Enter Age:");
                    int agee=sc.nextInt();

                    manager.AddStudent(new Student(rollno,n,agee));
                    System.out.println("Student Added!!!!!");
                    break;

                case 2:
                    manager.viewAll();
                    break;
                case 3:
                    System.out.println("Enter the rollno:");
                    int roll = sc.nextInt();
                    Student s=manager.search(roll);
                    if(s!=null){
                        s.display();
                    }else{
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter rollno");
                    roll=sc.nextInt();
                    if(manager.delete(roll)){
                        System.out.println("Deleted");
                    }else{
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    System.out.println("EXITT");
                    return;

                default:
                    System.out.println("Invalid choice");



            }
        }


    }
}
