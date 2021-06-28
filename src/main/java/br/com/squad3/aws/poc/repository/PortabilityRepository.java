package br.com.squad3.aws.poc.repository;

import br.com.squad3.aws.poc.model.Portability;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface PortabilityRepository extends CrudRepository<Portability, String> {

}
