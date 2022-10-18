package ar.edu.unlam.pb2.Fondeadero;

public class Yate {
	
	protected String nombre;
	protected String duenio;
	protected Double manga;
	protected Double calado;
	protected Double eslora;
	protected Integer tripulacion;
	protected Double peso;
	

	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulación,
			Double peso) {
		
		this.nombre=nombre;
		this.duenio= duenio;
		this.manga= manga;
		this.calado=calado;
		this.eslora=eslora;
		this.tripulacion=tripulacion;
		this.peso = peso;
				
		
	}


	public String getNombre() {
		return nombre;
	}


	public Double getEslora() {
		return eslora;
	}


	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}
	
	

}
