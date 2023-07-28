package com.saikumar.SoundFusion.model.dtos.admin;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminSignInInput {
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@soundfusionadmin\\.com$",message = "Admin email should be something@soundfusionadmin.com")
    private String email;
    private String password;
}
