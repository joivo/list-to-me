package _entities.listaDeCompras;

import _entities.item.Item;

import java.io.Serializable;
import java.util.Objects;

public class Compra implements Comparable<Compra>, Serializable {

    private double quantidade;
    private Item item;

    public Compra(double quantidade, Item item) {
        this.quantidade = quantidade;
        this.item = item;
    }
    
    public double getQuantidade() { return quantidade; }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Item getItemCompravel() {
        return item;
    }
    
    public String getNomeItem() {
    	return this.item.getNome();
    }
    
    @Override
    public String toString() {
        return item.toString(this.quantidade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Compra compra = (Compra) o;

        return item.equals(compra.item);
    }

    @Override
    public int hashCode() {
        return item.hashCode();
    }

    @Override
    public int compareTo(Compra o) {
        return this.getItemCompravel().getCategoria().compareTo(o.getItemCompravel().getCategoria());
    }
}
