package webapp.projeto_escola.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import webapp.projeto_escola.Model.Administrador;
import webapp.projeto_escola.Repository.AdministradorRepository;


@Controller
public class AdministradorController {
    
    @Autowired
    private AdministradorRepository ar;


    @PostMapping("cadastro-adm")
    public String postCadastroAdm(Administrador adm) {
        
        ar.save(adm);
        //Enviar uma mensagem de cadastro realizado com sucesso 
        System.out.println("Cadastro realizado com sucesso");
        return "login/login-adm";
    }
    
}
