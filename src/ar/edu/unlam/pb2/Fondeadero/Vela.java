package ar.edu.unlam.pb2.Fondeadero;

public class Vela extends Yate{
	
	private Double alturaMastil;
	private Integer superficie;
	private Integer superficieTotal;

	
	public Vela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulación,
			Double peso, Double alturaMastil, Integer superficie, Integer superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulación, peso);
		this.alturaMastil=alturaMastil;
		this.superficie=superficie;
		this.superficieTotal=superficieTotal;
				
		
	}

}
