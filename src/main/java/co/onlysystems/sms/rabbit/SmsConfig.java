package co.onlysystems.sms.rabbit;



import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import co.onlysystems.email.service.EmailPort;
import co.onlysystems.email.service.EmailService;
import co.onlysystems.notificador.service.NotificadorServices;

/**
 * Clase que contiene la definicion de los beans para el ejemplo de HelloWorld de integración de RabbitMQ con Spring
 * AMQP
 * 
 *
 */
//@Profile({ "tut1", "hello-world" })
@Configuration
@Component("sms")
public class SmsConfig {


    
    /**
     * Creamos un enviador de mensajes
     * 
     * @return Enviador de mensajes
     */
 //   @Profile("sender")
    @Bean
    public SmsReceiver receive() {
	return new SmsReceiver();
    }
    
    /************************************************/
    
//    @Bean
//    public NotificadorServices notificacion() {
//	return new NotificadorServices();
//    }
//    
//    @Bean
//    public EmailService email() {
//	return new EmailService();
//    }
    
    
   

}