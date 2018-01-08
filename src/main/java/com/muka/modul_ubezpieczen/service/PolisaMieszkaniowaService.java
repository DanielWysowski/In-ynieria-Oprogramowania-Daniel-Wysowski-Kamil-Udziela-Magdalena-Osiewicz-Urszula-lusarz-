package com.muka.modul_ubezpieczen.service;

import com.muka.modul_ubezpieczen.domain.Ubezpieczenie.PolisaMieszkaniowa;
import com.muka.modul_ubezpieczen.repository.PolisaMieszkaniowaRepository;
import com.muka.modul_ubezpieczen.repository.UbezpieczenieRuchomosciDomowychRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

/**
 * Created by Magda on 27.12.2017.
 */
@Service
public class PolisaMieszkaniowaService {


    @Autowired
    private PolisaMieszkaniowaRepository polisaMieszkaniowaRepository;


    private final List<PolisaMieszkaniowa> polisy = new ArrayList<>();


    @Autowired
    private UbezpieczenieRuchomosciDomowychRepository ubezpieczenieRuchomosciDomowychRepository;

    public PolisaMieszkaniowa dodajPoliseMieszkaniowa(PolisaMieszkaniowa polisaMieszkaniowa) {
        return polisaMieszkaniowaRepository.save(polisaMieszkaniowa);
    }

    public PolisaMieszkaniowa uaktualnijPoliseMieszkaniowa(PolisaMieszkaniowa polisaMieszkaniowa) {
        return polisaMieszkaniowaRepository.save(polisaMieszkaniowa);
    }

    public PolisaMieszkaniowa findOneById(Long polisaMieszkaniowaId) {
        return ofNullable(polisaMieszkaniowaRepository.findOne(polisaMieszkaniowaId)).orElseThrow(ResourceNotExistException::new);
    }

    public PolisaMieszkaniowa findOne(Long polisaMieszkaniowaId) {
        return polisaMieszkaniowaRepository.findOne(polisaMieszkaniowaId);
    }

    public void deleteUbezpieczenieRuchomosciDomowych(Long polisaMieszkaniowaId) {
        ubezpieczenieRuchomosciDomowychRepository.delete(ubezpieczenieRuchomosciDomowychRepository.findByPolisaMieszkaniowaIdPolisaMieszkaniowa(polisaMieszkaniowaId));
    }

    public List<PolisaMieszkaniowa> pobierzPolisy() {
        return polisaMieszkaniowaRepository.findAll();
    }


}
