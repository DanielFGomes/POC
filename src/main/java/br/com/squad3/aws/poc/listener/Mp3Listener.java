package br.com.squad3.aws.poc.listener;

import br.com.squad3.aws.poc.mapper.PortabilityMapper;
import br.com.squad3.aws.poc.model.Mp3Message;
import br.com.squad3.aws.poc.producer.AutomacaoProducer;
import br.com.squad3.aws.poc.service.PortabilityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Mp3Listener {

    private static final String QUEUE_NAME = "mp3_queue";

    private final PortabilityService portabilityService;

    private final AutomacaoProducer automacaoProducer;

    @SqsListener(QUEUE_NAME)
    private void receiveMessage(Mp3Message message) {
        log.info("Received SQS message from MP3 Queue \n {}", message);
        var portability = PortabilityMapper.to(message);
        log.info("Saving portability into DynamoDB \n {}", portability);
        portabilityService.save(portability);
        log.info("Producing message to Automação Queue \n {}", portability);
        automacaoProducer.producer(portability);
    }
}
