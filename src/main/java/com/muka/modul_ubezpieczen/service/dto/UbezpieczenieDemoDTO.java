package com.muka.modul_ubezpieczen.service.dto;

import com.muka.modul_ubezpieczen.domain.UbezpieczenieDemo;
import lombok.*;

import static com.muka.modul_ubezpieczen.service.dto.KlientDTO.ofKlient;

/**
 * Created by Magda on 27.12.2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UbezpieczenieDemoDTO {

    private Long id;
    private KlientDTO klientDTO;
    private String nazwa;

    public static UbezpieczenieDemoDTO ofUbezpieczenieDemo(UbezpieczenieDemo ubezpieczenieDemo) {
        return UbezpieczenieDemoDTO.builder()
            .id(ubezpieczenieDemo.getId())
            .nazwa(ubezpieczenieDemo.getNazwa())
            .klientDTO(ofKlient(ubezpieczenieDemo.getKlient()))
            .build();
    }
}
