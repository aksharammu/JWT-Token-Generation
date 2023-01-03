package com.token.token.generation.model.request;

import com.token.token.generation.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProfileRequest {
    private String userName ;
    private String newUsername;
    private Integer userAge;
    private GenderEnum userGender;
    private String userMail;
    private String userPhoneNo;
    private String userPassword;
}
