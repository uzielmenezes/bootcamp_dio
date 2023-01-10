package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository reposiitory;
    @GetMapping()
    public List<User> getUsers() {
        return reposiitory.findAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return reposiitory.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        reposiitory.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody User user) {
        reposiitory.save(user);
    }
    @PutMapping()
    public void putUser(@RequestBody User user) {
        reposiitory.save(user);
    }
}
