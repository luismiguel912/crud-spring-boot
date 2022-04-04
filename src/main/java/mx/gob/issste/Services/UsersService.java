package mx.gob.issste.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.issste.Repository.UserRepository;

import mx.gob.issste.Entity.Users;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;
    
    public List<Users> getAllUsers() {
        List<Users> usuarios = userRepository.findAll();
        return usuarios;
    }
}
