package com.muka.modul_ubezpieczen.service;

import com.muka.modul_ubezpieczen.domain.Faktura.FakturaMieszkaniowa;
import com.muka.modul_ubezpieczen.domain.Ubezpieczenie.PolisaMieszkaniowa;
import com.muka.modul_ubezpieczen.domain.Ubezpieczenie.UbezpieczenieRuchomosciDomowych;
import com.muka.modul_ubezpieczen.domain.Ubezpieczenie.ZabezpieczeniePrzeciwkradziezowe;
import com.muka.modul_ubezpieczen.repository.ZabezpieczeniePrzeciwkradziezoweRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Optional.ofNullable;

/**
 * Created by Magda on 28.12.2017.
 */
@Service
public class ZabezpieczeniePrzeciwkradziezoweService {

    @Autowired
    ZabezpieczeniePrzeciwkradziezoweRepository zabezpieczeniePrzeciwkradziezoweRepository;


    public ZabezpieczeniePrzeciwkradziezowe dodajZabezpieczeniePrzeciwkradziezowe(ZabezpieczeniePrzeciwkradziezowe zabezpieczeniePrzeciwkradziezowe){
        return  zabezpieczeniePrzeciwkradziezoweRepository.save(zabezpieczeniePrzeciwkradziezowe);
       ////////////////////////////////////////

    }

    public ZabezpieczeniePrzeciwkradziezowe findOneById(Long zabezpieczeniePrzeciwkradziezoweId) {
        return ofNullable(zabezpieczeniePrzeciwkradziezoweRepository.findOne(zabezpieczeniePrzeciwkradziezoweId)).orElseThrow(ResourceNotExistException::new);
    }

    public ZabezpieczeniePrzeciwkradziezowe modyfikujZabezpieczeniePrzeciwkradziezowe(ZabezpieczeniePrzeciwkradziezowe zabezpieczeniePrzeciwkradziezowe) {
        return zabezpieczeniePrzeciwkradziezoweRepository.save(zabezpieczeniePrzeciwkradziezowe);
    }

    public ZabezpieczeniePrzeciwkradziezowe findOne(Long idZabezpieczeniePrzeciwkradziezowe) {
        return zabezpieczeniePrzeciwkradziezoweRepository.findOne(idZabezpieczeniePrzeciwkradziezowe);
    }

    public List<ZabezpieczeniePrzeciwkradziezowe> pobierzZabezpieczeniaPrzeciwkradziezowe() {
        return zabezpieczeniePrzeciwkradziezoweRepository.findAll();
    }

    public ZabezpieczeniePrzeciwkradziezowe pobierzZabezpieczeniePrzeciwkradziezoweByIdPolisaMieszkaniowa(Long polisaMieszkaniowaId){
        return zabezpieczeniePrzeciwkradziezoweRepository.findByPolisaMieszkaniowaIdPolisaMieszkaniowa(polisaMieszkaniowaId);
    }


}
