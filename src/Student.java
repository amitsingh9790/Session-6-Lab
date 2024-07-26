public class Student {
    private String name;
    private int age;
    private String department;

    //Non-parameterized constructor that initializes the name to "Unknown", age to 20, and department to "Unassigned"
    Student(){
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    // Parameterized constructor that takes two parameters: name and age, and initializes the department to "IT".
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        department= "IT";
    }

    //Parameterized constructor that takes three parameters: name, age, and department.
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    //Setter functions to set the value
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Getter functions to get the value
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}

class Main{
    public static void main(String[] args) {
        Student s1 = new Student(); // Creating instance using non parameterized constructor
        Student s2 = new Student("Amit Singh",25); //Creating instance using parameterized constructor by passing two arguments
        Student s3 = new Student("Vinay Sharma",26,"CSE"); //Creating instance using parameterized constructor by passing three arguments

        System.out.println(s1.getName()+" "+s1.getAge()+" "+ s1.getDepartment());
        System.out.println(s2.getName()+" "+s2.getAge()+" "+ s2.getDepartment());
        System.out.println(s3.getName()+" "+s3.getAge()+" "+ s3.getDepartment());
    }
}