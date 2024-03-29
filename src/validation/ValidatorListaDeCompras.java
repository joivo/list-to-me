package validation;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

public interface ValidatorListaDeCompras extends Serializable {

    void validaCriacao(String descritor);

    void validaCompra(String descritorLista, double quantidade, int itemId);

    void validaAtualizacao(String descritorLista, int itemId, String operacao, int quantidade);

    void validaExclusao(String descritorLista, int itemId);

    void validaPesquisa(String descritorLista, int itemId);

    void validaPesquisa(String descritorLista);

    void validaFinalizacaoDeLista(String descritorLista, String localDaCompra, double valorFinalDaCompra);

    void validaPesquisaDeItemEmLista(String descritorLista, int posicaoDeItem);

    Date validaPesquisaPorData(String data, int posicaoLista) throws ParseException;

    void validaPesquisaPorItem(int id, int posicaoLista);

    void validaImpressaoDeCompra(String descritorLista);

    Date validaPesquisaPorData(String data) throws ParseException;

    void validaPesquisaPorItem(int id);

}
