package enums;

public enum ListaDeComprasExceptionMessages {

    DESCRITOR_INVALIDO("descritor vazio ou nulo."),
    QUANTIDADE_INVALIDA("quantidade invalida."),
    ITEM_ID_INVALIDO("item id inválido."),
    ERRO_COMPRA("Erro na compra de item: "),
    ERRO_ATUALIZACAO("Erro na atualizacao de compra: "),
    ERRO_EXCLUSAO("Erro na exclusao de compra: "),
    ERRO_PESQUISA("Erro na pesquisa de compra: "),
    ERRO_FINALIZACAO("Erro na finalizacao de lista de compras: "),
    CRIACAO_INVALIDA_DESCRITOR("Erro na criacao de lista de compras: " + DESCRITOR_INVALIDO.errorMessage),
    COMPRA_INVALIDA_DESCRITOR(ERRO_COMPRA.errorMessage + DESCRITOR_INVALIDO.errorMessage),
    COMPRA_INVALIDA_QUANTIDADE(ERRO_COMPRA.errorMessage + QUANTIDADE_INVALIDA.errorMessage),
    COMPRA_INVALIDA_ITEM(ERRO_COMPRA.errorMessage + ITEM_ID_INVALIDO.errorMessage),
    LISTA_NAO_ENCONTRADA(ERRO_COMPRA.errorMessage + "lista de compras ainda nao existe."),
    ATUALIZACAO_INVALIDA_DESCRITOR(ERRO_ATUALIZACAO.errorMessage + DESCRITOR_INVALIDO.errorMessage),
    ATUALIZACAO_INVALIDA_ITEM(ERRO_ATUALIZACAO.errorMessage + ITEM_ID_INVALIDO.errorMessage),
    ATUALIZACAO_INVALIDA_QUANTIDADE(ERRO_ATUALIZACAO.errorMessage + QUANTIDADE_INVALIDA.errorMessage),
    COMPRA_NAO_ENCONTRADA(ERRO_ATUALIZACAO.errorMessage + "compra nao encontrada"),
    EXCLUSAO_INVALIDA_DESCRITOR(ERRO_EXCLUSAO.errorMessage + DESCRITOR_INVALIDO.errorMessage),
    EXCLUSAO_INVALIDA_ITEM(ERRO_EXCLUSAO.errorMessage + ITEM_ID_INVALIDO.errorMessage),
    COMPRA_JA_FEITA(ERRO_COMPRA.errorMessage + "compra ja adicionada."),
    PESQUISA_INVALIDA_DESCRITOR(ERRO_PESQUISA.errorMessage + DESCRITOR_INVALIDO.errorMessage),
    PESQUISA_INVALIDA_ITEM(ERRO_PESQUISA.errorMessage + ITEM_ID_INVALIDO.errorMessage),
    FINALIZACAO_INVALIDA_DESCRITOR(ERRO_FINALIZACAO.errorMessage + DESCRITOR_INVALIDO.errorMessage),
    FINALIZACAO_INVALIDA_LOCAL(ERRO_FINALIZACAO.errorMessage + "local nao pode ser vazio ou nulo."),
    FINALIZACAO_INVALIDA_VALOR(ERRO_FINALIZACAO.errorMessage + "valor final da lista invalido.");

    private String errorMessage;

    ListaDeComprasExceptionMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}