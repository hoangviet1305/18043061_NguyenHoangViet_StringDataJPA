package Controller;

import DTO.UserDto;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping
    public UserDto saveUser(@RequestBody User user){
        return new UserDto(userService.saveUser(user));
    }
    @GetMapping
    public List<UserDto> getListUsers(){
        List<User> list=userService.getAllUsers();
        List<UserDto> l1=new ArrayList<>();
        for (User user:list){
            l1.add(new UserDto(user));
        }
        return l1;
    }
}
