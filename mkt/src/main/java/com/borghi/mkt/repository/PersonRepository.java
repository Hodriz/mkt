package com.borghi.mkt.repository;

import com.borghi.mkt.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
