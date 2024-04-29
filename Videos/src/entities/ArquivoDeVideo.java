package entities;

public class ArquivoDeVideo {
	protected double horas;
	protected double minutos;
	protected String formato;
	
	public ArquivoDeVideo() {
		
	}
	public ArquivoDeVideo(double horas,double minutos,String formato) {
		this.formato = formato;
		this.horas = horas;
		this.minutos = minutos;
	}
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getMinutos() {
		return minutos;
	}
	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String toString() {
		return "tamanho do video: "
				+ String.format("%02.0f", getHoras())
				+ ":"
				+ String.format("%02.0f", getMinutos())
				+ "\n"
				+"Formato do video: "+getFormato();
		}
	
}
