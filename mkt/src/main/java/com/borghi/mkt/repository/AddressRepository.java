package com.borghi.mkt.repository;

import com.borghi.mkt.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <Address, Long> {
}
