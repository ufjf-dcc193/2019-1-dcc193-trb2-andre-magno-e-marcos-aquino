package br.ufjf.dcc193.projeto_ufjf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "<h1>Bem vindo !!! !!</h1>";
    }
}