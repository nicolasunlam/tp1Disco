package ar.edu.unlam.pb2.tp1Disco;



public class Disco {
	private Double diametroMayor;
	private Double diametroMenor;
	private Double radioExterno;
	private Double radioInterno;
	private Double superficie;
	private Double perimetroExterno;
	private Double perimetroInterno;

	public Disco(Double diametroMayor, Double diametroMenor) {
		this.diametroMayor = diametroMayor;
		this.diametroMenor = diametroMenor;
	}

	public Double getPerimetroExterno() {
		return perimetroExterno;
	}

	public void setPerimetroExterno(Double radioExterno) {
		this.perimetroExterno = 2 * 3.14 * radioExterno;
	}

	public Double getPerimetroInterno() {
		return perimetroInterno;
	}

	public void setPerimetroInterno(Double radioInterno) {
		this.perimetroInterno = 2 * 3.14 * radioInterno;
	}



	public Double getRadioExterno() {
		return radioExterno;
	}

	public void setRadioExterno(Double diametroMayor, Double diametroMenor) {
		
		this.radioExterno = ((diametroMayor - diametroMenor)+(diametroMayor+diametroMenor))/4;
	}

	public Double getRadioInterno() {
		return radioInterno;
	}

	public void setRadioInterno(Double diametroMayor, Double diametroMenor) {
		
		this.radioInterno = ((diametroMayor+diametroMenor)-(diametroMayor-diametroMenor))/4;
		
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double diametroMayor, Double diametroMenor) {
		this.superficie = (3.14 *diametroMayor)-(3.14*diametroMenor);
	}
	
	
		
	
	}//
	
	
	
