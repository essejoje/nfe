package com.fincatto.nfe310.classes;

public enum NFNotaInfoItemImpostoICMSModalidadeBaseCalculo {

    MVA("0", "Margem de valor agregado"),
    PAUTA("1", "Pauta"),
    PRECO_TABELADO_MAXIMO("2", "Preço tabelado máximo"),
    VALOR_OPERACAO("3", "Valor da operação");

    private final String codigo;
    private final String descricao;

    NFNotaInfoItemImpostoICMSModalidadeBaseCalculo(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static NFNotaInfoItemImpostoICMSModalidadeBaseCalculo valueOfCodigo(final String codigo) {
        for (final NFNotaInfoItemImpostoICMSModalidadeBaseCalculo modalidade : NFNotaInfoItemImpostoICMSModalidadeBaseCalculo.values()) {
            if (modalidade.getCodigo().equals(codigo)) {
                return modalidade;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
    	return codigo+" - "+descricao;
    }
}