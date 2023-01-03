package com.token.token.generation.model.command;

import com.token.token.generation.model.common.CommonApiParams;
import com.token.token.generation.model.request.UpdatePasswordRequest;
import lombok.Data;

@Data
public class UpdatePasswordCommand extends CommonApiParams {
    private UpdatePasswordRequest updatePasswordRequest;
}
