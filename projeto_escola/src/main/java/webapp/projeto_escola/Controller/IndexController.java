package webapp.projeto_escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String acessoHome(){
        return "index";
    }

    @GetMapping("/home")
    public String acessoHome2(){
        return "index";
    }

    @GetMapping("/login-professor")
    public String acessoLoginProfessor(){
        return "login/login-professor";
    }

    @GetMapping("/login-aluno")
    public String acessoLoginAluno(){
        return "login/login-aluno";
    }

    @GetMapping("/login-adm")
    public String acessoLoginAdm(){
        return "login/login-adm";
    }

    @GetMapping("/cad-adm")
    public String acessoCadastroAdm() {
        return "cadastro/cad-adm";
    }


    
}
