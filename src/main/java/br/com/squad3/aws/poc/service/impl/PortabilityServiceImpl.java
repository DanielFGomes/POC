package br.com.squad3.aws.poc.service.impl;

import br.com.squad3.aws.poc.model.Portability;
import br.com.squad3.aws.poc.repository.PortabilityRepository;
import br.com.squad3.aws.poc.service.PortabilityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PortabilityServiceImpl implements PortabilityService {

    private final PortabilityRepository portabilityRepository;

    @Override
    public void save(Portability portability) {
        portabilityRepository.save(portability);
    }
}
