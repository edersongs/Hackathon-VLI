/**
 * 
 */
package abobora.hackathon.gervasio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Éderson Gervásio
 *		  edersongervasiosilva@gmail.com
 *		  linkedin.com/in/edersongs
 *	   	  github.com/edersongs	
 *	      + 55 (34) 9 9272-2350	
 *
 */
@Controller
@RequestMapping("/fornecedores")
public class PortalFornecedorController {

	@GetMapping
	public ModelAndView principal() {
		
		ModelAndView model = new ModelAndView("/page/portalFornecedor/portalFornecedor");

		return model;
	}
}
