package com.lima.ricarth.msprogrammer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lima.ricarth.msprogrammer.entities.Programmer;

public interface ProgrammerRepository extends JpaRepository<Programmer, Long>{

}
