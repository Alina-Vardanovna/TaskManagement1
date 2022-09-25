package am.itspace.taskmanagement1.repository;

import am.itspace.taskmanagement1.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Integer> {
}
