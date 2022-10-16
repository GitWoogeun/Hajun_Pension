package com.hajun.pension.service;

import com.hajun.pension.dto.PensionCustDto;
import com.hajun.pension.mapper.PensionCustMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class PensionCustService {

    // 회원 가입 시 저장시간을 넣어줄 DateTime 표현
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date nowDate = new Date();
    String strNowDate = format.format(nowDate);

    @Autowired
    private PensionCustMapper pensionCustMapper;

    @Transactional
    public void joinCust(PensionCustDto custDto)
    {
        System.out.println("joinCust Service 호출 ....");
        custDto.setCustNo(1);
        custDto.setCustId(custDto.getCustId());
        custDto.setCustPassword(custDto.getCustPassword());
        custDto.setCustName(custDto.getCustName());
        custDto.setCustAddress(custDto.getCustAddress());
        custDto.setCustPhonNumber(custDto.getCustPhonNumber());
        custDto.setSocialIdYn("N");
        custDto.setRegDate(strNowDate);

        pensionCustMapper.saveCust(custDto);
    }
}
