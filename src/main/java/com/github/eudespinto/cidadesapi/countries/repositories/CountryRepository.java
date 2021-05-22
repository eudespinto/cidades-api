package com.github.eudespinto.cidadesapi.countries.repositories;

import com.github.eudespinto.cidadesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
