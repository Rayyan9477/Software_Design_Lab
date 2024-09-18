package com.contact.repository;

import com.contact.entity.Avenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvengerRepository extends JpaRepository<Avenger, Long> {
}