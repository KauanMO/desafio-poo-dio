package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nome;
    private Set<Conteudo> competencias = new LinkedHashSet<>();

    public void adicionarCompetencia(Conteudo competencia) {
        this.competencias.add(competencia);
    }

    public Boolean checarCompetencias(Set<Conteudo> competencias) {
        return this.competencias.containsAll(competencias);
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCompetencias() {
        return competencias;
    }

    public String getNome() {
        return nome;
    }
}