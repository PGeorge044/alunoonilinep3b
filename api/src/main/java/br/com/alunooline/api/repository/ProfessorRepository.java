package br.com.alunooline.api.repository;

import br.com.alunooline.api.model.Aluno;
import br.com.alunooline.api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
