package com.muka.modul_ubezpieczen.service;

import com.muka.modul_ubezpieczen.domain.Klient.Klient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Magda on 18.12.2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KlientDTO {

    private Long id;
    private String imie;
    private String nazwisko;
    private String adresZamieszkania;
    private Integer kodPocztowy;
    private String email;
    private Integer numerTelefonu;
    private Long pesel;
    private String seriaDowodu;



    public static KlientDTO ofKlient(Klient klient) {
        return new KlientDTO(klient.getIdKlient(), klient.getImie(), klient.getNazwisko(), klient.getAdresZamieszkania(),
                             klient.getKodPocztowy(), klient.getEmail(), klient.getNumerTelefonu(), klient.getPesel(), klient.getSeriaDowodu());
    }


}
