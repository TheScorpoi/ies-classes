package com.employee.ies.repository;

import com.employee.ies.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Movie findByTitle(String title);
   // List<Quote> findBy
}
