package com.example.demo.repositories;

import com.example.demo.models.Owner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
public class OwnerRepository implements IRepository<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        owners.add(new Owner("youssef","Hassan",null,"123","cairo","maadi"));
        owners.add(new Owner("Mostafa","Hassan",null,"123","cairo","maadi"));
        owners.add(new Owner("Ibrahim","Hassan",null,"123","cairo","maadi"));
        owners.add(new Owner("Refaat","Hassan",null,"123","cairo","maadi"));
        owners.add(new Owner("Ahmed","Hassan",null,"123","cairo","maadi"));

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return null;
    }

    @Override
    public Owner save(Owner object) {
        return null;
    }

    @Override
    public void delete(Owner object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
