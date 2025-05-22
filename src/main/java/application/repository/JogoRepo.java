package application.repository;

import application.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepo extends JpaRepository<Jogo, Long> {
    Jogo findByTitulo(String titulo);
} 