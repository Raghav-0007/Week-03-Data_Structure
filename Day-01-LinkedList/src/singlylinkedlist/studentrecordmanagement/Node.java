package singlylinkedlist.studentrecordmanagement;

// Create a Node class for making nodes
public class Node {
    // Student data
     protected String rollNumber;
     private String name;
     private int age;
     private char grade;

     // next pointer
    Node next;

    // constructor for taking values
    public Node(String rollNumber, String name, int age, char grade) {
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        next=null;
    }

    // method to update grade
    public void setGrade(char grade) {
        this.grade = grade;
    }

    // print the record
    public void displayRecord(){
        System.out.println("rollNumber: "+rollNumber);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("grade: "+grade);
        System.out.println();
    }
}
