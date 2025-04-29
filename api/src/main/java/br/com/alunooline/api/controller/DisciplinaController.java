package br.com.alunooline.api.controller;

import br.com.alunooline.api.model.Disciplina;
import br.com.alunooline.api.service.DisciplinaService;
import br.com.alunooline.api.model.Disciplina;
import br.com.alunooline.api.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarDisciplina(@RequestBody Disciplina disciplina){
        disciplinaService.criarDisciplina(disciplina);
    }

    @GetMapping("/{idProfessor}")
    @ResponseStatus(HttpStatus.OK)
    public List<Disciplina> listaDisciplinaPorIdProfessor(@PathVariable Long idProfessor){
        return disciplinaService.listarDisciplinaPorIdProfessor(idProfessor);
    }
}
