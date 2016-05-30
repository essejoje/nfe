package com.fincatto.nfe310.classes;

public enum NFModelo {

    NFE("55", "NF-e"),
    NFCE("65", "NFC-e");

    private final String codigo;
    private final String desc;

    NFModelo(final String codigo, final String desc) {
        this.codigo = codigo;
        this.desc = desc;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static NFModelo valueOfCodigo(final String codigo) {
        for (final NFModelo tipo : NFModelo.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
    	return codigo+" - "+desc;
    }
}