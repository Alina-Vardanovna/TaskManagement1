package am.itspace.taskmanagement1.repository;

import am.itspace.taskmanagement1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
