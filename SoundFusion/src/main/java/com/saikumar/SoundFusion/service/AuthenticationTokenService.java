package com.saikumar.SoundFusion.service;

import com.saikumar.SoundFusion.model.Admin;
import com.saikumar.SoundFusion.model.AuthenticationToken;
import com.saikumar.SoundFusion.model.User;
import com.saikumar.SoundFusion.repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {
    @Autowired
    IAuthenticationRepo authenticationRepo;

    public void save(AuthenticationToken authenticationToken) {
        authenticationRepo.save(authenticationToken);
    }

    public boolean authenticateUser(String email, String tokenValue) {
        AuthenticationToken authenticationToken = authenticationRepo.findFirstByTokenValue(tokenValue);
        if(authenticationToken == null){
            return false;
        }
        String tokenConnectedEmail = authenticationToken.getUser().getUserEmail();
        return tokenConnectedEmail.equals(email);
    }
    public boolean authenticateAdmin(String email, String tokenValue) {
        AuthenticationToken authenticationToken = authenticationRepo.findFirstByTokenValue(tokenValue);
        if(authenticationToken == null){
            return false;
        }
        String tokenConnectedEmail = authenticationToken.getAdmin().getAdminEmail();
        return tokenConnectedEmail.equals(email);
    }
    public AuthenticationToken findFirstByUser(User user) {
        return authenticationRepo.findFirstByUser(user);
    }

    public void remove(AuthenticationToken authenticationToken) {
        authenticationRepo.delete(authenticationToken);
    }

    public AuthenticationToken findFirstByAdmin(Admin admin) {
       return  authenticationRepo.findFirstByAdmin(admin);
    }

    public void removeAdminToken(AuthenticationToken authenticationToken) {
        authenticationRepo.delete(authenticationToken);
    }


}
