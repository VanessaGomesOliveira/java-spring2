package br.com.meli.spring2.mp4pi02spring2.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiplomaDTO {


    private String message;
    private double average;
    private Aluno aluno;

}
