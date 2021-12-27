package br.com.meli.spring2.mp4pi02spring2.Controller;

import br.com.meli.spring2.mp4pi02spring2.Model.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class Controller2 {
    /*@PostMapping("/CalculaMedia")
    public  String calculaMedia(@RequestBody Aluno aluno){

        return aluno.getNome();
    }
    */
    @PostMapping("/CalculaMedia")
    public ResponseEntity<String> diploma(@RequestBody Aluno a){
        double media = a.calculaMedia();
        if (media >= 9) {
            return ResponseEntity.ok("Parabéns! Sua média foi: " + media);
        }
        return ResponseEntity.ok("Sua média foi: " + media);
    }

    @GetMapping("/teste")
    public String ping(){
        return "pong";
    }
}
