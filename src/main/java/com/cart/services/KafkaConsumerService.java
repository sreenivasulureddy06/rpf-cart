package com.cart.services;

import com.cart.beans.CartBean;
import com.rpf.inventory.beans.InventoryBean;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class KafkaConsumerService {

    private final CartService service;

    @KafkaListener(
            topics = "${inventory.topic.name}",
            groupId = "${inventory.group.name}"
    )
    public void consume(InventoryBean bean) {
        log.info("============Message Received========= {} ", bean);
        log.info("Product Name: {}", bean.getName());
        service.save(bean);
        log.info("Message process successfully");
    }
}
