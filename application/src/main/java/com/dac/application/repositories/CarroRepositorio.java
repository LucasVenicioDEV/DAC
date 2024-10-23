package com.dac.application.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dac.application.entidades.Carro;

@Repository
public interface CarroRepositorio extends JpaRepositories<Carro, Long>{


}   
