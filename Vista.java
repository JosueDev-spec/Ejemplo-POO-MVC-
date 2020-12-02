package APP1;

import javax.swing.JOptionPane;

public class Vista {
	public Vista() {
		
	}
	public void MostrarBienvenida() {
		JOptionPane.showMessageDialog(null,"Bienvenido al Sistema");
		
	}
	public String  PedirNombre(){
		String nombre;
		do
		{
			nombre = JOptionPane.showInputDialog("Escriba su Nombre");
			if(nombre==null) 
			{
				JOptionPane.showMessageDialog(null,"No puede dejar el campo vacio");
			}
		}
		while(nombre==null);
		
		
		return nombre;
			
		
		
	}
	public int PedirEdad() {
		
		int edad =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
			
	
		
		return edad;
	}
	public int PedirID() {
		int id;
		
		id =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu ID"));
		
		return id;
	}
	public String pedirGenero() {
		String genero=" ";
		String []Opciones={"Masculino ","Femenino "};
		
		 int opc = JOptionPane.showOptionDialog(null, "Seleccione tu genero","\4 Genero \4 ",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Opciones, Opciones[0]);
			if(opc==0) {
				genero=Opciones[0];
			}
			else if(opc==1) {
				genero= Opciones[1];
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Hubo error");
			}
			


		return genero;
	}

	public void MostarInfoPersona(String toString) {
		
		JOptionPane.showMessageDialog(null,toString);
	}
	
}


