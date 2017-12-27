package com.muka.modul_ubezpieczen.domain.Klient;

import io.swagger.models.auth.In;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Magda on 17.12.2017.
 */
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "KLIENCI")
public class Klient {


    @Id
    @Column(name = "ID", length = 60)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idKlient;

    @Column(name = "Imie ", length = 60)
    private String imie;

    @Column(name = "Nazwisko ", length = 60)
    private String nazwisko;

    @Column(name = "Adres", length = 60)
    private String adresZamieszkania;

    @Column(name = "KodPoczztowy ", length = 6)
    private Integer kodPocztowy;

    @Column(name = "Email ", length = 60)
    private String email;

    @Column(name = "NumerTelefonu ", length = 12)
    private Integer numerTelefonu;

    @Column(name = "PESEL ", length = 60)
    private Long pesel;

    @Column(name = "SeriaDowodu", length = 10)
    private String seriaDowodu;



    @Builder
    public Klient(String imie, String nazwisko, String adresZamieszkania, Integer kodPocztowy, String email, Integer numerTelefonu, Long pesel, String seriaDowodu) {

        this.imie = imie;
        this.nazwisko=nazwisko;
        this.adresZamieszkania=adresZamieszkania;
        this.kodPocztowy=kodPocztowy;
        this.email=email;
        this.numerTelefonu=numerTelefonu;
        this.pesel=pesel;
        this.seriaDowodu=seriaDowodu;
    }



}
