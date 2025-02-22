package learning.ProjectLearning.controller;

import learning.ProjectLearning.Entities.Blog;
import learning.ProjectLearning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/v1")
    public List<Blog> getUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/blog/{id}")
    public Blog show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return userService.getUsers().get(blogId);
    }


}
