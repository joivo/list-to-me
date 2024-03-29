package _entities.item;

import enums.ItemAtributos;
import enums.ItemCategorias;
import util.Util;

import java.io.Serializable;

/**
 * Classe que representa um item vendido por unidade.
 *
 */
public class ItemPorUnidade extends Item implements Serializable {
	private int unidades;
	
	/**
	 * Constrói um item do tipo ItemPorUnidade.
	 */
	public ItemPorUnidade(int id, String nome, ItemCategorias categoria, int unidades) {
		super(id, nome, categoria);
		this.unidades = unidades;
	}
	
	/**
	 * {@link _entities.item.Item#set(String, String)}}
	 */
	@Override
	public void set(String atributo, String novoValor) {
		super.set(atributo, novoValor);
		if (atributo.equals(ItemAtributos.UNIDADES.getValue())) {
			setUnidades(Integer.parseInt(novoValor));
		} 
	}

	/**
	 * @return the unidades
	 */
	public int getUnidades() {
		return unidades;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Preco: " + mapToString(getMapaDePrecos());
	}

	@Override
	public String toString(double quantidade) {
		return (int) quantidade + " " + this.getNome() + ", " + this.getCategoria().getValue();
	}

	/**
	 * @param unidades the unidades to set
	 */
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	@Override
	public int compareTo(Item o) {
		return super.compareTo(o);
	}
}
