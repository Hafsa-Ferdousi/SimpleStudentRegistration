
package studentregistration;

import javax.swing.JOptionPane;


public class Student {
  private String name;
 private String email;
 private String phone;
 
 
 public Student (String name,String email,String phone){
     this.name=name;
     this.email=email;
     this.phone=phone;
     
 }
     public void displayInfo(){
        JOptionPane.showMessageDialog(null,"Student Details: \nName: " 
       + name+"\nEmail: " + email + 
            "\nPhone: " + phone, 
            "Student Info",JOptionPane.INFORMATION_MESSAGE);
     }
     
 }

