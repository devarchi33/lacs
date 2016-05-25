package kr.domaindriven.persistance;

import kr.domaindriven.model.Seminar;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by donghoon on 2016. 5. 26..
 * <p/>
 * MongoRepository 받음으로 인해 기본 crud 작업을 하기위한 인터페이스가 구현되어 있다.
 */
public interface SeminarRepository extends MongoRepository<Seminar, String> {
}
