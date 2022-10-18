package ar.edu.unlam.pb2.Fondeadero;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Amarrados {
	
	private Yate yate;
	private Integer lugaresOcupados;
	
	public Amarrados(Yate yate) {
		this.yate = yate;
		this.setLugaresOcupados(0);
		
	}

	public Yate getYate() {
		return yate;
	}

	public void setYate(Yate yate) {
		this.yate = yate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(yate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarrados other = (Amarrados) obj;
		return Objects.equals(yate, other.yate);
	}

	public Integer getLugaresOcupados() {
		return lugaresOcupados;
	}

	public void setLugaresOcupados(Integer lugaresOcupados) {
		this.lugaresOcupados = lugaresOcupados;
	}
	
	
}
