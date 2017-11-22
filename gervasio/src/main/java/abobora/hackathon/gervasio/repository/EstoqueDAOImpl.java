package abobora.hackathon.gervasio.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import abobora.hackathon.gervasio.domain.MovimentacaoEstoque;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@Component
public class EstoqueDAOImpl implements EstoqueDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void incrementarEstoque(MovimentacaoEstoque movimentacaoEstoque) {
		
		Session session = entityManager.unwrap(Session.class);
		
		String sql = "update Estoque set quantidade = quantidade + :quantidade "
				+ "where modelo.codigo = :codigoModelo and filial.codigo = :codigoFilial "
				+ "and subInventario.codigo = :codigoSubIventario"  ;
		
		Query query = session.createQuery(sql);
		
		query.setParameter("quantidade", movimentacaoEstoque.getQuantidade());
		query.setParameter("codigoModelo", movimentacaoEstoque.getModelo().getCodigo());
		query.setParameter("codigoFilial", movimentacaoEstoque.getFilialOrigem().getCodigo());
		query.setParameter("codigoSubIventario", movimentacaoEstoque.getSubInventarioOrigem().getCodigo());
		
		query.executeUpdate();
	}
	
	public void decrementarEstoque(MovimentacaoEstoque movimentacaoEstoque) {
		
		Session session = entityManager.unwrap(Session.class);
		
		String sql = "update Estoque set quantidade = quantidade - :quantidade "
				+ "where modelo.codigo = :codigoModelo and filial.codigo = :codigoFilial "
				+ "and subInventario.codigo = :codigoSubIventario"  ;
		
		Query query = session.createQuery(sql);
		
		query.setParameter("quantidade", movimentacaoEstoque.getQuantidade());
		query.setParameter("codigoModelo", movimentacaoEstoque.getModelo().getCodigo());
		query.setParameter("codigoFilial", movimentacaoEstoque.getFilialOrigem().getCodigo());
		query.setParameter("codigoSubIventario", movimentacaoEstoque.getSubInventarioOrigem().getCodigo());
		query.executeUpdate();
	}

}
