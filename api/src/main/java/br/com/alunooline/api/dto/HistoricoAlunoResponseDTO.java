package br.com.alunooline.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class HistoricoAlunoResponseDTO {
    private String nomeAluno;
    private String emailAluno;
    private String cpfAluno;
    private List<DisciplinasAlunoResponseDTO> disciplinasAlunoResponsesDTO;

    public void setMatriculaAluno(String cpfAluno) {
    }
}