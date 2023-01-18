/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author tmoti
 */
public class StudentList {
    public static void main (String[]args){
        //Student s1= new Student("s1","taha");
       
        Student[] studentList = new Student[3];
        studentList[0]= new Student("s1","taha");
        studentList[1]= new Student("s2","mustafa");
        studentList[2]= new Student("s3","sara");
        
        for (int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
    }
        


        
    
    }//end of main
    
}//end of class
