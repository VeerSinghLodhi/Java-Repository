import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Photo_Insert_SQL extends JFrame implements ActionListener,FocusListener,ItemListener{
    Connection c;
    Statement s1;
    ResultSet rs;
    JLabel setPhoto;
    JTextField nameField;
    JButton showButton;
    JComboBox cb;
    Photo_Insert_SQL(){
            getConnection();
            setLayout(null);
            Font font=new Font("System",1,20);
            
            JLabel srnoLabel=new JLabel("Sr No");
            srnoLabel.setFont(font);
            srnoLabel.setBounds(100,80,100,30);
            add(srnoLabel);
            
            cb=new JComboBox();
            cb.setFont(font);
            cb.setBounds(200,80,250,30);
            cb.addItemListener(this);
            add(cb);
            
            JLabel name=new JLabel("Name");
            name.setFont(font);
            name.setBounds(100,140,100,30);
            add(name);
            
            nameField=new JTextField();
            nameField.setFont(font);
            nameField.setBounds(200,140,250,30);
            add(nameField);
            
            JLabel photo=new JLabel("Photo");
            photo.setFont(font);
            photo.setBounds(100,200,100,30);
            add(photo);
            
            setPhoto=new JLabel("Add Photo");
            setPhoto.setFont(font);
            setPhoto.setBounds(200,200,200,200);
            add(setPhoto);
            
            showButton=new JButton("ADD");
            showButton.setFont(font);
            showButton.setBounds(200,410,120,30);
            showButton.addActionListener(this);
            add(showButton);
            
            getSrno();
    }
    void getSrno(){
        try{
            String sql="select srno from veer ";
            rs=s1.executeQuery(sql);
            int i=0;
            while(rs.next()){
                cb.insertItemAt(rs.getInt(1),i++);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }    
    void getConnection(){
        /*try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","veer6264");
            s1=c.createStatement();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error is "+e,"Error!!",0);
        }*/
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==showButton){
            getData();
        }
    }  
    void getData()
    {
        try{
                String name,sql;
                int srno=Integer.parseInt(cb.getSelectedItem().toString());
                sql="select name,photo from veer where srno="+srno;
                System.out.println(sql);
                Blob b;
                rs=s1.executeQuery(sql);
                rs.next();
                name=rs.getString(1);
                b=rs.getBlob(2);
                byte [] v=b.getBytes(1, (int)b.length());
                FileOutputStream fil=new FileOutputStream("C:\\Prorgram_Photos\\Photo\\Pawansinghlodhi.jpg");
                fil.write(v);
                fil.close();
                ImageIcon icon=new ImageIcon(new ImageIcon("C:\\Prorgram_Photos\\Photo\\Pawansinghlodhi.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                setPhoto.setIcon(icon);
                nameField.setText(name);
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
            }
        
    }
    @Override
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==cb){
            getData();
        }
    }
    @Override
    public void focusGained(FocusEvent fe){
        
    }
    @Override
    public void focusLost(FocusEvent fe){
        
    }
    public static void main(String [] args){
        Photo_Insert_SQL e=new Photo_Insert_SQL();
        e.setSize(800,500);
        e.setVisible(true);
    }
    
    
}
