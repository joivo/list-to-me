package _entities.comparators;

import _entities.listaDeCompras.Compra;

import java.util.Comparator;

public class ComprasComparator implements Comparator<Compra> {

    @Override
    public int compare(Compra o1, Compra o2) {
        return o1.compareTo(o2);
    }
}
