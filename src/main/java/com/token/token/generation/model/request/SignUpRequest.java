package com.token.token.generation.model.request;

import com.token.token.generation.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    private String userName ;
    private Integer userAge;
    private GenderEnum userGender;
    private String userMail;
    private String userPhoneNo;
    private String userPassword;
}
