package com.smartbr.vtex.classes.catalogo.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omega.catalogo.classe.vo.AbstractVtex;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class SupplierVtex extends AbstractVtex{
    
    @JsonProperty("Id")
    private Integer id;
    
    @JsonProperty("Name")
    private String nome;
    
    @JsonProperty("CorporateName")
    private String nomeCorporativo;
    
    @JsonProperty("StateInscription")
    private String inscricaoEstadual;
    
    @JsonProperty("Cnpj")
    private String cnpj;
    
    @JsonProperty("Phone")
    private String telefone;
    
    @JsonProperty("CellPhone")
    private String celular;
    
    @JsonProperty("CorporatePhone")
    private String telefoneCorporativo;
    
    @JsonProperty("Email")
    private String email;
    
    @JsonProperty("IsActive")
    private Boolean ativo;

    public SupplierVtex() {
        
    }

    public static SupplierVtex convertFornecedorToSupplierVtex(Fornecedor fornecedor) throws SmartException {
        
        LojaFornecedor lojaFornecedor = fornecedor.lojaPrincipal();
        
        Pessoa pessoa = lojaFornecedor.getPessoa();
        
        if (Utils.isEmpty(pessoa.getPessoaJuridica())) {
            throw new SmartException(EnumSmartExceptionVtex.SUPPLIERVTEX_NAO_FOI_POSSIVEL_ENCONTRAR_PJ_PARA_FORNECEDOR, fornecedor.getId());
        }
        
        PessoaEmail pessoaEmail = pessoa.getEmailPrincipal();
        
        PessoaTelefone telefonePrincial = pessoa.getTelefonePrincipal();
        
        PessoaTelefone telefoneCobranca = pessoa.getTelefoneCobranca();
        
        PessoaTelefone telefoneCelular = pessoa.getTelefone(EnumTipoTelefone.CELULAR);
        
        SupplierVtex supplierVtex = new SupplierVtex();
        
        supplierVtex.setNome(fornecedor.getNome());
        supplierVtex.setNomeCorporativo(fornecedor.getNomeFantasia());
        supplierVtex.setCnpj(pessoa.getPessoaJuridica().getCnpj());
        supplierVtex.setEmail(pessoaEmail != null ? pessoaEmail.getEmail() : null);
        supplierVtex.setInscricaoEstadual(pessoa.getPessoaJuridica().getIe());
        supplierVtex.setTelefone(telefonePrincial != null ? telefonePrincial.gerarTelefoneDDDSemNonoDigito() : null);
        supplierVtex.setTelefoneCorporativo(telefoneCobranca != null ? telefoneCobranca.getTelefoneCompleto() : null);
        supplierVtex.setCelular(telefoneCelular != null ? telefoneCelular.getTelefoneCompleto() : null);
        supplierVtex.setAtivo(Boolean.TRUE);
        
        return supplierVtex;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCorporativo() {
        return nomeCorporativo;
    }

    public void setNomeCorporativo(String nomeCorporativo) {
        this.nomeCorporativo = nomeCorporativo;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefoneCorporativo() {
        return telefoneCorporativo;
    }

    public void setTelefoneCorporativo(String telefoneCorporativo) {
        this.telefoneCorporativo = telefoneCorporativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
