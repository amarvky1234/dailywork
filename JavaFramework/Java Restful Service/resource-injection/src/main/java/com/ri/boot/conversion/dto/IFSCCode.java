package com.ri.boot.conversion.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class IFSCCode {
    private String bankCode;
    private String branchCode;
}
