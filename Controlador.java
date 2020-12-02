package APP1;

public class Controlador {
  public Controlador() {
	  
  }
  public void InciarAPP1() {
	  Vista interfaz = new Vista();
	  Modelo model = new Modelo();
	  interfaz.MostrarBienvenida();
	  model.setGenero(interfaz.pedirGenero()); 
	  model.setNombre(interfaz.PedirNombre());
	  model.setEdad(interfaz.PedirEdad());
	  model.setCedula(interfaz.PedirID());
	  interfaz.MostarInfoPersona(model.toString());
	  
  }
  
	
}

