package com.senai.Flixs.repository;

import com.senai.Flixs.FlixsApplication;
import com.senai.Flixs.model.Titulos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitulosRepository extends JpaRepository<Titulos, Long> {
}
