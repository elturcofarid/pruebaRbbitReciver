package co.onlysystems.sms.model;

public class Notificacion {
	
	public Email email;
	
	public Sms sms;
	
	public Actuacion actuacion;
	
	public Notificacion() {}

	public Notificacion(Email email, Sms sms, Actuacion actuacion) {		
		this.email = email;
		this.sms = sms;
		this.actuacion = actuacion;
	}

	
	
}
