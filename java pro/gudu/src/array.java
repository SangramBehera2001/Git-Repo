import java.util.Scanner;
class Student {
protected int rollNumber;
protected String name;
protected String course;
public void input_Student() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Roll Number: ");
rollNumber = sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
name = sc.nextLine();
System.out.print("Enter Course: ");
course = sc.nextLine();
}
public void display_Student() {
System.out.println("Roll Number: " + rollNumber);
System.out.println("Name: " + name);
System.out.println("Course: " + course);
}
}
class Exam extends Student {
private int mark1;
private int mark2;
private int mark3;
public void input_Marks() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Marks in Subject 1: ");
mark1 = sc.nextInt();
System.out.print("Enter Marks in Subject 2: ");
mark2 = sc.nextInt();
System.out.print("Enter Marks in Subject 3: ");
mark3 = sc.nextInt();
}
public void display_Result() {
System.out.println("Marks in Subject 1: " + mark1);
System.out.println("Marks in Subject 2: " + mark2);
System.out.println("Marks in Subject 3: " + mark3);
}
}
public class array {
public static void main(String[] args) {
Exam[] exams = new Exam[5];
for (int i = 0; i < 5; i++) {
exams[i] = new Exam();
System.out.println("\nEnter details for student " + (i + 1) + ":");
exams[i].input_Student();
exams[i].input_Marks();
}
System.out.println("\nResults of 5 students:");
for (int i = 0; i < 5; i++) {
System.out.println("\nStudent " + (i + 1) + " details:");
exams[i].display_Student();
exams[i].display_Result();
}
}
}
