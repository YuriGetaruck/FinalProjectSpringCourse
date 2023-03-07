package com.example.demo.models.repositories;

import com.example.demo.models.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.*;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
