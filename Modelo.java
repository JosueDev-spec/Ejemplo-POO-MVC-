package APP1;

public class Modelo {
	private String  nombre ;
	private int edad;
	private int cedula;
	private String genero;

		public Modelo() {
			this.nombre="Vacio";
			this.edad=0;
			this.cedula=0;
			this.genero="Indefinido";
	}
	public Modelo(String nombre, int edad, int cedula,String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.genero=genero;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCedula() {
		return cedula;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String esMayor() {
		String cadena;
		if(this.getEdad()>=18) {
			cadena ="SI";
		}else {
			cadena ="NO";
		}
		return cadena;
	}
	@Override
	public String toString() {
		return " Genero : "+ genero + "\nNombre : " + nombre + "\nEdad : " + edad + " años\nCedula : " + cedula + "\nMayor de Edad : " + esMayor()+"\n";
	}
	
}

