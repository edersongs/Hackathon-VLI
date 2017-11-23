/**
 * 
 */
package abobora.hackathon.gervasio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;
import abobora.hackathon.gervasio.repository.MovimentacaoRepository;

/**
 * @author Eduardo Silva Rosa
 *         edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr
 *         + 55 (34) 9 9179-4411    
 *
 */
@Controller
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired MovimentacaoRepository movimentacaoRepository;
	
	@GetMapping
	public ModelAndView principal() {
		
		List<MovimentacaoEstoque> movimentacaoEstoques = movimentacaoRepository.findAll();
				
		ModelAndView model = new ModelAndView("/page/movimentacoes/consultaMovimentacao");
		
		model.addObject("movs", movimentacaoEstoques);

		
		return model;
	}
	
	@GetMapping(path = "/todos")
	public ResponseEntity<List<MovimentacaoEstoque>> getTodos() {
		
		try {
		
			return ResponseEntity.ok().body(movimentacaoRepository.findAll());
		
		} catch (Exception ex) {
			throw new InternalError("Erro ao gerar QRCode!", ex);
		}
	}

}
