package com.spring.restapi.repository;


import com.spring.restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

        public void save(User user){
            System.out.println("SAVE - Receiving the user in the repository layer");
            System.out.println(user);
        }
        public void update(User user){
            System.out.println("UPDATE - Receiving the user in the repository layer");
            System.out.println(user);
        }
        public void remove(Integer id){
            System.out.println(String.format("DELETE/id - Receiving the ID: %d to delete an user", id));
            System.out.println(id);
        }
        public List<User> listAll(){
            System.out.println("LIST - Listing all system users");
            List<User> usuarios = new ArrayList<>();
            usuarios.add(new User("klebeiro","password"));
            usuarios.add(new User("frank","masterpass"));
            return usuarios;
        }
        public User findById(Integer id){
            System.out.println(String.format("FIND/id - Receiving the ID: %d to find an user", id));
            return new User("klebeiro","password");
        }
}
