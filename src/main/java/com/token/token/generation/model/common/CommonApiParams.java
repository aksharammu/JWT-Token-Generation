package com.token.token.generation.model.common;

import com.token.token.generation.enums.CountryCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonApiParams {
    private CountryCodeEnum userCountry;
    private String uuid;
}
