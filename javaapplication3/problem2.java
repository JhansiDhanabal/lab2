/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.*;
/**
 *
 * @author USER
 */
public class problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter number of student:");
        Scanner obj1=new Scanner(System.in);
        int n=obj1.nextInt();
        student s[]=new student[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new student();
        }
        System.out.println("enter student details:");
        for(int i=0;i<n;i++)
        {
            s[i].getdata();
            s[i].percentage();
            System.out.println();
            s[i].display();
            System.out.println();
        }
    }
    
}
class student
{
    String student_name;
    int register_number;
    int working_days;
    int days_present;
    int marks;
    double per;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter student name:");
        student_name=obj.next();
        System.out.println("enter register number:");
        register_number=obj.nextInt();
        System.out.println("enter wording days:");
        working_days=obj.nextInt();
        System.out.println("enter number of days present:");
        days_present=obj.nextInt();
    }
    void percentage()
    {
        per=(double)((days_present*100)/working_days);
    }
    void display()
    {
        
        if(per>=90)
        {
            marks=5;
            System.out.println("Attendance percentage >= 90"+" Marks-"+marks);
        }
        else if(per>=80)
        {
            marks=4;
            System.out.println("Attendance percentage >= 80"+" Marks-"+marks);
        }
        else if(per>=75)
        {
            marks=3;
            System.out.println("Attendance percentage >= 75"+" Marks-"+marks);
        }
        else
        {
            marks=0;
            System.out.println("Attendance percentage < 75 "+" Marks-"+marks);
        }
       
    }
}