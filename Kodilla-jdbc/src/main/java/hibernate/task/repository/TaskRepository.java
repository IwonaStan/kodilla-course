package hibernate.task.repository;

import hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
