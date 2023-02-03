package com.bala.app.consumer;

import com.bala.app.producer.ArtemisProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ArtemisConsumer {
    @Autowired
    ArtemisProducer producer;

    @JmsListener(destination = "${jms.out.queue.destination}")
    public void receive(String msg){
        System.out.println("Consumer Got Message: " + msg);
        producer.send("Consumer send back:"+msg);
    }

}

