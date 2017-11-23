/**
 * 
 */
package abobora.hackathon.gervasio.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import abobora.hackathon.gervasio.domain.dto.AtivosFilialDTO;
import abobora.hackathon.gervasio.repository.EstoqueRepository;

/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired private EstoqueRepository estoqueRepository;
	
	@GetMapping
	public ModelAndView principal() {
		
		ModelAndView model = new ModelAndView("/page/home");
		
		return model;
	}
	
	@GetMapping(path = "/totalAtivosFilial")
	public @ResponseBody Collection<AtivosFilialDTO> buscarAtivosNaFilial() {
		
		return estoqueRepository.findTotalAtivosFilial();
	}
}
