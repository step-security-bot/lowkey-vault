package com.github.nagyesta.lowkeyvault.model.v7_3.key;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RandomBytesRequest {

    @JsonProperty("count")
    @Min(1)
    private int count;

}
