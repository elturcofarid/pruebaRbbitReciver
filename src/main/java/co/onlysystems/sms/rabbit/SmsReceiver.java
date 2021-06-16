package co.onlysystems.sms.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import co.onlysystems.notificador.service.NotificadorPort;
import co.onlysystems.notificador.service.NotificadorServices;


@RabbitListener(queues = "prueba")
public class SmsReceiver {

	@Autowired
	private NotificadorServices notificacion; 
    
   
//
//    @RabbitListener(queues = "#{autoDeleteQueue2.name}")
//    public void receive2(String in) throws InterruptedException {
//	receive(in, 2);
//    }

    @RabbitHandler
    public void receive(String in) throws InterruptedException {
//	StopWatch watch = new StopWatch();
//	watch.start();
    	notificacion.notificar(in);   
	System.out.println(" [x] Received '" + in + "'");
    }


}
