/**
 * 
 */
package abobora.hackathon.gervasio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import abobora.hackathon.gervasio.domain.Ativo;
import abobora.hackathon.gervasio.repository.AtivoRepository;
import abobora.hackathon.gervasio.service.ImageService;

/**
 * @author Éderson Gervásio
 *		  edersongervasiosilva@gmail.com
 *		  linkedin.com/in/edersongs
 *	   	  github.com/edersongs	
 *	      + 55 (34) 9 9272-2350	
 *
 */
@Controller
@RequestMapping("/ativos")
public class AtivosController {

	@Autowired private ImageService imageSerice;
	@Autowired private AtivoRepository ativoRepository;
	
	@GetMapping
	public ModelAndView principal() {
		
		ModelAndView model = new ModelAndView("/page/qrcode/criarQrcode");

		
		return model;
	}
	
	@GetMapping(path = "/gerarQR", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> getQRCode(
			@RequestParam(value = "texto", required = true) String texto, 
			@RequestParam(value = "tamanho", required = true) int tamanho) {
		
		try {
		
			return ResponseEntity.ok().body(imageSerice.gerarQRCode(texto, tamanho, tamanho));
		
		} catch (Exception ex) {
			throw new InternalError("Erro ao gerar QRCode!", ex);
		}
	}
	
	@GetMapping(path = "/todos")
	public ResponseEntity<List<Ativo>> getTodos() {
		
		try {
		
			return ResponseEntity.ok().body(ativoRepository.findAll());
		
		} catch (Exception ex) {
			throw new InternalError("Erro ao gerar QRCode!", ex);
		}
	}
}
