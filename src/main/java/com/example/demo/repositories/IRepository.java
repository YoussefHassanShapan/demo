package com.example.demo.repositories;

import java.util.Set;

public interface IRepository <T,ID>{
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
