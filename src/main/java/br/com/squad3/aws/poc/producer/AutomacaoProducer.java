package br.com.squad3.aws.poc.producer;

import br.com.squad3.aws.poc.model.Portability;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AutomacaoProducer {

    private static final String QUEUE_NAME = "automacao_queue";

    private final QueueMessagingTemplate queueMessagingTemplate;

    public void producer(Portability portability){
        queueMessagingTemplate.convertAndSend(QUEUE_NAME, portability);
    }
}
