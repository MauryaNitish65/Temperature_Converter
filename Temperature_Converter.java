/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_swiing_practice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Temperature_Converter extends JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    public void setComponents(){
        l1=new JLabel("Enter The Temperature in Celsius");
        t1=new JTextField();
        l2=new JLabel("Temperature in Farenheit");
        t2=new JTextField();
        b1=new JButton("Convert");
        setLayout(null);
        l1.setBounds(10, 50, 200, 20);
        t1.setBounds(225, 50,200, 20);
        l2.setBounds(10, 80, 200, 20);
        t2.setBounds(225, 80, 200, 20);
        t2.setEditable(false);
        b1.setBounds(150, 150, 100, 20);
        b1.addActionListener(new Handle());
        add(l1);
        add(t1);
        add(l2);      
        add(t2);  
        add(b1);
    }
    class Handle implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float c=Float.parseFloat(t1.getText());
            float f=(float)(((9*c)+160)/5.0);
            String result=String.valueOf(f);
            t2.setText(result); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public static void main(String[] args) {
        Temperature_Converter fr=new Temperature_Converter();
        fr.setTitle("Temperature Converter");
        fr.setComponents();
        fr.setLayout(null);
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
