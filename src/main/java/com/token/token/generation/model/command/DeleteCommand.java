package com.token.token.generation.model.command;

import com.token.token.generation.model.common.CommonApiParams;
import com.token.token.generation.model.request.DeleteRequest;
import lombok.Data;

@Data
public class DeleteCommand extends CommonApiParams {
    private DeleteRequest deleteRequest;
}
