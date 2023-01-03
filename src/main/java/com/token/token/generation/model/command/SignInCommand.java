package com.token.token.generation.model.command;

import com.token.token.generation.model.common.CommonApiParams;
import com.token.token.generation.model.request.SignInRequest;
import lombok.Data;

@Data
public class SignInCommand extends CommonApiParams {
    private SignInRequest signInRequest;
}
