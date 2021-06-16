package co.onlysystems.notificador.service;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class NotificacionConfig {
   

    @Bean
    public NotificadorServices notificacion() {
	return new NotificadorServices();
    }
    
 
}