package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbr.vtex.classes.AbstractVtex;
import com.smartbr.vtex.classes.catalogo.attachment.AttachmentVtex;
import java.util.List;
import java.util.Map;

/**
 *
 * @author GiovanniFC
 */
public class SkuVtex extends AbstractVtex{

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("ProductId")
    private Integer idProduto;

    @JsonProperty("NameComplete")
    private String nomeCompleto;

    @JsonProperty("ComplementName")
    private String complementoNome;

    @JsonProperty("ProductName")
    private String nomeProduto;

    @JsonProperty("ProductDescription")
    private String descricaoProduto;

    @JsonProperty("ProductRefId")
    private String idRefProduto;

    @JsonProperty("TaxCode")
    private String taxCode;

    @JsonProperty("SkuName")
    private String nomeSku;

    @JsonProperty("IsActive")
    private Boolean ativo;

    @JsonProperty("IsTransported")
    private Boolean transportado;

    @JsonProperty("IsInventoried")
    private Boolean inventariado;

    @JsonProperty("IsGiftCardRecharge")
    private Boolean recargaValePresente;

    @JsonProperty("ImageUrl")
    private String imageUrl;

    @JsonProperty("DetailUrl")
    private String detalheUrl;

    @JsonProperty("CSCIdentification")
    private String identificacaoCSC;

    @JsonProperty("BrandId")
    private String idMarca;

    @JsonProperty("BrandName")
    private String nomeMarca;

    @JsonProperty("IsBrandActive")
    private Boolean marcaAtiva;

    @JsonProperty("Dimension")
    private SkuDimensionVtex dimensao;

    @JsonProperty("RealDimension")
    private SkuRealDimensionVtex dimensaoReal;

    @JsonProperty("ManufacturerCode")
    private String codigoFabricante;

    @JsonProperty("IsKit")
    private Boolean isKit;

    @JsonProperty("KitItems")
    private List<String> kitItems;

    @JsonProperty("Services")
    private List<String> servicos;

    @JsonProperty("Categories")
    private List<String> categorias;

    @JsonProperty("CategoriesFullPath")
    private List<String> categoriesFullPath;

    @JsonProperty("Attachments")
    private List<AttachmentVtex> attachments;

    @JsonProperty("Collections")
    private List<String> colecoes;

    @JsonProperty("SkuSellers")
    private List<SkuSellerVtex> skuVendedores;

    @JsonProperty("SalesChannels")
    private List<Integer> canaisVenda;

    @JsonProperty("Images")
    private List<SkuImageVtex> images;

    @JsonProperty("Videos")
    private List<String> videos;

    @JsonProperty("FileId")
    private Integer idFile;

    @JsonProperty("SkuSpecifications")
    private List<SkuSpecificationsVtex> skuEspecificacoes;

    @JsonProperty("ProductSpecifications")
    private List<SkuProductSpecificationsVtex> produtoEspecificacoes;

    @JsonProperty("ProductClustersIds")
    private String idsGrupoProduto;

    @JsonProperty("PositionsInClusters")
    private Map<String, Integer> posicoesCluster;

    @JsonProperty("ProductClusterNames")
    private Map<String, String> nomesClusterProduto;

    @JsonProperty("ProductClusterHighlights")
    private Map<String, String> destaqueClusterProduto;

    @JsonProperty("ProductCategoryIds")
    private String idsCategoriaProduto;

    @JsonProperty("IsDirectCategoryActive")
    private Boolean categoriaDiretaAtiva;

    @JsonProperty("ProductGlobalCategoryId")
    private Integer idCategoriaGlobalProduto;

    @JsonProperty("ProductCategories")
    private Map<String, String> categoriasProduto;

    @JsonProperty("CommercialConditionId")
    private Integer idCondicaoComercial;

    @JsonProperty("RewardValue")
    private Integer valorRecompensa;

    @JsonProperty("AlternateIds")
    private Map<String, String> idsAlternativos;

    @JsonProperty("AlternateIdValues")
    private List<String> valoresIdAlternativo;

    @JsonProperty("EstimatedDateArrival")
    private String dataEstimadaCheagda;

    @JsonProperty("MeasurementUnit")
    private String unidadeMedida;

    @JsonProperty("UnitMultiplier")
    private Integer multiplicadorUnidade;

    @JsonProperty("InformationSource")
    private String fonteInformacao;

    @JsonProperty("ModalType")
    private String tipoModal;

    @JsonProperty("KeyWords")
    private String palavrasChave;

    @JsonProperty("ReleaseDate")
    private String dataLancamento;

    @JsonProperty("ProductIsVisible")
    private Boolean productIsVisible;

    @JsonProperty("ShowIfNotAvailable")
    private Boolean mostrarSeNaoDisponivel;

    @JsonProperty("IsProductActive")
    private Boolean produtoAtivo;

    @JsonProperty("ProductFinalScore")
    private Integer pontuacaoFinalProduto;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getComplementoNome() {
        return complementoNome;
    }

    public void setComplementoNome(String complementoNome) {
        this.complementoNome = complementoNome;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getIdRefProduto() {
        return idRefProduto;
    }

    public void setIdRefProduto(String idRefProduto) {
        this.idRefProduto = idRefProduto;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getNomeSku() {
        return nomeSku;
    }

    public void setNomeSku(String nomeSku) {
        this.nomeSku = nomeSku;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean isTransportado() {
        return transportado;
    }

    public void setTransportado(Boolean transportado) {
        this.transportado = transportado;
    }

    public Boolean isInventariado() {
        return inventariado;
    }

    public void setInventariado(Boolean inventariado) {
        this.inventariado = inventariado;
    }

    public Boolean isRecargaValePresente() {
        return recargaValePresente;
    }

    public void setRecargaValePresente(Boolean recargaValePresente) {
        this.recargaValePresente = recargaValePresente;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDetalheUrl() {
        return detalheUrl;
    }

    public void setDetalheUrl(String detalheUrl) {
        this.detalheUrl = detalheUrl;
    }

    public String getIdentificacaoCSC() {
        return identificacaoCSC;
    }

    public void setIdentificacaoCSC(String identificacaoCSC) {
        this.identificacaoCSC = identificacaoCSC;
    }

    public String getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Boolean isMarcaAtiva() {
        return marcaAtiva;
    }

    public void setMarcaAtiva(Boolean marcaAtiva) {
        this.marcaAtiva = marcaAtiva;
    }

    public SkuDimensionVtex getDimensao() {
        return dimensao;
    }

    public void setDimensao(SkuDimensionVtex dimensao) {
        this.dimensao = dimensao;
    }

    public SkuRealDimensionVtex getDimensaoReal() {
        return dimensaoReal;
    }

    public void setDimensaoReal(SkuRealDimensionVtex dimensaoReal) {
        this.dimensaoReal = dimensaoReal;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Boolean isKit() {
        return isKit;
    }

    public void setIsKit(Boolean isKit) {
        this.isKit = isKit;
    }

    public List<String> getKitItems() {
        return kitItems;
    }

    public void setKitItems(List<String> kitItems) {
        this.kitItems = kitItems;
    }

    public List<String> getServicos() {
        return servicos;
    }

    public void setServicos(List<String> servicos) {
        this.servicos = servicos;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    public List<String> getCategoriesFullPath() {
        return categoriesFullPath;
    }

    public void setCategoriesFullPath(List<String> categoriesFullPath) {
        this.categoriesFullPath = categoriesFullPath;
    }

    public List<AttachmentVtex> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentVtex> attachments) {
        this.attachments = attachments;
    }

    public List<String> getColecoes() {
        return colecoes;
    }

    public void setColecoes(List<String> colecoes) {
        this.colecoes = colecoes;
    }

    public List<SkuSellerVtex> getSkuVendedores() {
        return skuVendedores;
    }

    public void setSkuVendedores(List<SkuSellerVtex> skuVendedores) {
        this.skuVendedores = skuVendedores;
    }

    public List<Integer> getCanaisVenda() {
        return canaisVenda;
    }

    public void setCanaisVenda(List<Integer> canaisVenda) {
        this.canaisVenda = canaisVenda;
    }

    public List<SkuImageVtex> getImages() {
        return images;
    }

    public void setImages(List<SkuImageVtex> images) {
        this.images = images;
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public List<SkuSpecificationsVtex> getSkuEspecificacoes() {
        return skuEspecificacoes;
    }

    public void setSkuEspecificacoes(List<SkuSpecificationsVtex> skuEspecificacoes) {
        this.skuEspecificacoes = skuEspecificacoes;
    }

    public List<SkuProductSpecificationsVtex> getProdutoEspecificacoes() {
        return produtoEspecificacoes;
    }

    public void setProdutoEspecificacoes(List<SkuProductSpecificationsVtex> produtoEspecificacoes) {
        this.produtoEspecificacoes = produtoEspecificacoes;
    }

    public String getIdsGrupoProduto() {
        return idsGrupoProduto;
    }

    public void setIdsGrupoProduto(String idsGrupoProduto) {
        this.idsGrupoProduto = idsGrupoProduto;
    }

    public Map<String, Integer> getPosicoesCluster() {
        return posicoesCluster;
    }

    public void setPosicoesCluster(Map<String, Integer> posicoesCluster) {
        this.posicoesCluster = posicoesCluster;
    }

    public Map<String, String> getNomesClusterProduto() {
        return nomesClusterProduto;
    }

    public void setNomesClusterProduto(Map<String, String> nomesClusterProduto) {
        this.nomesClusterProduto = nomesClusterProduto;
    }

    public Map<String, String> getDestaqueClusterProduto() {
        return destaqueClusterProduto;
    }

    public void setDestaqueClusterProduto(Map<String, String> destaqueClusterProduto) {
        this.destaqueClusterProduto = destaqueClusterProduto;
    }

    public String getIdsCategoriaProduto() {
        return idsCategoriaProduto;
    }

    public void setIdsCategoriaProduto(String idsCategoriaProduto) {
        this.idsCategoriaProduto = idsCategoriaProduto;
    }

    public Boolean isCategoriaDiretaAtiva() {
        return categoriaDiretaAtiva;
    }

    public void setCategoriaDiretaAtiva(Boolean categoriaDiretaAtiva) {
        this.categoriaDiretaAtiva = categoriaDiretaAtiva;
    }

    public Integer getIdCategoriaGlobalProduto() {
        return idCategoriaGlobalProduto;
    }

    public void setIdCategoriaGlobalProduto(Integer idCategoriaGlobalProduto) {
        this.idCategoriaGlobalProduto = idCategoriaGlobalProduto;
    }

    public Map<String, String> getCategoriasProduto() {
        return categoriasProduto;
    }

    public void setCategoriasProduto(Map<String, String> categoriasProduto) {
        this.categoriasProduto = categoriasProduto;
    }

    public Integer getIdCondicaoComercial() {
        return idCondicaoComercial;
    }

    public void setIdCondicaoComercial(Integer idCondicaoComercial) {
        this.idCondicaoComercial = idCondicaoComercial;
    }

    public Integer getValorRecompensa() {
        return valorRecompensa;
    }

    public void setValorRecompensa(Integer valorRecompensa) {
        this.valorRecompensa = valorRecompensa;
    }

    public Map<String, String> getIdsAlternativos() {
        return idsAlternativos;
    }

    public void setIdsAlternativos(Map<String, String> idsAlternativos) {
        this.idsAlternativos = idsAlternativos;
    }

    public List<String> getValoresIdAlternativo() {
        return valoresIdAlternativo;
    }

    public void setValoresIdAlternativo(List<String> valoresIdAlternativo) {
        this.valoresIdAlternativo = valoresIdAlternativo;
    }

    public String getDataEstimadaCheagda() {
        return dataEstimadaCheagda;
    }

    public void setDataEstimadaCheagda(String dataEstimadaCheagda) {
        this.dataEstimadaCheagda = dataEstimadaCheagda;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Integer getMultiplicadorUnidade() {
        return multiplicadorUnidade;
    }

    public void setMultiplicadorUnidade(Integer multiplicadorUnidade) {
        this.multiplicadorUnidade = multiplicadorUnidade;
    }

    public String getFonteInformacao() {
        return fonteInformacao;
    }

    public void setFonteInformacao(String fonteInformacao) {
        this.fonteInformacao = fonteInformacao;
    }

    public String getTipoModal() {
        return tipoModal;
    }

    public void setTipoModal(String tipoModal) {
        this.tipoModal = tipoModal;
    }

    public String getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Boolean isProductIsVisible() {
        return productIsVisible;
    }

    public void setProductIsVisible(Boolean productIsVisible) {
        this.productIsVisible = productIsVisible;
    }

    public Boolean getMostrarSeNaoDisponivel() {
        return mostrarSeNaoDisponivel;
    }

    public void setMostrarSeNaoDisponivel(Boolean mostrarSeNaoDisponivel) {
        this.mostrarSeNaoDisponivel = mostrarSeNaoDisponivel;
    }

    public Boolean isProdutoAtivo() {
        return produtoAtivo;
    }

    public void setProdutoAtivo(Boolean produtoAtivo) {
        this.produtoAtivo = produtoAtivo;
    }

    public Integer getPontuacaoFinalProduto() {
        return pontuacaoFinalProduto;
    }

    public void setPontuacaoFinalProduto(Integer pontuacaoFinalProduto) {
        this.pontuacaoFinalProduto = pontuacaoFinalProduto;
    }
}
