package abobora.hackathon.gervasio.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import abobora.hackathon.gervasio.domain.Peca;
import abobora.hackathon.gervasio.domain.StatusPeca;
import abobora.hackathon.gervasio.domain.TipoPeca;
import abobora.hackathon.gervasio.service.ImageService;

/**
 * @author Eduardo Silva Rosa
 *         edus.silva.rosa@gmail.com
 *         linkedin.com/in/eduardo-rosa
 *         https://github.com/edusr
 *         + 55 (34) 9 9179-4411    
 *
 */
@Controller
@RequestMapping("/pecas")
public class PecaController {
	
	@Autowired private ImageService imageSerice;
	
	@GetMapping
	public ModelAndView principal() {
		
		List<Peca> pecas = new ArrayList<>();
		
		TipoPeca tipoPeca = new TipoPeca(1L,"Motor",true);
		TipoPeca tipoPeca1 = new TipoPeca(2L,"Correia",false);
		TipoPeca tipoPeca3 = new TipoPeca(3L,"Acoplamentos",true);
		TipoPeca tipoPeca4 = new TipoPeca(4L,"Clp&Eletronicos",true);
		TipoPeca tipoPeca5 = new TipoPeca(5L,"Redutores",true);
	
		Peca peca1 = new Peca(1L,"WEG W22X",tipoPeca,StatusPeca.MANUTENCAO);
		Peca peca2 = new Peca(2L,"EP320-5 Pathfinder 1/8\" x 1/8\" 42\"",tipoPeca1,StatusPeca.ATIVO);
		Peca peca3 = new Peca(3L,"FA107/G AM200",tipoPeca5,StatusPeca.ATIVO);
		Peca peca4 = new Peca(4L,"HR 407",tipoPeca3,StatusPeca.ATIVO);
		Peca peca5 = new Peca(5L,"FONTE DE ALIMENTAÇÃO TRIO-OS 10A 24VDC",tipoPeca4,StatusPeca.DANIFICADO);
		

		ModelAndView model = new ModelAndView("/page/pecas/consultaPecas");
		
		pecas.add(peca1);
		pecas.add(peca2);
		pecas.add(peca3);
		pecas.add(peca4);
		pecas.add(peca5);
		
		model.addObject("pecas", pecas);
		
		return model;
	}

	@GetMapping(path = "/gerarQR", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> getQRCode(
			@RequestParam(value = "texto", required = true) String texto, 
			@RequestParam(value = "tamanho", required = true) int tamanho) {
		
		try {
		
			Map<Long,Peca> pecas = new HashMap<>();
			
			TipoPeca tipoPeca = new TipoPeca(1L,"Motor",true);
			TipoPeca tipoPeca1 = new TipoPeca(2L,"Correia",false);
			TipoPeca tipoPeca3 = new TipoPeca(3L,"Acoplamentos",true);
			TipoPeca tipoPeca4 = new TipoPeca(4L,"Clp&Eletronicos",true);
			TipoPeca tipoPeca5 = new TipoPeca(5L,"Redutores",true);

			Peca peca1 = new Peca(1L,"WEG W22X",tipoPeca,StatusPeca.MANUTENCAO);
			Peca peca2 = new Peca(2L,"EP320-5 Pathfinder 1/8\" x 1/8\" 42\"",tipoPeca1,StatusPeca.ATIVO);
			Peca peca3 = new Peca(3L,"FA107/G AM200",tipoPeca5,StatusPeca.ATIVO);
			Peca peca4 = new Peca(4L,"HR 407",tipoPeca3,StatusPeca.ATIVO);
			Peca peca5 = new Peca(5L,"FONTE DE ALIMENTAÇÃO TRIO-OS 10A 24VDC",tipoPeca4,StatusPeca.DANIFICADO);

			pecas.put(peca1.getCodigo(),peca1);
			pecas.put(peca2.getCodigo(),peca2);
			pecas.put(peca3.getCodigo(),peca3);
			pecas.put(peca4.getCodigo(),peca4);
			pecas.put(peca5.getCodigo(),peca5);

			Gson gson = new Gson();

			String json = gson.toJson(pecas.get(Long.valueOf(texto)));

			return ResponseEntity.ok().body(imageSerice.gerarQRCode(json, tamanho, tamanho));
		
		} catch (Exception ex) {
			throw new InternalError("Erro ao gerar QRCode!", ex);
		}
	}
}
