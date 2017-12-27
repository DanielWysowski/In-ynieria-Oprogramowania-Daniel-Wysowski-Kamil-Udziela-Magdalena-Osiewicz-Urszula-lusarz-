package com.muka.modul_ubezpieczen.repository;

import com.muka.modul_ubezpieczen.domain.Klient.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by Magda on 17.12.2017.
 */
public interface KlientRepo  extends JpaRepository <Klient, Long> {
}
