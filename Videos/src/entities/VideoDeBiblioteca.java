package entities;

public class VideoDeBiblioteca extends ArquivoDeVideo implements ItemDeBiblioteca{
	private String author;
	private boolean emprestado;
	
	public VideoDeBiblioteca() {
		super();
	}
	public VideoDeBiblioteca(double horas, double minutos, String formato, String author, boolean emprestado) {
		super(horas, minutos, formato);
		this.author = author;
		this.emprestado = emprestado;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean getEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	@Override
	public void empresta() {
		setEmprestado(true);
	}
	
	@Override
	public void devolve() {
		setEmprestado(false);
	}
	
	public String toString() {
		String resultado = "tamanho do vídeo: "
				+ String.format("%02.0f", super.getHoras())
				+ ":"
				+ String.format("%02.0f", super.getMinutos())
				+ "\n"
				+"Formato do vídeo: "+super.getFormato()
				+ "\nAutor do vídeo: "+getAuthor();
		if(getEmprestado()==true) {
			return resultado += "\nLivro encontra-se emprestado";
		} else {
			return resultado += "\nLivro disponível";
		}
	}
	
}
