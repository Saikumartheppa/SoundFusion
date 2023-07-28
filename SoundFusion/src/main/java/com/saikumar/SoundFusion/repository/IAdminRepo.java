package com.saikumar.SoundFusion.repository;

import com.saikumar.SoundFusion.model.Admin;
import com.saikumar.SoundFusion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo  extends JpaRepository<Admin,Long> {

    Admin findFirstByAdminEmail(String newEmail);
}
