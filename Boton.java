import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Boton extends JFrame
{
//declaramos las etiquetas y la imagen
	JLabel lblsum, lblbarner;
	JButton btnSum,btnn;// declaracion del boton
	
	public Boton()
	{
		super("Aviso");
		
		//Creando contenedor
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		//Asignamos valores a las etiquetas y al boton
		lblsum= new JLabel("¿Seguro que quieres iniciar una nueva partida?");
		btnSum = new JButton("Si");
		btnn=new JButton("No");
		//exportacion de la imagen
		Icon barner = new ImageIcon("topBarner.png");
         lblbarner = new JLabel("", barner, SwingConstants.LEFT);
			lblbarner.setToolTipText("GottAProyect Inc. Todos los Derechos Reservados");
		
		//Creando manejador de eventos
		ManejaBoton escucha = new ManejaBoton();
		btnSum.addActionListener(escucha);
		btnn.addActionListener(escucha);
		//Agregando al contenedor
		con.add(lblbarner);
		con.add(lblsum);
		con.add(btnSum);
		con.add(btnn);
		
		
		//Formato del contenedor
		setSize(500,170);
		setVisible(true);
	}
	
	//inicia metdo Main
	public static void main(String arg[])
	{
		Boton apli = new Boton();
		apli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		apli.setResizable(false);
	}
	
	//Si presionamos boton nos envia a Ahorcado1.java
	private class ManejaBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		 if (e.getSource()==btnSum){
					Ahorcado2 m1=new Ahorcado2();		
					setVisible(false);	
			}
		 else if(e.getSource()==btnn){
		   System.exit(0);
		  }
		}//Fin metodo
	}//Fin ActionListener
}//Fin clase boton
//pag 425