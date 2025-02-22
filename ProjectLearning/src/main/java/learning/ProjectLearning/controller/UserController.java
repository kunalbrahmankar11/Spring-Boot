package learning.ProjectLearning.controller;

import learning.ProjectLearning.Entities.Blog;
import learning.ProjectLearning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/v1/{id}")
    public ResponseEntity<Blog> show(@PathVariable String id) {
        try {
            int blogId = Integer.parseInt(id);
            List<Blog> users = userService.getUsers();

            if (users == null || blogId < 0 || blogId >= users.size()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            return ResponseEntity.ok(users.get(blogId));
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }



}
