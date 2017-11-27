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
@Transactional
public class EstoqueRepositoryImpl implements EstoqueRepositoryDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void incrementarEstoque(MovimentacaoEstoque movimentacaoEstoque) {
		
		Session session = entityManager.unwrap(Session.class);
		
		String sql = "update Estoque etq set quantidade = quantidade + :quantidade "
				+ "where exists (select 1 from Modelo mod where etq.estoqueID.modelo.codigo = mod.codigo and mod.codigo = :codigoModelo ) "
				+ "and exists (Select 1 from Filial fil where etq.estoqueID.filial.codigo = fil.codigo and fil.codigo = :codigoFilial) "
				+ "and exists (Select 1 from SubInventario sub where etq.estoqueID.subInventario = sub.codigo and sub.codigo = :codigoSubIventario)"  ;
		
		Query query = session.createQuery(sql);
		
		query.setParameter("quantidade", movimentacaoEstoque.getQuantidade());
		query.setParameter("codigoModelo", movimentacaoEstoque.getModelo().getCodigo());
		query.setParameter("codigoFilial", movimentacaoEstoque.getFilialDestino().getCodigo());
		query.setParameter("codigoSubIventario", movimentacaoEstoque.getSubInventarioDestino().getCodigo());
		
		query.executeUpdate();
	}
	
	@Override
	public void decrementarEstoque(MovimentacaoEstoque movimentacaoEstoque) {
		
		Session session = entityManager.unwrap(Session.class);
		
		String sql = "update Estoque etq set quantidade = quantidade - :quantidade "
				+ "where exists (select 1 from Modelo mod where etq.estoqueID.modelo.codigo = mod.codigo and mod.codigo = :codigoModelo ) "
				+ "and exists (Select 1 from Filial fil where etq.estoqueID.filial.codigo = fil.codigo and fil.codigo = :codigoFilial) "
				+ "and exists (Select 1 from SubInventario sub where etq.estoqueID.subInventario = sub.codigo and sub.codigo = :codigoSubIventario)"  ;
		
		Query query = session.createQuery(sql);
		
		query.setParameter("quantidade", movimentacaoEstoque.getQuantidade());
		query.setParameter("codigoModelo", movimentacaoEstoque.getModelo().getCodigo());
		query.setParameter("codigoFilial", movimentacaoEstoque.getFilialOrigem().getCodigo());
		query.setParameter("codigoSubIventario", movimentacaoEstoque.getSubInventarioOrigem().getCodigo());
		query.executeUpdate();
	}

}
