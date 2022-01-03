package br.com.meli.spring2.mp4pi02spring2.Controller;

import br.com.meli.spring2.mp4pi02spring2.Model.Aluno;
import br.com.meli.spring2.mp4pi02spring2.Model.DiplomaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;;import javax.validation.Valid;

@RestController
public class Controller {

    @PostMapping("/calculaMedia")
    public ResponseEntity<DiplomaDTO> diploma(@Valid @RequestBody Aluno a){
        double media = a.calculaMedia();
        DiplomaDTO diploma = new DiplomaDTO();
        diploma.setAverage(media);
        if (media >= 9) {
            diploma.setMessage("Parabéns! Sua média foi: " + media);
        } else {
            diploma.setMessage("Sua média foi de " + media);
        }
        diploma.setAluno(a);

        return ResponseEntity.status(HttpStatus.CREATED).body(diploma);
    }
}
