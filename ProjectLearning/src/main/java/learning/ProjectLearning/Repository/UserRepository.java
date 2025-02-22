package learning.ProjectLearning.Repository;

import learning.ProjectLearning.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Blog,Long> {
}
