package com.jdc04.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.Entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
