package com.harman.sample;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String Name, Rollno, Admino, College;
            System.out.println("Enter the name: ");
            Name = input.next();
            System.out.println("Enter the Roll no: ");
            Rollno = input.next();
            System.out.println("Enter the Admino: ");
            Admino = input.next();
            System.out.println("Enter the College: ");
            College = input.next();
            Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college?autoReconnect=true&useSSL=false","root","");
            Statement state= c.createStatement();
            state.executeUpdate("INSERT INTO `student`(`Name`, `Rollno`, `Adminno`, `College`) VALUES('"+Name+"',"+Rollno+","+Admino+",'"+College+"')");
            System.out.println("Inserted Successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}