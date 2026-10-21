package mx.uam.cua.store.repository;

import mx.uam.cua.store.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {

    List<User> findByLastName(String lastName);

}
