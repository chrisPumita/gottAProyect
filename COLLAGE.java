import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class COLLAGE extends JFrame
{
//declaramos las etiquetas y la imagen
	JButton btnSum;// declaracion del boton
	
	public COLLAGE()
	{
		super("Collage!!");
		
		//Creando contenedor
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		//Imagenes y barnesrs
			
			Icon btnimg = new ImageIcon("collage.png");
			btnSum = new JButton("",btnimg);
			btnSum.setToolTipText("Este esl el Collage de las posibles palabras ocultas");

		//Creando manejador de eventos
		ManejaBoton escucha = new ManejaBoton();
		btnSum.addActionListener(escucha);
		//Agregando al contenedor
		con.add(btnSum);

		//Formato del contenedor
		setSize(600,520);
		setVisible(true);
		setResizable(false);
		con.setBackground(new java.awt.Color(0, 50, 100));
	}
	
	//inicia metdo Main
	public static void main(String arg[])
	{
		COLLAGE apli = new COLLAGE();
		apli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//Si presionamos boton nos envia a Ahorcado1.java
	private class ManejaBoton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		 if (e.getSource()==btnSum)
					setVisible(false);	

		}//Fin metodo
	}//Fin ActionListener
}//Fin clase boton