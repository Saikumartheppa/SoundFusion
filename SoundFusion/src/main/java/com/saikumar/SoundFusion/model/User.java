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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@gmail\\.com$",message = "User email should be Something@gmail.com")
    @Column(unique = true)
    private String userEmail;
    @NotBlank(message = "user Password should not be blank")
    private String userPassword;
    @Enumerated(EnumType.STRING)
    private Gender userGender;

}
