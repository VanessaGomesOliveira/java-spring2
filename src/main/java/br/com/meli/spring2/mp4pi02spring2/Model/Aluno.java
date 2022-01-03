package br.com.meli.spring2.mp4pi02spring2.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {

    @NotNull
    @NotEmpty(message = "O nome do aluno deve ser preenchido!")
    private String nome;
    @Size(min = 1, message = "Reprovado")
    private Map<String, Double> disciplinas = new HashMap<>();

    public double calculaMedia(){
        double notas = this.disciplinas.values().stream().mapToDouble(v -> v).sum();
        double media = notas / disciplinas.size();
        return media;
    }

}
