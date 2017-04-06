/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidade.Piada;
import entidade.PiadaDAO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PiadaController {
    
    @CrossOrigin(origins = "http://editor.swagger.io")
    @RequestMapping(method = RequestMethod.POST, value ="/piada")
    public Piada salvarPiada(@RequestBody Piada p){
        PiadaDAO = new PiadaDAO();
        Piada piadaSalva = dao.salvar(p);
        return piadaSalva;
    }
    
}

    //GET Pincel
    @RequestMapping("/piada")
    public List<Piada> buscarPiada(){
        List resultado = new ArrayList<Piada>();
        
        Piada p = new Piada();
        p1.setNome("Piada ruim");
        p1.set(1);
        p1.setNum_serie(999);
        
        resultado.add(p1);
        
        Pincel p2 = new Pincel();
        p2.setCor("Verde");
        p2.setIdentificador(2);
        p2.setNum_serie(777);
        
        resultado.add(p2);
        
        return resultado;
        
 }
    