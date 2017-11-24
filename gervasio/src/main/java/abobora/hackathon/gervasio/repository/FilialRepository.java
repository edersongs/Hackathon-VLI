/**
 * 
 */
package abobora.hackathon.gervasio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import abobora.hackathon.gervasio.domain.Filial;

/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */
@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {

}
