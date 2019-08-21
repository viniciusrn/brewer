package com.buzzworks.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buzzworks.brewer.model.Cerveja;
import com.buzzworks.brewer.repository.helper.cerveja.CervejasQueries;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>, CervejasQueries{

}
