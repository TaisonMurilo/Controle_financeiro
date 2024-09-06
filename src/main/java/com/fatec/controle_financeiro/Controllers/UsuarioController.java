import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController{
    //http://localhost:<port>/api/usuario/register
    //POST
    //Parametro: @RequestBody => Enviar o corpo da requisição (body)
    //@PostMapping => POST - CRIACAO / Consulta com parametros no corpo da requisição
    //@GetMapping => GET - Consultas
    //@PutMapping => PUT - Alteração / update
    //@DeleteMapping => DELETE - deleta / apaga
    //@PathMapping => PATH - anexar / alterar

    @PostMapping("/register")
    public String registerUser(@PathMapping String name, @PathVariable int age)
}