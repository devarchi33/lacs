package kr.domaindriven.persistance;

import kr.domaindriven.model.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by donghoon on 2016-05-31.
 */
public interface WorkerRepository extends MongoRepository<Worker, String> {

    Worker findByName(String name);
}
