package com.github.eudespinto.cidadesapi.states.repositories;

import com.github.eudespinto.cidadesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
