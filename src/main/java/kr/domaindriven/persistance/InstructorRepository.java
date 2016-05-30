package kr.domaindriven.persistance;

import kr.domaindriven.model.Instructor;
import kr.domaindriven.model.Seminar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by jaeyeoul on 2016. 5. 30..
 * <p/>
 * MongoRepository 받음으로 인해 기본 crud 작업을 하기위한 인터페이스가 구현되어 있다.
 */
public interface InstructorRepository extends MongoRepository<Instructor, String> {

    /**
     * The placeholder ?0 lets you substitute the value from the method arguments into the JSON query string.
     *
     * @param title
     * @return
     */
    @Query(value = "{ 'name' : ?0 }")
    Instructor findByName(String name);

}
