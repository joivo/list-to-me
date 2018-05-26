package model.item;

public class ItemQntdFixa extends Item {
	private int qntd;
	private String unidadeDeMedida;

	public ItemQntdFixa(long id, String nome, String categoria, int qntd, String unidadeDeMedida) {
		super(id, nome, categoria);
		this.qntd = qntd;
		this.unidadeDeMedida = unidadeDeMedida;		
	}

	/**
	 * @return the qntd
	 */
	public int getQntd() {
		return qntd;
	}

	/**
	 * @return the unidadeDeMedida
	 */
	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + this.qntd + " " 
				+ this.unidadeDeMedida + ", Preço: " + super.getMapaDePrecos().toString();
	}
	
	

}
