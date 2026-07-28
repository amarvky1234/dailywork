package com.ri.boot.conversion.converter;

import com.ri.boot.conversion.dto.IFSCCode;
import jakarta.ws.rs.ext.ParamConverter;

public class IFSCCodeParamConverter implements ParamConverter<IFSCCode> {
    @Override
    public IFSCCode fromString(String value) {
        final IFSCCode ifscCode = IFSCCode.of().bankCode(value.substring(0,4))
                .branchCode(value.substring(4,11)).build();
        return ifscCode;
    }

    @Override
    public String toString(IFSCCode ifscCode) {
        return ifscCode.getBankCode()+ifscCode.getBranchCode();
    }
}
