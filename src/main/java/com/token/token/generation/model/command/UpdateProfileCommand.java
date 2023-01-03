package com.token.token.generation.model.command;

import com.token.token.generation.model.request.UpdateProfileRequest;
import lombok.Data;

@Data
public class UpdateProfileCommand {
    private UpdateProfileRequest updateProfileRequest;
}
