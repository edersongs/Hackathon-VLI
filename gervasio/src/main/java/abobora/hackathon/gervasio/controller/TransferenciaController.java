/**
 * 
 */
package abobora.hackathon.gervasio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import abobora.hackathon.gervasio.domain.Transferencia;
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
	
	@Autowired TransferenciaRepository transferenciaRepository;
	
	
	@GetMapping
	public ModelAndView principal() {
		
		List<Transferencia> movimentacaoEstoques = transferenciaRepository.findAll();
				
		ModelAndView model = new ModelAndView("/page/transferencias/consultaTransferencias");
		
		model.addObject("transferencias", movimentacaoEstoques);

		
		return model;
	}
	
}
