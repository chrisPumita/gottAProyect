import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import javax.swing.event.*;
	
   public class Ahorcado2 extends JFrame
   {
		//Variables de diseño e instrucciones
      JLabel lblnum1, lblnum2, lblMensaje, lblbarner, lbluni, lblhistorial, lblstatus, lblTuPalabra, lblmjestatus;
  		//Variable de las palabra oculta    
		JLabel lblpalabra;
		//Variables de VIDAs, pueden ser imagenes, pero se estaran utilizando caritas ACCII ":)"
      JLabel lblx0, lblx1, lblx2, lblx3, lblx4, lblx5, lblx6, lblx7;
		//declarando corazones
		JLabel c1,c2,c3,c4,c5,c6,c7,c8,c9;
		//Variable de menu
		JMenuBar menuBar;
		JMenu menu, menu2,menu3,menu4;
		JMenuItem Nuevo,Salir,Collage,Verr,Acercade,Inst,Cred;
		//variables de imagenes dibujitos de ahorcados :S
		JLabel vida0, vida1, vida2, vida3, vida4, vida5, vida6, vida7, vidaRIP, vidaWin;

      JTextField letra;//Caja de texto para ingresar el caracter
      JButton btnBuscar;// Boton de iniciar juego y buscar palabra
		//Creando arreglo 1
		public String[] palabras = {"PARANGUATIMIRICUARO","MARIPOSA","LAGUNA","REVERBERANTE","ALMOHADA","BARROCO","CASCADA",
         "ALBORES","GIRASOL","NOGAL","SALAMANDRA","SOMBRIO","CLAUSTRO","ANZUELO",
         "ALUMINIO","CARACOL","MANDARINA","SERENIDAD","ALMOHADA","CLARINETE",
         "SONRISA","FASCINANTE","ATARDECER","LUSTRO","CABALLERIA","ANDALUZ","PERGAMINO",
         "ALEVOSIA","SUGESTIVO","CHOCOLATE","TEMPESTAD","MILAGRO","COCHE",
         "SUTIL","CIELO","CARACOLEAR","ESPACIO","PLURAL","BOREAL","ILOGICO",
         "DESINHIBIDOR","LIBIDO","OBVIAMENTE","DUENDE","NATURALMENTE","CONSTIPADO","PULCRO","SENSATEZ",
         "ESTUDIAR","CRIATURA","VIVIR","MUNDO","MARAVILLA","FORTUNA","ACOMODAR","GENERO","VIDA",
         "NACIDO","EJEMPLO","DESTINADO","VOLAR","PARTIR","ACOMODAR","PERFECTO","ESTE","FIN","AVE",
         "LIGERO","POSIBLE","VOLUMINOSO","PULMONES","AIRE","GRANDE","ESPACIO","HUECO","HUESOS",
         "EXTREMO","FUERTE","COMPARADO","PESO","FORMA","CUERPO","AFILADO","DELANTE","PROVISTO",
         "SUAVE","PROPOSITO","VUELO","PLUMA","RESPONDER","ADMIRABLE","CREADAS","HALLAR",
         "MARAVILLOSAMENTE","ENGRASADAS","AGUA","DESCENDER","AVE","PESO","MUSCULOS","UTILIZAR","VUELO",
         "ENORME","PROPORCION","PESO","TAMAÑO","CUERPO","ESTAR","DISPUESTO","MAYOR","RENDIMIENTO",
         "EFECTIVO","MENOR","ESFUERZO","POSIBLE"};			
      private int comparador[];
		
      private String palabra_actual = "";
      private int caso = 1;
		private JTextField letras_ocupadas = new JTextField(15);
				
		
		private JTextField palabra = new JTextField(26);
		//Clave de la palabra que se incrementara segun la palabra elejida

   
      public Ahorcado2()// Inicio de metodos para clase Ahorcado 1
      {
         super(".::RÇSG * Aho.OrcadX.x Ver 2.0::.");// Titulo

      		//Declarado contenedor
         Container con = getContentPane();
         
			con.setLayout(new FlowLayout());
      		//Imagenes y barnesrs
         Icon barner = new ImageIcon("topBarner.png");
         lblbarner = new JLabel("", barner, SwingConstants.LEFT);
			lblbarner.setToolTipText("GottAProyect Inc. Todos los Derechos Reservados");


         Icon universidad = new ImageIcon("bajo.png");
         lbluni = new JLabel("", universidad, SwingConstants.LEFT);
						
      		//Etiquetas en el programa
         lblnum1 = new JLabel("Escriba una letra: ");
         lblnum2 = new JLabel("Vidas: ");
         lblMensaje = new JLabel("*Bienvenido a GottAProyect Inc. Por Adivina la palabra oculta y salva a Gottita*  n_n");
			lblhistorial = new JLabel("*HISTORIAL* Has ingresado estas palabras: ");
			
			lblstatus = new JLabel("||Has iniciado nuevo juego||");
			lblstatus.setToolTipText("Este es el estado de tu juego ");
			
			lblTuPalabra = new JLabel("Tu palabra a adivinar es: ");
			lblmjestatus = new JLabel ("ESTATUS DEL JUEGO: ");
      
      //Vidas que aun tenemos
         lblx0 = new JLabel(":D ");
         lblx1 = new JLabel(":) ");
         lblx2 = new JLabel(":) ");
         lblx3 = new JLabel(":) ");
         lblx4 = new JLabel(":) ");
         lblx5 = new JLabel(":) ");
         lblx6 = new JLabel(":) ");
         lblx7 = new JLabel(":) ");
			
			//declarando el menu
			menuBar=new JMenuBar();
			menu=new JMenu("Archivo");
	      menu2=new JMenu("Pista");
			menu3=new JMenu("Ayuda");
			menu4=new JMenu("                                                                                                              ");
			Nuevo=new JMenuItem("Nuevo juego");
			Nuevo.setToolTipText("Iniciar nuevo juego");
			
			Salir=new JMenuItem("Salir");
			Salir.setToolTipText("Salir de la aplicacion");
			
			Collage=new JMenuItem("Collage");
			Collage.setToolTipText("Ver collage de ayuda");
			
			Verr=new JMenuItem("Ver respuesta");
			Verr.setToolTipText("Ver la respuesta correcta");
			
			Acercade=new JMenuItem("Acerca de");
			Acercade.setToolTipText("Acerca de Ahorcado Ver 1.4.3");
			
			Inst=new JMenuItem("Instrucciones");
			Inst.setToolTipText("Instrucciones");
			
			Cred=new JMenuItem("Créditos");
			Cred.setToolTipText("GottAProyect Inc. Derechos Reservados");

			
			menu.add(Nuevo);
			menu.addSeparator();
         menu.add(Salir);
			
			menu2.add(Collage);
			menu2.addSeparator();
			menu2.add(Verr);
			
			menu3.add(Acercade);
			menu3.addSeparator();
			menu3.add(Inst);
			menu3.addSeparator();
			menu3.add(Cred);
          menuBar.add(menu);
			 menuBar.add(menu2);
			 menuBar.add(menu3);
			 menuBar.add(menu4);
			 //instanciando los corazoncitos en imagenes
			 Icon cor0 = new ImageIcon("mono0.png");
         vida0 = new JLabel("", cor0, SwingConstants.LEFT);
			vida0.setToolTipText("GottAProyect Inc. Derechos Reservados");
			 
		   Icon cor1 = new ImageIcon("mono1.png");
         vida1 = new JLabel("", cor1, SwingConstants.LEFT);
			vida1.setToolTipText("Se ha dibujado la cuerda...");
		 
		 	Icon cor2 = new ImageIcon("mono2.png");
         vida2 = new JLabel("", cor2, SwingConstants.LEFT);
			vida2.setToolTipText("Espelemos que no sea io :3...");

		   Icon cor3 = new ImageIcon("mono3.png");
         vida3 = new JLabel("", cor3, SwingConstants.LEFT);		 
			vida3.setToolTipText("Ahhh??, donde estoy?...");
			
			Icon cor4 = new ImageIcon("mono4.png");
         vida4 = new JLabel("", cor4, SwingConstants.LEFT);
			vida4.setToolTipText("Voy a llolal.....TT_TT");
		 
		   Icon cor5 = new ImageIcon("mono5.png");
         vida5 = new JLabel("", cor5, SwingConstants.LEFT);	
			vida5.setToolTipText("Ahhh Mi manita!! >.<");	 
		 
			Icon cor6 = new ImageIcon("mono6.png");
         vida6 = new JLabel("", cor6, SwingConstants.LEFT);	
			vida6.setToolTipText("Ahh mi otra manita!!! >.<...");
			
			Icon cor7 = new ImageIcon("mono7.png");
         vida7 = new JLabel("", cor7, SwingConstants.LEFT);
			vida7.setToolTipText("Auuudame!! auadamee!! No kelo molil...");	  
			
			Icon cor8 = new ImageIcon("monobreak.png");
         vidaRIP = new JLabel("", cor8, SwingConstants.LEFT);
			vidaRIP.setToolTipText("Adios mundo Cruel X.x");
			
			Icon cor9 = new ImageIcon("monoWin.png");
         vidaWin = new JLabel("", cor9, SwingConstants.LEFT);
			vidaWin.setToolTipText("Me has salvado.. te lo agradesco mucho... :3");

         lblpalabra = new JLabel("PORFAVOR ADIVINA LA SIGUINTE PALABRA: ");
         letra = new JTextField(2);//Cuadro de texto 
         btnBuscar = new JButton("Buscar letra!");	
			
			
			//los dibujos de los corazones
			Icon heart1 = new ImageIcon("heart1.png");
         c1 = new JLabel("", heart1, SwingConstants.LEFT);
			c1.setToolTipText("Tus visas estan completas");
			
			Icon heart2 = new ImageIcon("heart2.png");
         c2 = new JLabel("", heart2, SwingConstants.LEFT);
			c2.setToolTipText("te quedan 7 vidas");
			
			Icon heart3 = new ImageIcon("heart3.png");
         c3 = new JLabel("", heart3, SwingConstants.LEFT);
			c3.setToolTipText("te quedan 6 vidas");
			
			Icon heart4 = new ImageIcon("heart4.png");
         c4 = new JLabel("", heart4, SwingConstants.LEFT);
			c4.setToolTipText("te quedan 5 vidas");
			
			Icon heart5 = new ImageIcon("heart5.png");
         c5 = new JLabel("", heart5, SwingConstants.LEFT);
			c5.setToolTipText("te quedan 4 vidas");
			
			Icon heart6 = new ImageIcon("heart6.png");
         c6 = new JLabel("", heart6, SwingConstants.LEFT);
			c6.setToolTipText("te quedan 3 vidas");
			
			Icon heart7 = new ImageIcon("heart7.png");
         c7 = new JLabel("", heart7, SwingConstants.LEFT);
			c7.setToolTipText("te quedan 2 vidas");
			
			Icon heart8 = new ImageIcon("heart8.png");
         c8 = new JLabel("", heart8, SwingConstants.LEFT);
			c8.setToolTipText("te quedan 1 vida");
			
			Icon heart9 = new ImageIcon("heart9.png");
         c9 = new JLabel("", heart9, SwingConstants.LEFT);
			c9.setToolTipText("Ya no hay vidas");


      //Manejador de eventos DECLARACION escucha
         ManejaBoton escucha = new ManejaBoton();

         btnBuscar.addActionListener(escucha);
			letra.addActionListener(escucha);	
			
			ManejaEventoCla to=new ManejaEventoCla();
		   Nuevo.addActionListener(to);
			
         ManejaEventoSa no=new ManejaEventoSa();
			Salir.addActionListener(no);
			
			ManejaEventoAc ac=new ManejaEventoAc();
			Acercade.addActionListener(ac);
			
			ManejaEventoIn in=new ManejaEventoIn();
			Inst.addActionListener(in);
			
			ManejaEventoCre cre=new ManejaEventoCre();
			Cred.addActionListener(cre);
			
			ManejaEventoVer verRes=new ManejaEventoVer();
			Verr.addActionListener(verRes);
			
			ManejaEventoCollage verCollage = new ManejaEventoCollage();
			Collage.addActionListener(verCollage);
			
			
			
			
			
			//AGREGANDO OBJETOS AL FRAME
      //Barner superior (Diseño) 
		   con.add(menuBar);
			
			con.add(lblbarner);
		   
			
         con.add(lblMensaje);
			
			//ADJUNTANDO LETRAS BLOOQUEADAS
			con.add(lblTuPalabra);
			
			
			con.add(palabra);
			

      //Boton de buscar y caja para incertar letra
         con.add(lblnum1);
			
			
         con.add(letra);
			
			con.add(btnBuscar);
			
      //Indicadores de VIDAS
         con.add(lblnum2);
			
			con.add(c1);
			
	      con.add(c2);
			
         con.add(c3);
			
         con.add(c4);
			
			con.add(c5);
			
         con.add(c6);
			
         con.add(c7);
			
         con.add(c8);
			
			con.add(c9);
        
			// Estado del juego :O
			con.add(lblmjestatus);
			
			con.add(lblstatus);
         
			
			lblx0.setVisible(false);
			
								
			con.add(lblhistorial);
			
			con.add(letras_ocupadas);
        
//conenedor de corazoncitos
			con.add(vida0);
			
		 con.add(vida1);
		 
		 con.add(vida2);
		
		 con.add(vida3);
		
		 con.add(vida4);
	
		 con.add(vida5);
		
		 con.add(vida6);
		
		con.add(vida7);
		
		 con.add(vidaRIP);
		
		 con.add(vidaWin);
		
		//Barner inferior
      	con.add(lbluni);
		
			
      // TAMAÑO DEL FRAME
		
		//SETS EDITBLES
		palabra.setEditable(false);
		letras_ocupadas.setEditable(false);
		
			//ocultado las imagenes de corazoncito
			
		
		vida0.setVisible(true);
		vida1.setVisible(false);
		vida2.setVisible(false);
		vida3.setVisible(false);
		vida4.setVisible(false);
		vida5.setVisible(false);
		vida6.setVisible(false);
		vida7.setVisible(false);
		vidaRIP.setVisible(false);
		vidaWin.setVisible(false);
		
		
		
		c1.setVisible(true);
		c2.setVisible(false);
		c3.setVisible(false);
		c4.setVisible(false);
		c5.setVisible(false);
		c6.setVisible(false);
		c7.setVisible(false);
		c8.setVisible(false);
		c9.setVisible(false);
		
		letras_ocupadas.setToolTipText("Tus letras ocupadas");
		palabra.setToolTipText("Tu palabra a adivinar");

		
		
		
         setResizable(false);
         setSize(500,630);
         setVisible(true);
			
			//metodo en el campo de texto ingreso del usuario
		elige_palabra(palabra);

      }

		//Eliijiendo la palabra al azar
		//METODO DE PALABRA QUE CREA EL NUMERO DE LETRAS DEPENDIENDO LA PALABRA SELECCIONADA Y CREA LOS OBJETOS TEXTFIELD
		       private void elige_palabra(JTextField palabra)
		 {
         String aux = " __ ";
         palabra_actual = palabras[(int)(Math.random() * palabras.length)];
         palabra_actual = palabra_actual.toUpperCase();
         comparador = new int[palabra_actual.length()];
         for(int i = 0; i < palabra_actual.length(); i++)
			{
            aux = aux + " __ ";
            comparador[i] = 0;
         }
			   palabra.setText(aux);//Coloca el numero correcto de TxtField dependiendo la palabra que selecciono.
		
		}
		
      public static void main(String arg[])//Metodo main para el programa Ahorcado1
      {
	// *********					JOptionPane.showMessageDialog (null,"Ha iniciado un nuevo juego, SUERTE!",".::Re€S!Gua-StuD!os::. Ahorcado X.x",

         Ahorcado2 apli = new Ahorcado2();
         apli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
      }
   		//Manejador de eventos implementados de Actioon Listener
      private class ManejaBoton implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
			String caracter = null;//variables de caracte
			
				// cada que se presione el voton de buscar::
			
            if (e.getSource()==btnBuscar||e.getSource()==letra) //SI se presiona el boton BUSCAR
            {
				
				//Este es el historial de la palabras qu e se estan intriducioendo
					if(!letra.getText().equals(""))
					{
            	caracter = letra.getText().substring(0,1).toUpperCase();
            	String aux = letras_ocupadas.getText();
            	if(aux.indexOf(caracter) < 0)
               aux += " "+caracter;
					 
					letras_ocupadas.setText(aux);
         		}

				//Esta es la clave, ya que es la que compara que la letra sea = a la que esta escondida, de ser asi, la muestra
				if(caracter != null && palabra_actual.indexOf(caracter) >= 0)
				{
            String aux="";
            for(int i = 0; i < comparador.length; i++)
            {
               if(caracter.equals(""+palabra_actual.charAt(i)))
					{
                  comparador[i] = 1;
               }
               if(comparador[i]==1)
                  aux += palabra_actual.charAt(i);
						
               else
                  aux += " __ ";
						
						
            }
				letra.setText("");//elimina la letra que se puso
            palabra.setText(aux);
				}
			   else if(caracter == null){
				 JOptionPane.showMessageDialog(null,"Porfavor debes ingresar una letra");
				 }
				//CAso de que no acerte a la palabra
				         else{
							
					    
							letra.setText("");//elimina la letra que se puso en el cas de que haya sido error
            switch(caso){
               case 1:
					   c1.setVisible(false);
						c2.setVisible(true);
						
						vida0.setVisible(false);
						vida1.setVisible(true);
						
                  break;
               case 2:
                  c2.setVisible(false);
						c3.setVisible(true);
						
						vida1.setVisible(false);
						vida2.setVisible(true);
                  break;
               case 3:
					
                  c3.setVisible(false);
						c4.setVisible(true);
						
						vida2.setVisible(false);
						vida3.setVisible(true);
                  break;
               
					case 4:
                  c4.setVisible(false);
						c5.setVisible(true);
						
						vida3.setVisible(false);
						vida4.setVisible(true);
						break;
					
					
					case 5:
                  c5.setVisible(false);
						c6.setVisible(true);
						
						vida4.setVisible(false);
						vida5.setVisible(true);
						lblstatus.setText("||TE QUEDAN 2 VIDAS||");
						JOptionPane.showMessageDialog (null,"TE QUEDAN 3 VIDAS TEN MAS CUIDADO!!",".::Re€S!Gua-StuD!os::. Ahorcado X.x",
				JOptionPane.INFORMATION_MESSAGE);
						                  break;
               case 6:
					//Mandar mensaje de alerta cuando solo queden 3 vidas
                  c6.setVisible(false);
						c7.setVisible(true);
						
						vida5.setVisible(false);
						vida6.setVisible(true);
						

                  break;
               case 7:// Brazos
					//Mandar mensaje de alerta cuando solo quede 1 Vida :O
                  c7.setVisible(false);
						c8.setVisible(true);
						
						vida6.setVisible(false);
						vida7.setVisible(true);
						lblstatus.setText("||TE QUEDAN 1 VIDA CUIDADO!!||");
						JOptionPane.showMessageDialog (null,"TE QUEDA SOLO UNA VIDA MAS!!!",".::Re€S!Gua-StuD!os::. Ahorcado X.x Ver 2.0",
				JOptionPane.INFORMATION_MESSAGE);
                  break;
               case 8:
                  c8.setVisible(false);
						c9.setVisible(true);
						
						vida7.setVisible(false);
						vidaRIP.setVisible(true);
                  lblstatus.setText("||HAS PERDIDO EL JUEGO!!||");
						JOptionPane.showMessageDialog (null,"PERDISTE MUY MAL JUGADO...",".::Re€S!Gua-StuD!os::. Ahorcado X.x Ver 2.0",
						JOptionPane.INFORMATION_MESSAGE);
                  palabra.setText(palabra_actual);

            }
            caso++;//se incrementa el numero de oportunidades, y por cada incremento la vida disminuye.
         }// fin de casos
			boolean winner = true;

         for(int j = 0; j < comparador.length; j++)
            if(comparador[j] != 1)
               winner = false;

         if(winner){
			
			vida0.setVisible(false);
			vida1.setVisible(false);
			vida2.setVisible(false);
			vida3.setVisible(false);
			vida4.setVisible(false);
			vida5.setVisible(false);
			vida6.setVisible(false);
			vida7.setVisible(false);
			vidaWin.setVisible(true);
			
			
            lblstatus.setText("||Felicitaciones Has Ganado!!!||");
				JOptionPane.showMessageDialog (null,"Has salvado a Gottita!! :3",".::Re€S!Gua-StuD!os::. Ahorcado X.x Ver 2.0",
						JOptionPane.INFORMATION_MESSAGE);
            
				Ahorcado2 apli = new Ahorcado2();
				apli.dispose();
				Salvado sa=new Salvado();
				
            caso = 11;
				}
			
			
            //FIN Boton buscar
            }
				
         }//Fin evento
      }//Fin ActionListener
		 private class ManejaEventoCla implements ActionListener
			{
		  public void actionPerformed(ActionEvent v)
				{
				 Boton apli=new Boton();		
					setVisible(false);
            }
			}
			 private class ManejaEventoSa implements ActionListener
			{
		  public void actionPerformed(ActionEvent k)
				{
				 System.exit(0);
            }
			}
			 private class ManejaEventoAc implements ActionListener
			{
		  public void actionPerformed(ActionEvent p)
				{
				
				 JOptionPane.showMessageDialog (null,"Ahorcado Ver 2.0"+"\n"+" Mexico D.F. Noviembre 2011"+"\n"+" GottAProyect Inc.©2011. Ver. 2.0 Full"+"\n"+"Todos los Derechos Reservados","Acerca de",JOptionPane.INFORMATION_MESSAGE);
            }
			}
			 private class ManejaEventoIn implements ActionListener
			{
		  public void actionPerformed(ActionEvent j)
				{
				 JOptionPane.showMessageDialog (null,"Ingrese una letra a buscar."+"\n"+"Abajo habrá un historial, donde son tus palabras que ya ingresaste."+"\n"+"Al terminar la partida dale clic en el menu Archivo"+"\n"+"Nuevo juego para jugar otra vez","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
            }
			}
			
			
			
			private class ManejaEventoCollage implements ActionListener
			{
		  public void actionPerformed(ActionEvent s)
				{
				//llama a la clase collage
				Ahorcado2 apli = new Ahorcado2();
				apli.dispose();
				COLLAGE sa=new COLLAGE();
				
            }
			}
			
			
			
			
			 private class ManejaEventoVer implements ActionListener
			{
		  public void actionPerformed(ActionEvent l)
				{
				vida0.setVisible(false);
			vida1.setVisible(false);
			vida2.setVisible(false);
			vida3.setVisible(false);
			vida4.setVisible(false);
			vida5.setVisible(false);
			vida6.setVisible(false);
			vida7.setVisible(false);
			
			c1.setVisible(false);
			c2.setVisible(false);
			c3.setVisible(false);
			c4.setVisible(false);
			c5.setVisible(false);
			c6.setVisible(false);
			c7.setVisible(false);
			c8.setVisible(false);
			c9.setVisible(true);
			

			
			
			
				palabra.setText(palabra_actual);
						vidaRIP.setVisible(true);
                  lblstatus.setText("||HAS PERDIDO EL JUEGO!!||");
						JOptionPane.showMessageDialog (null,"Te diste por vencido..No has salvado a Gotitta :(\n La palabra oculta era: *"+palabra_actual+"*",".::Re€S!Gua-StuD!os::. Ahorcado X.x YouLost",
						JOptionPane.INFORMATION_MESSAGE);
            }
			}
			
		 private class ManejaEventoCre implements ActionListener
			{
		  public void actionPerformed(ActionEvent w)
				{
				JOptionPane.showMessageDialog (null,"::::Cofundadores::::"+"\n"+"Erick Vidal SI-402"+"\n"+"Christian SI-402"+"\n::::Codificacion de Codigo::::"+"\n"+"Erick Vidal"+"\n"+"Christian"+"\n"+"Sofia"+"\n::::Personajes (Gottita y amigos (C))::::"+"\n"+"Gricel Joselin MCE-402"+"\n"+"::::Música::::"+"\n"+"Jorge MCE-402"+"\n::::Nuestra acesora en este proyecto::::"+"\n"+"Maestria en Prog. en Java \nMaría Esther Guevara"+"\n::::Investigacion::::"+"\n"+"Claudia: Administración"+"\n"+"Valeria: Artes Gráficas 302"+"\n::::::::Agradecimientos a::::::::"+"\n"+"María Esther Guevara"+"\n"+"Grisel"+"\n"+"Claudia"+"\n"+"Valeria"+"\n"+"Por todo el apoyo que nos brindaron Gracias"+"\n::::::::::::::::::::::::","GottAProyect Inc. Creditos",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		
   }//Fin clase Ahorcado