package com.muka.modul_ubezpieczen.service;

import com.muka.modul_ubezpieczen.domain.UbezpieczenieDemo;
import com.muka.modul_ubezpieczen.repository.UbezpieczenieDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Magda on 27.12.2017.
 */
@Service
public class UbezpieczenieDemoService {

    @Autowired
    private UbezpieczenieDemoRepository ubezpieczenieDemoRepository;

    public UbezpieczenieDemo addUbezpieczenieDemo(UbezpieczenieDemo ubezpieczenieDemo) {
        return ubezpieczenieDemoRepository.save(ubezpieczenieDemo);
    }
}
