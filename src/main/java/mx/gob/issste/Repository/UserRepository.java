package mx.gob.issste.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import mx.gob.issste.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
    
}
