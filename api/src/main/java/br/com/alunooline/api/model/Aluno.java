package br.com.alunooline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;
import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name = "aluno")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-aluno")
    private Long idAluno;

    @Column(name = "nome-aluno")
    private String nomeAluno;

    @Column(name = "email-aluno")
    private String emailAluno;

    @Column(name = "cpf-aluno")
    private String cpfAluno;
}
