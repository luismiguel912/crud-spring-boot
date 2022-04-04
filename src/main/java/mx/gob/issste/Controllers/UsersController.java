package mx.gob.issste.Controllers;
import mx.gob.issste.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import mx.gob.issste.Services.UsersService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController{
    @Autowired
    private UsersService userService;

    @GetMapping(value = "")
    public ResponseEntity<List<Users>> getallUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }

}