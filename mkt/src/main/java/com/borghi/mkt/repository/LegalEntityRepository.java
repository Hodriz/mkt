package com.borghi.mkt.repository;

import com.borghi.mkt.entity.LegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalEntityRepository extends JpaRepository<LegalEntity, Long> {
}
