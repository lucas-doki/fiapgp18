package br.com.fiap.fiapgp18.repository;


import br.com.fiap.fiapgp18.model.Semaforo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemaforoRepository extends JpaRepository<Semaforo, Long> {
}