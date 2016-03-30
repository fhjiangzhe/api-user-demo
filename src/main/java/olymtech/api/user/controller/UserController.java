package olymtech.api.user.controller;

import olymtech.api.user.domain.User;
import olymtech.api.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by JiangZhe on 16/3/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void del(Long id){
        userRepository.delete(id);
    }


}
