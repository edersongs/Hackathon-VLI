package abobora.hackathon.gervasio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import abobora.hackathon.gervasio.domain.Estoque;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Repository
public interface EstoqueRepositorio extends JpaRepository<Estoque, Long>,EstoqueDAO{

}
