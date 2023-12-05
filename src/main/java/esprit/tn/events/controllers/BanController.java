package esprit.tn.events.controllers;


import esprit.tn.events.entities.Ban;
import esprit.tn.events.services.BanServiceImp;
import esprit.tn.events.services.Iban;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BanController {
    Iban iban;
    BanServiceImp banServiceImp;
    @PostMapping("/addBan")
    public Ban addBan(@RequestBody Ban ban){ // @RequestBody when we pass object
        return banServiceImp.addBan(ban);
    }

    @PutMapping("/updateBan")
    public Ban updateBan(@RequestBody Ban ban){
        return banServiceImp.updateBan(ban);
    }

    @GetMapping("/Bans")
    public List<Ban> findAllBan(){
        return banServiceImp.findAllBan();
    }

    @GetMapping("/getBanbyid/{id}")
    public Ban findByIdBan(@PathVariable long id){
        return banServiceImp.findByIdBan(id);
    }

    @DeleteMapping("/deleteBan/{id}")
    public String deleteById(@PathVariable long id){
        banServiceImp.deleteBan(id);
        return "Ban is removed";
    }
    @PostMapping("/addBanAndAssignUser/{iduser}")
    public Ban addBanandAssaginItToUser(@RequestBody Ban ban,@PathVariable long iduser){
        return iban.addBanandAssaginItToUser(ban,iduser);
    }



}
