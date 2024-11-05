package br.com.fiap.fiapgp18.service;

import br.com.fiap.fiapgp18.model.Semaforo;
import br.com.fiap.fiapgp18.repository.SemaforoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemaforoService {
    @Autowired
    private SemaforoRepository semaforoRepository;

    public java.util.List<Semaforo> getAllSemaforos() {
        return semaforoRepository.findAll();
    }

    public Semaforo getSemaforo(Long id) {
        return semaforoRepository.findById(id).orElse(null);
    }

    public Semaforo createSemaforo(Semaforo semaforo) {
        return semaforoRepository.save(semaforo);
    }

    public Semaforo updateSemaforo(Semaforo semaforo) {
        return semaforoRepository.save(semaforo);
    }

    public void deleteSemaforo(Long id) {
        semaforoRepository.deleteById(id);
    }
}