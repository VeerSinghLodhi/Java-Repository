
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class MyWindow{
    public static void main(String []args){
        javax.swing.JFrame jFrame=new javax.swing.JFrame("My Window");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);

        
        JButton button1=new JButton("Button 1");
        button1.setBounds(80,200,100,40);
        jFrame.add(button1);
 
        // Functional Interface Using Anonymous Class 
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button 1 Clicked!!");
                JOptionPane.showMessageDialog(null, "Hey, Button 1 Clicked!\nActionListener access by the using of Anonymous class.");
            }
        });

        JButton button2=new JButton("Button 2");
        button2.setBounds(200,200,100,40);
        jFrame.add(button2);

        //Functional Interface using Lamda Expression
        button2.addActionListener((e)->{
            System.out.println("Button 2 clicked!!");
            JOptionPane.showMessageDialog(null,"Hey, Button 2 Clicked!\nActionListener access by the using of Lamda Expression.");
        });


        JButton button3=new JButton("Button 3");
        button3.setBounds(320,200,100,40);
        jFrame.add(button3);

        //Functional Interface using Normal code
        ActionListener actionListener=new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Button 3 clicked!!");
                JOptionPane.showMessageDialog(null,"Hey, Button 3 Clicked!\nActionListener access by the using of normal code.");
            }
        };
        button3.addActionListener(actionListener);



        jFrame.setVisible(true);
    }
}