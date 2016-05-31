package kr.domaindriven.service;

import kr.domaindriven.model.Worker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by donghoon on 2016. 5. 31..
 */
public interface IWorkerService {

    Worker save(Worker worker);

    Page<Worker> findAll(Pageable pageable);

    Worker findByName(String name);

    Long count();
}
