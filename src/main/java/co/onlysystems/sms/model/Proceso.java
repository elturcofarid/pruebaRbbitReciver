package co.onlysystems.sms.model;

public class Proceso {
	
	private Actuacion actuacion;
	private String titulo;
	private String numeroRadicado;
	private String celular;
	private String email;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNumeroRadicado() {
		return numeroRadicado;
	}
	public void setNumeroRadicado(String numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Actuacion getActuacion() {
		return actuacion;
	}
	public void setActuacion(Actuacion actuacion) {
		this.actuacion = actuacion;
	}
	
}
