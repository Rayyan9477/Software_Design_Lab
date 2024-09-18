package Rayyan.SpringBootRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Rayyan.SpringBootRest.entity.User;

public interface UserDao extends JpaRepository<User, Integer>  {

}
