package com.saikumar.SoundFusion.model.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpOutput {
    private Boolean signupOutputStatus;
    private String signupOutputMessage;

}
