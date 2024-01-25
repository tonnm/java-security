package com.ton.estudo.authapi.repositories;

import com.ton.estudo.authapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository  extends JpaRepository<User, Integer> {

    UserDetails findByLogin(String login);
}
