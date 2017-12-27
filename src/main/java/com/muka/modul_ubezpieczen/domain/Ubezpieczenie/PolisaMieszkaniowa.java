package com.muka.modul_ubezpieczen.domain.Ubezpieczenie;

import com.muka.modul_ubezpieczen.domain.Faktura.FakturaMieszkaniowa;
import com.muka.modul_ubezpieczen.domain.Inne.Pracownik;
import com.muka.modul_ubezpieczen.domain.Inne.WariantTurystyczny;
import com.muka.modul_ubezpieczen.domain.Klient.Klient;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magda on 25.12.2017.
 */


@NoArgsConstructor
@Getter
@Entity
@Table(name = "POLISY_MIESZKANIOWE")
public class PolisaMieszkaniowa {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPolisaMieszkaniowa;

    @ManyToOne
    private Ubezpieczenie ubezpieczenie;  // ubezpieczenia

    @ManyToOne
    private Klient klient;

    @ManyToOne
    private Pracownik pracownik;

    @JoinColumn
    @OneToMany
    private List <FakturaMieszkaniowa> fakturyMieszkaniowe = new ArrayList <FakturaMieszkaniowa>();



    @Column(name = "Miasto ", length = 60)
    private String miasto;

    @Column(name = "KodPocztowy ", length = 60)
    private Integer kodPcztowy;

    @Column(name = "Ulica ", length = 60)
    private String ulica;

    @Column(name = "Numer_budynku ", length = 60)
    private Integer numerBudynku;

    @Column(name = "Numer_mieszkania ", length = 60)
    private Integer numerMieszkania;

    //@Column(name = "Typ ", length = 60)
    //private TypUbezpieczenia typUbezpieczenia;


}
