package com.fincatto.documentofiscal.nfe400.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nfe400.classes.NFSituacao;
import com.fincatto.documentofiscal.nfe400.classes.NFTipo;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Root(name = "resNFe")
@Namespace(reference = "http://www.portalfiscal.inf.br/nfe")
public class NFNotaResumo extends DFBase {
    private static final long serialVersionUID = 6979476565566044622L;

    @Attribute(name = "chNFe")
    private String chave;

    @Attribute(name = "CNPJ")
    private String CNPJ;

    @Element(name = "xNome")
    private String nome;

    @Element(name = "IE")
    private String IE;

    @Element(name = "dhEmi")
    private ZonedDateTime dataHoraEmissao;

    @Element(name = "tpNF")
    private NFTipo tipo;

    @Element(name = "vNF")
    private BigDecimal valor;

    @Element(name = "digVal")
    private String digest;

    @Element(name = "dhRecbto")
    private ZonedDateTime dataHoraRecebimento;

    @Element(name = "nProt")
    private String numeroProtocolo;

    @Element(name = "cSitNFe")
    private NFSituacao situacao;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getChave() {
        return chave;
    }

    public NFNotaResumo setChave(String chave) {
        this.chave = chave;
        return this;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public NFNotaResumo setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public NFNotaResumo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getIE() {
        return IE;
    }

    public NFNotaResumo setIE(String IE) {
        this.IE = IE;
        return this;
    }

    public ZonedDateTime getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public NFNotaResumo setDataHoraEmissao(ZonedDateTime dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
        return this;
    }

    public NFTipo getTipo() {
        return tipo;
    }

    public NFNotaResumo setTipo(NFTipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public NFNotaResumo setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public String getDigest() {
        return digest;
    }

    public NFNotaResumo setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    public ZonedDateTime getDataHoraRecebimento() {
        return dataHoraRecebimento;
    }

    public NFNotaResumo setDataHoraRecebimento(ZonedDateTime dataHoraRecebimento) {
        this.dataHoraRecebimento = dataHoraRecebimento;
        return this;
    }

    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public NFNotaResumo setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
        return this;
    }

    public NFSituacao getSituacao() {
        return situacao;
    }

    public NFNotaResumo setSituacao(NFSituacao situacao) {
        this.situacao = situacao;
        return this;
    }
}