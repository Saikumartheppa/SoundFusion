package com.saikumar.SoundFusion.model;

import com.saikumar.SoundFusion.model.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String adminName;
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@soundfusionadmin\\.com$",message = "Admin email should be something@soundfusionadmin.com")
    @Column(unique = true)
    private String adminEmail;
    @NotBlank(message = "Admin password should not be blank")
    private String adminPassword;
    @Enumerated(EnumType.STRING)
    private Gender adminGender;
}
