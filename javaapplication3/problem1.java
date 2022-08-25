/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner o=new Scanner(System.in);
        System.out.println("enter author details:");
        author obj1=new author();
        obj1.name=o.next();//"Mark Allen Weiss";
        obj1.email=o.next();//"allenmark.2@gmail.com";
        obj1.gender=o.next().charAt(0);//'M';
        System.out.println();
        
        System.out.println("enter book details:");
        String nam=o.next();
        double pr=o.nextDouble();
        int qua=o.nextInt();
        
        Book obj=new Book(nam,obj1,pr);
        System.out.println(obj.getName());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getprice());
        System.out.println();
        System.out.println(obj);
        System.out.println();
        
        Book obj2=new Book(nam,obj1,pr,qua);
        System.out.println(obj2.getName());
        System.out.println(obj2.getAuthor());
        System.out.println("price:"+obj2.getprice());
        System.out.println("quantity"+obj2.getqty());
        System.out.println();
        System.out.println(obj2);
        System.out.println();
        
        System.out.println("enter the price to be changed:");
        double pc=o.nextDouble();
        obj2.setprice(pc);
        System.out.println("enter the quantity to be changed:");
        int quan=o.nextInt();
        obj2.setqty(quan);
        System.out.println();
        System.out.println(obj2);
        
    }
    
}
class author
{
    String name;
    String email;
    char gender;
}
class Book
{
    String b_name;
    author a=new author();
    static double price;
    static int qty;
    Book(String n,author an,double p)
    {
        b_name=n;
        a.name=an.name;
        a.email=an.email;
        a.gender=an.gender;
        price=p;
    }
    Book(String n,author an,double p,int q)
    {
        b_name=n;
        a.name=an.name;
        a.email=an.email;
        a.gender=an.gender;
        price=p;
        qty=q;
    }
    String getName()
    {
        return "BOOK NAME : "+b_name;
    }
    String getAuthor()
    {
        return "AUTHOR : "+a.name+"EMAIL: "+a.email+"GENDER"+a.gender;
    }
    Double getprice()
    {
        return price;
    }
    void setprice(double value)
    {
        price=value;
    }
    int getqty()
    {
        return qty;
    }
    void setqty(int qy)
    {
        qty=qy;
    }
   
    public String toString()
    {
        return "BOOK [name = "+b_name+", AUTHOR {NAME="+a.name+". email="+a.email+", gender="+a.gender+"],price="+price+",qty="+qty+"]";   }
}