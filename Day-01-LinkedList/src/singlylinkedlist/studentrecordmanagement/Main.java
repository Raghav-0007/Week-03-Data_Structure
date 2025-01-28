package singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        // Create student object to perform operations
        Student student=new Student();

        // add student record
        student.addStudentRecordBeginning("124", "Raghav", 20, 'A');
        student.addStudentRecordBeginning("104", "Raghav", 20, 'A');
        student.addStudentRecordBeginning("424", "Raghav", 20, 'A');
        student.addStudentRecordEnd("324", "Raghav", 20, 'A');
        student.addStudentRecordBeginning("154", "Raghav", 20, 'A');
        student.addStudentRecordEnd("024", "Raghav", 20, 'A');
        student.addStudentRecordAt("404", "Raghav", 20, 'A', 3);

        student.displayStudentRecord();

        System.out.println("delete");
        student.deleteStudent("024");

        student.displayStudentRecord();

        System.out.println("search");
        student.searchStudent("324");

        System.out.println("update grade");
        student.updateGrade("424", 'C');

        student.displayStudentRecord();
    }
}
