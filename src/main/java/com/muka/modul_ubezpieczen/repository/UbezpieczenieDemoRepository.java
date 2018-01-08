package com.muka.modul_ubezpieczen.repository;

import com.muka.modul_ubezpieczen.domain.UbezpieczenieDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Magda on 27.12.2017.
 */
@Repository
public interface UbezpieczenieDemoRepository extends JpaRepository<UbezpieczenieDemo, Long> {

}
