package kr.domaindriven.service;

import kr.domaindriven.model.Instructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by jerry on 2016-06-02.
 */
public interface IInstructorService {

    Instructor save(Instructor worker);

    Instructor findByName(String name);

    Page<Instructor> findAll(Pageable pageable);

    Long count();
}
