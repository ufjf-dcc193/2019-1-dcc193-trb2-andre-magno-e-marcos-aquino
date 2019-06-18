package br.ufjf.dcc193.projeto_2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioRevisao extends JpaRepository<Revisao, Long>{

}