package br.com.alunooline.api.dto;

import br.com.alunooline.api.enums.MatriculaAlunoStatusEnum;
import br.com.alunooline.api.enums.MatriculaAlunoStatusEnum;
import lombok.Data;

@Data
public class DisciplinasAlunoResponseDTO {

    private String nomeDisciplina;
    private String nomeProfessor;
    private Double nota1;
    private Double nota2;
    private Double media;
    private MatriculaAlunoStatusEnum status;

}