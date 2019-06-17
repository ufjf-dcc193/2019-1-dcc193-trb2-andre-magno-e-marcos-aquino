package br.ufjf.dcc193.projeto_2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @Autowired
    RepositorioAvaliador avaliadorRep;

    @RequestMapping({"/avaliador","/avaliador/index.html"})
    public String avaliadorIndex(){
        return "avaliador-index.html";
    }
 
    @RequestMapping(value="/avaliador/form.html", method=RequestMethod.POST)
   public ModelAndView criar(Avaliador avaliador) {
       ModelAndView mv = new ModelAndView();
       //mv.setViewName("redirect:listar.html");
       System.out.println(avaliador.getTitulo()+"ssssssssssssssssssssss>>>");
       avaliadorRep.save(avaliador);
       mv.addObject("avaliador", avaliador);
       System.out.println(avaliador.getTitulo()+"ssssssssssssssssssssss>>22"+avaliadorRep.findAll().get(0));
       return mv;
   }

   @RequestMapping(value="/avaliador/form.html", method=RequestMethod.GET)
   public ModelAndView ccriar() {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("avaliador-form");
       mv.addObject("avaliador", new Avaliador("Teste"));
       return mv;
   }

   @RequestMapping(value="/avaliador/listar.html", method=RequestMethod.GET)
   public ModelAndView listar(){
       List<Avaliador> aval = avaliadorRep.findAll();
       ModelAndView mv = new ModelAndView();
       mv.setViewName("avaliador-listar");
       mv.addObject("avaliadores", aval);
       return mv;
   }




}