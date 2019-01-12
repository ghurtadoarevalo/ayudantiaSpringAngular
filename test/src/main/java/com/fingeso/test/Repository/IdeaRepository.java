package com.fingeso.test.Repository;
import com.fingeso.test.Model.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends MongoRepository<Idea, String>{

    Idea findIdeaByIdNumber(String idNumber);
    Idea findIdeaByName(String name);
}
