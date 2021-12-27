package br.com.meli.spring2.mp4pi02spring2.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String nome;
    private Map<String, Double> disciplinas = new HashMap<>();

    public Map<String, Double> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Map<String, Double> disciplinas) {
        this.disciplinas = disciplinas;
    }

    /*@JsonCreator(mode= JsonCreator.Mode.DELEGATING)
    public void ClassContainingMap(@JsonProperty("disciplinas")Map<String,Double> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @JsonValue
    public Map<String, Double> getDisciplinas() {
        return disciplinas;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculaMedia(){
        double notas = this.disciplinas.values().stream().mapToDouble(v -> v).sum();
        double media = notas / disciplinas.size();
        return media;
    }

}
