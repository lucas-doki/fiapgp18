package br.com.fiap.fiapgp18.model;

import jakarta.persistence.*;

@Entity
@Table(name = "semaforos")
public class Semaforo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_semaforo;

    private String localizacao;
    private int tempo_semaforo_verde;
    private int tempo_semaforo_vermelho;

    // Getters e Setters
    public Long getId_semaforo() {
        return id_semaforo;
    }

    public void setId_semaforo(Long id_semaforo) {
        this.id_semaforo = id_semaforo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getTempo_semaforo_verde() {
        return tempo_semaforo_verde;
    }

    public void setTempo_semaforo_verde(int tempo_semaforo_verde) {
        this.tempo_semaforo_verde = tempo_semaforo_verde;
    }

    public int getTempo_semaforo_vermelho() {
        return tempo_semaforo_vermelho;
    }

    public void setTempo_semaforo_vermelho(int tempo_semaforo_vermelho) {
        this.tempo_semaforo_vermelho = tempo_semaforo_vermelho;
    }
}
