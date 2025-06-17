public class Student {
    private int rollno;
    private String name;
    private int age;

    public Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;

    }



    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(){
        this.name=name;
    }
    public void setAge(){
        this.age=age;
    }
    public void display(){
        System.out.println("Roll no: "+rollno + "Name: "+ name+ "Age: "+ age);
    }
}