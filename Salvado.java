import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Salvado extends JFrame{
 JMenuItem Nuevo;
 JLabel jl1;
 JButton b1;
 public Salvado (){
   Container con = getContentPane();
	con.setLayout(new FlowLayout());
	
	Icon barner = new ImageIcon("ContacUs.png");
   jl1 = new JLabel("", barner, SwingConstants.LEFT);
	con.add(jl1);
	b1=new JButton("Regresar");
	con.add(b1);
	
	ManejaEve ev=new ManejaEve();
	b1.addActionListener(ev);
	b1.setVisible(false);
	setSize(500,275);
   setVisible(true);
			
 }
 public static void main(String a[]){
  Salvado sa=new Salvado();
  sa.setResizable(false);
  sa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 private class ManejaEve implements ActionListener{
  public void actionPerformed(ActionEvent e){
   Ahorcado2 apli = new Ahorcado2();
  }
 }
}