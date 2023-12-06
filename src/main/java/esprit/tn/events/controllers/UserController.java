package esprit.tn.events.controllers;

import esprit.tn.events.entities.User;
import esprit.tn.events.services.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserServiceImp userServiceImp;



    //private String title ="hello,i'm the candidate micro service";

    @GetMapping("/hello")
    public String sayHello(){
        //System.out.println(title);
        return "hello,i'm the candidate micro service";

    }

    @PostMapping("/addUser")
    private User addUser(@RequestBody User u){
        return userServiceImp.addUser(u);
    }

    @PutMapping("/updateUser")
    private User updateUser(@RequestBody User u){
        return userServiceImp.updateUser(u);
    }

    @GetMapping("/findAllUsers")
    private List<User> findAllUsers(){
        return userServiceImp.findAllUsers();
    }

    @GetMapping("/findById/{idU}")
    private User findById(@PathVariable Integer idU){
        return userServiceImp.findById(idU);
    }
    @DeleteMapping("/deleteUser/{idU}")
    private void deleteUser(@PathVariable Integer idU){
        userServiceImp.deleteUser(idU);
    }

    @GetMapping("/searchByName")
    private List<User> searchByName(@RequestParam String firstName, @RequestParam String lastName) {
        return userServiceImp.searchByName(firstName, lastName);
    }
}
