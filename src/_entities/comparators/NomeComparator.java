package _entities.comparators;

import _entities.listaDeCompras.Compra;

import java.io.Serializable;
import java.util.Comparator;

public class NomeComparator implements Comparator<Compra>, Serializable {

    @Override
    public int compare(Compra o1, Compra o2) {
        return o1.getItemCompravel().getNome().compareToIgnoreCase(
                o2.getItemCompravel().getNome());
    }
}
