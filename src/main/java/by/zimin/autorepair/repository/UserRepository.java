package by.zimin.autorepair.repository;

import by.zimin.autorepair.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
