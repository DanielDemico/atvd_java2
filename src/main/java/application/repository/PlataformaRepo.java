package application.repository;

import application.model.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformaRepo extends JpaRepository<Plataforma, Long> {
    Plataforma findByDescricao(String descricao);
} 