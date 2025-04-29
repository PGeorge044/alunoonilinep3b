package br.com.alunooline.api.dto;

import lombok.Data;

@Data
public class AtualizarNotasRequestDTO {

    private Double nota1;

    private Double nota2;

    public double getNota1() {
        return 0;
    }

    public double getNota2() {
        return 0;
    }
}