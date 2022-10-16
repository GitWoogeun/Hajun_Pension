package com.hajun.pension.mapper;

import com.hajun.pension.dto.PensionCustDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PensionCustMapper {

    void saveCust(PensionCustDto custDto);
}
