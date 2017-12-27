package com.muka.modul_ubezpieczen.web.rest;

import com.muka.modul_ubezpieczen.domain.Klient.Klient;
import com.muka.modul_ubezpieczen.service.KlientDTO;
import com.muka.modul_ubezpieczen.service.KlientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

import static com.muka.modul_ubezpieczen.service.KlientDTO.ofKlient;

/**
 * Created by Magda on 17.12.2017.
 */

@RestController
@RequestMapping("/api/klient")
public class KlientController {

    @Autowired
    KlientService klientService;

    @PostMapping()
    public ResponseEntity<KlientDTO> addKlient(KlientDTO klient) throws URISyntaxException {

        Klient klientToPersist = new Klient(klient.getImie(), klient.getNazwisko(), klient.getAdresZamieszkania(),klient.getKodPocztowy(), klient.getEmail(), klient.getNumerTelefonu(), klient.getPesel(), klient.getSeriaDowodu());
        Klient persistedKlient = klientService.addKlient(klientToPersist);

        return ResponseEntity.created(new URI("/api/klient/" + persistedKlient.getIdKlient()))
            .body(ofKlient(persistedKlient));
    }



















}

