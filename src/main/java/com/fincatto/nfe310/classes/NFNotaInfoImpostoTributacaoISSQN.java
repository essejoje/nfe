package com.fincatto.nfe310.classes;

public enum NFNotaInfoImpostoTributacaoISSQN {
    NORMAL("N", "Normal"),
    RETIDA("R", "Retida"),
    SUBSTITUTA("S", "Substituta"),
    ISENTA("I", "Isenta");

    private final String codigo;
    private final String desc;

    NFNotaInfoImpostoTributacaoISSQN(final String codigo, final String desc) {
        this.codigo = codigo;
        this.desc = desc;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NFNotaInfoImpostoTributacaoISSQN valueOfCodigo(final String codigo) {
        for (final NFNotaInfoImpostoTributacaoISSQN impostoTributacaoISSQN : NFNotaInfoImpostoTributacaoISSQN.values()) {
            if (impostoTributacaoISSQN.getCodigo().equals(codigo)) {
                return impostoTributacaoISSQN;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
    	return codigo+" - "+desc;
    }
}