/**
 * 
 */
package abobora.hackathon.gervasio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import abobora.hackathon.gervasio.domain.Filial;
import abobora.hackathon.gervasio.domain.Transferencia;
import abobora.hackathon.gervasio.repository.AtivoRepository;
import abobora.hackathon.gervasio.repository.FilialRepository;
import abobora.hackathon.gervasio.repository.TransferenciaRepository;

/**
 * @author Eduardo Silva Rosa
 *         edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr
 *         + 55 (34) 9 9179-4411    
 *
 */
@Controller
@RequestMapping("/transferencias")
public class TransferenciaController {
	
	@Autowired private TransferenciaRepository transferenciaRepository;
	@Autowired private FilialRepository filialRepository;
	@Autowired private AtivoRepository ativoRepository;
	
	@GetMapping
	public ModelAndView principal() {
		
		ModelAndView model = new ModelAndView("/page/transferencias/consultaTransferencias");
		
		model.addObject("transferencias", transferenciaRepository.findAll());
		
		return model;
	}
	
	@GetMapping("/nova")
	public ModelAndView nova() {
		
		ModelAndView model = new ModelAndView("/page/transferencias/transferenciaAtivos");
		
		model.addObject("transferencia", new Transferencia());
		model.addObject("filiais", filialRepository.findAll());
		model.addObject("ativos", ativoRepository.findAll());
		
		return model;
	}
	
	@GetMapping(path="/listaFiliais")
	public @ResponseBody List<Filial> pesquisarFiliais() {
		
		return filialRepository.findAll();
	}
}
