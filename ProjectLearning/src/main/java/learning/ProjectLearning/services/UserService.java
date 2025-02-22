package learning.ProjectLearning.services;
import learning.ProjectLearning.Entities.Blog;
import learning.ProjectLearning.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<Blog> getUsers(){
        return userRepository.findAll();
    }
    public List<Blog> getAllUsers() {
        return userRepository.findAll();
    }
}
