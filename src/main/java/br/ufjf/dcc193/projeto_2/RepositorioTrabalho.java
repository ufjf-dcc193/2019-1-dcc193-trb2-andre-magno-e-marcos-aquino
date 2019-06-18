package br.ufjf.dcc193.projeto_2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TrabalhoRepositorio
 */
@Repository
public interface RepositorioTrabalho extends JpaRepository<Trabalho, Long> {

    
}