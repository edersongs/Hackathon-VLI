/**
 * 
 */
package abobora.hackathon.gervasio.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import abobora.hackathon.gervasio.thymeleaf.processor.ClassForErrorTagProcessor;
import abobora.hackathon.gervasio.thymeleaf.processor.MessageElementTagProcessor;

/**
 * 
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */
@Configuration
public class GenciadorFinanceiroDialect extends AbstractProcessorDialect {

	protected GenciadorFinanceiroDialect() {
		super("Gervasio Gerenciador Financeiro", "gff", StandardDialect.PROCESSOR_PRECEDENCE);
	}
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		return processadores;
	}
}
