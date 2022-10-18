package ar.edu.unlam.pb2.Fondeadero;

public class Motor extends Yate {
	
	private Double desplazamiento;
	private String propulsion;
	private Integer potencia;
	private Integer velocidad;
	private Integer autonomia;

	public Motor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulación,
			Double peso, Double desplazamiento, Integer potencia, Integer velocidad, Integer autonomia, String propulsion) {
		super(nombre, duenio, manga, calado, eslora, tripulación, peso);
		this.desplazamiento=desplazamiento;
		this.propulsion=propulsion;
		this.potencia=potencia;
		this.velocidad=velocidad;
		this.autonomia=autonomia;
		
	}

}

