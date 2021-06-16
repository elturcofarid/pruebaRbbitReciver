package co.onlysystems.notificador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import co.onlysystems.email.service.EmailBody;
import co.onlysystems.email.service.EmailService;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

@Service
public class NotificadorServices implements NotificadorPort{

	@Autowired
	private EmailService port; 
	
	
	 @Autowired
	    private Gson gson;
	
	public void notificar(String mensaje) {
		enviaEmail( mensaje) ;
		
		//enviaSms(mensaje);
		
	}
	
	private void enviaEmail(String mensaje) {
		
		//Proceso proceso = gson.fromJson(mensaje, Proceso.class);
		
		EmailBody body = new EmailBody();
		body.setEmail("elturcofarid@gmail.com");
		body.setSubject("Notificación de nuevo mensaje de prueba");
		//body.setContent(gson.toJson(proceso, Proceso.class));
		body.setContent(mensaje);
		
		port.sendEmail(body);
		
	}
	
	private void enviaSms(String mensaje) {
		
		String body =  "{\"message\":\"Text of the SMS message\", \"tpoa\":\"Sender\",\"recipient\":[{\"msisdn\":\"573183830929\"},{\"msisdn\":\"573016412706\"},{\"msisdn\":\"573167738548\"},{\"msisdn\":\"573008609166\"}]}";
		body = body.replace("Text of the SMS message", mensaje.replace("\"", ""));
	
		HttpResponse<String> response = Unirest.post("https://api.labsmobile.com/json/send")
			  .header("Content-Type", "application/json")
			  .basicAuth("fureche@onlysystems.com.co","911VncmSTdkW")
			  .header("Cache-Control", "no-cache")
			  .body(body)
			  .asString();
	
	}
	
}

