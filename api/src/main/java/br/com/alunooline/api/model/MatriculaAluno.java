package br.com.alunooline.api.model;

import br.com.alunooline.api.enums.MatriculaAlunoStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "matricula_aluno")
public class MatriculaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Long idMatricula;

    @ManyToOne
    @JoinColumn(name = "ALUNO_id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "DISCIPLINA_id_disciplina")
    private Disciplina disciplina;

    @Column(name = "nota_1", nullable = false)
    private Double nota1;

    @Column(name = "nota_2", nullable = false)
    private Double nota2;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_aluno")
    private MatriculaAlunoStatusEnum status;

    public static void setstatus(MatriculaAlunoStatusEnum matriculaAlunoStatusEnum) {

    }

    public void setStatus(MatriculaAlunoStatusEnum matriculaAlunoStatusEnum) {
    }
}
