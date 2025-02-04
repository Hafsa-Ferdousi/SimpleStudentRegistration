
package studentregistration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener{

        
   private JTextField nameField, emailField, phoneField;
   private JButton submitButton, clearButton;
   
   public StudentRegistration (){
       
       
       setTitle("Student Registration ");
       setSize(400,250);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new GridLayout(4,2,10,10));
       setLocationRelativeTo(null);
       
       
       add(new JLabel("Name:"));
       nameField = new JTextField();
       add(nameField);
       
       
       add(new JLabel("Email:"));
       emailField = new JTextField();
       add(emailField);
       
       
       add(new JLabel("Phone:"));
       phoneField= new JTextField();
       add(phoneField);
       
       
       submitButton=new JButton("Submit");
       clearButton =new JButton("Clear");
       
       submitButton.addActionListener(this);
       clearButton.addActionListener(this);
       
       add(submitButton);
       add(clearButton);
       
       setVisible(true);
       
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==submitButton){
            
            String name= nameField.getText().trim();
            String email= emailField.getText().trim();
            String phone = phoneField.getText().trim();
            
         if(name.isEmpty()|| email.isEmpty()||phone.isEmpty()){
                JOptionPane.showMessageDialog(this, 
                        "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
         }else{
             Student student = new Student(name, email, phone);
             student.displayInfo();
         }
        }else if(e.getSource()==clearButton){
         nameField.setText("");
         emailField.setText("");
         phoneField.setText("");
        }
        
    }
     public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentRegistration::new);
    }
    }

