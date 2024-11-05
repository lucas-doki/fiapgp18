package br.com.fiap.fiapgp18.controller;

import br.com.fiap.fiapgp18.model.Semaforo;
import br.com.fiap.fiapgp18.service.SemaforoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/semaforos")
public class SemaforoController {
    @Autowired
    private SemaforoService semaforoService;

    @GetMapping
    public List<Semaforo> getAllSemaforos() {
        return semaforoService.getAllSemaforos();
    }

    @GetMapping("/{id_semaforo}")
    public Semaforo getSemaforo(@PathVariable Long id_semaforo) {
        return semaforoService.getSemaforo(id_semaforo);
    }

    @PostMapping
    public Semaforo createSemaforo(@RequestBody Semaforo semaforo) {
        return semaforoService.createSemaforo(semaforo);
    }

    @PutMapping("/{id_semaforo}")
    public Semaforo updateSemaforo(@PathVariable Long id_semaforo, @RequestBody Semaforo semaforo) {
        return semaforoService.updateSemaforo(semaforo);
    }

    @DeleteMapping("/{id_semaforo}")
    public void deleteSemaforo(@PathVariable Long id_semaforo) {
        semaforoService.deleteSemaforo(id_semaforo);
    }
}