package com.spring.petclinic.sfgpetclinic.services;

import com.spring.petclinic.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
