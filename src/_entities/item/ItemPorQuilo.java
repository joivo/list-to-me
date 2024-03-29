package _entities.item;

import enums.ItemAtributos;
import enums.ItemCategorias;
import util.Util;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * Classe que representa um item vendido por quilo.
 *
 */
public class ItemPorQuilo extends Item implements Serializable {
	private double kg;
	
	/**
	 * Constrói um item do tipo ItemPorQuilo.
	 */
	public ItemPorQuilo(int id, String nome, ItemCategorias categoria, double kg) {
		super(id, nome, categoria);
		this.kg = kg;
	}
	
	/**
	 * {@link _entities.item.Item#set(String, String)}}
	 */
	@Override
	public void set(String atributo, String novoValor) {
		super.set(atributo, novoValor);
		if (atributo.equals(ItemAtributos.QUILOS.getValue())) {
			setKg(Double.parseDouble(novoValor));
		} 
	}

	/**
	 * @param kg the kg to set
	 */
	public void setKg(double kg) {
		this.kg = kg;
	}

	/**
	 * @return the kg
	 */
	public double getKg() {
		return kg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Preco por quilo: " + mapToString(getMapaDePrecos());
	}

	@Override
	public String toString(double quantidade) {
		return (int)(quantidade) + " " + this.getNome() + ", "
				+ this.getCategoria().getValue();
	}


	@Override
    public int compareTo(Item o) {
        return super.compareTo(o);
    }
}
