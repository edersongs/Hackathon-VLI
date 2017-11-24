package abobora.hackathon.gervasio.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import abobora.hackathon.gervasio.domain.Estoque;
import abobora.hackathon.gervasio.domain.EstoqueId;
import abobora.hackathon.gervasio.domain.dto.AtivosFilialDTO;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, EstoqueId>, EstoqueRepositoryDAO {

	@Query("SELECT new abobora.hackathon.gervasio.domain.dto.AtivosFilialDTO(e.estoqueID.filial.descricao, sum(e.quantidade)) "
			+ "FROM Estoque e, Filial f "
			+ "WHERE e.estoqueID.filial.codigo = f.codigo "
			+ "GROUP BY f.codigo")
	Collection<AtivosFilialDTO> findTotalAtivosFilial();
	
	@Query(	"FROM Estoque e "
			+ "WHERE e.estoqueID.filial.codigo = ?1 "
			+ "And e.estoqueID.subInventario.codigo = ?2 "
			+ "And e.estoqueID.modelo.codigo = ?3 ")
	Estoque buscarPeloId(Long codigoModelo,Long codigoFilial,Long codigoSubInv);
}
