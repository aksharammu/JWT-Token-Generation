package com.token.token.generation.model.command;

import com.token.token.generation.model.common.CommonApiParams;
import com.token.token.generation.model.request.SignUpRequest;
import lombok.Data;

@Data
public class SignUpCommand extends CommonApiParams {
    private SignUpRequest signUpRequest;
}
