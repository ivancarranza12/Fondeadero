package ar.edu.unlam.pb2.Fondeadero;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.Empresa.Empleado;

public class Fondeadero {

	private Integer cantidadMaximaAmarras;
	private List <Amarrados> yatesAmarrados;
	private Integer lugaresOcupados = 7;
	
	
	public Fondeadero(Integer cantidadMaximaAmarras) {
		this.cantidadMaximaAmarras = cantidadMaximaAmarras;
		this.yatesAmarrados = new LinkedList <>();
		
	}
	
	
	
	public Integer getLugaresOcupados() {
		return lugaresOcupados;
	}



	public void setLugaresOcupados(Integer lugaresOcupados) {
		this.lugaresOcupados = lugaresOcupados;
	}



	public List<Amarrados> getYatesAmarrados() {
		return yatesAmarrados;
	}



	public  void setYatesAmarrados(List<Amarrados> yatesAmarrados) {
		this.yatesAmarrados = yatesAmarrados;
	}



	public Integer getCantidadMaximaAmarras() {
		return cantidadMaximaAmarras;
	}
	public void setCantidadMaximaAmarras(Integer cantidadMaximaAmarras) {
		this.cantidadMaximaAmarras = cantidadMaximaAmarras;
	}
	public Boolean agregarYate(Yate yate) {
		Boolean existeElYate = false;
		for (Amarrados yateAmarrado : this.yatesAmarrados) {
			if (yate.equals(yateAmarrado.getYate())) {
		existeElYate = true;
			}
	}
		if (!existeElYate) {
			System.out.println("El yate no existe");
		}
		if (this.getYatesAmarrados().size()<this.cantidadMaximaAmarras) {
		this.setLugaresOcupados(this.getLugaresOcupados()-1);
		this.yatesAmarrados.add(new Amarrados(yate));
		}
		return existeElYate;
}
	public Boolean desamarrarYate(Yate yate) {
		Boolean existeElYate = false;
		for (Amarrados yateAmarrado : this.yatesAmarrados) {
			if (yate.equals(yateAmarrado.getYate())) {
		existeElYate = true;
			}
	}
		if (!existeElYate) {
			System.out.println("El yate no existe");
		}
		if (this.getYatesAmarrados().size()<this.cantidadMaximaAmarras) {
		this.setLugaresOcupados(this.getLugaresOcupados()+1);
		this.yatesAmarrados.remove(new Amarrados(yate));
		}
		return existeElYate;
}



	public Double obtenerPrecioDeAmarre(Yate yate) {
		Double importe = 0.0;
		
		for (Amarrados yateAmarrado :this.yatesAmarrados) {
			if (yate.equals(yateAmarrado.getYate())&&yate.getEslora()>20.0) {
				importe += 3000.0;
				
			}else {
				importe+= 2000.0;
			}
		}
		
		
		return importe;
	
	}
	
	
	}
