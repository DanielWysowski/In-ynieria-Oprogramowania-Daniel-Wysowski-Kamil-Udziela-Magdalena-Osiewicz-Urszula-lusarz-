package com.muka.modul_ubezpieczen.service;

import com.muka.modul_ubezpieczen.domain.Klient.Klient;
import com.muka.modul_ubezpieczen.repository.KlientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Magda on 18.12.2017.
 */
@Service
public class KlientService {

    @Autowired
    private KlientRepo klientRepo;

    public Klient addKlient(Klient klient) {
        return klientRepo.save(klient);
    }
}
