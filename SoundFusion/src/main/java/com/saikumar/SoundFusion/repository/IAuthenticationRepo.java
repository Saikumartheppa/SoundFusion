package com.saikumar.SoundFusion.repository;

import com.saikumar.SoundFusion.model.Admin;
import com.saikumar.SoundFusion.model.AuthenticationToken;
import com.saikumar.SoundFusion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo  extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String tokenValue);

    AuthenticationToken findFirstByUser(User user);

    AuthenticationToken findFirstByAdmin(Admin admin);
}
