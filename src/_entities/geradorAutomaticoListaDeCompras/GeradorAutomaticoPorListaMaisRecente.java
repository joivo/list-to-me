package _entities.geradorAutomaticoListaDeCompras;

import java.io.Serializable;
import java.util.List;

import _entities.listaDeCompras.ListaDeCompra;
import enums.ListaDeComprasExceptionMessages;
import listaDeComprasExceptions.ListaDeComprasNotExistException;

/**
 * Classe que é responsável por gerar uma lista de compras automática, seguindo a estratégia de
 * repetir a última que foi cadastrada no sistema.
 * 
 * @author lucas
 */

public class GeradorAutomaticoPorListaMaisRecente extends AbstractGeradorAutomatico implements Serializable {
	
	public GeradorAutomaticoPorListaMaisRecente() {
		super();
	}

	/**
	 * {@link _entities.geradorAutomaticoListaDeCompras.GeradorAutomaticoListaDeCompras#gerar(List)}
	 */
	@Override
	public ListaDeCompra gerar(List<ListaDeCompra> compras) throws ListaDeComprasNotExistException {
		if (compras.isEmpty())
			throw new ListaDeComprasNotExistException
				(ListaDeComprasExceptionMessages.NAO_HA_LISTAS_MAIS_RECENTE.getErrorMessage());
		
		int pos = compras.size() - 1;
		
		return super.criaListaDeCompra(compras.get(pos).getCompras(), "Lista automatica 1 ");
	}

}
