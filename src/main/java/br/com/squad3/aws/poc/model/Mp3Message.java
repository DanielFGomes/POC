package br.com.squad3.aws.poc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mp3Message {

    @JsonProperty("numero_unico_portabilidade")
    private String numeroPortabilidade;

    @JsonProperty("nome_cliente")
    private String nomeCompleto;

    @JsonProperty("valor_contrato")
    private BigDecimal valorContrato;

    @JsonProperty("taxa_juros")
    private BigDecimal taxaJuros;

    @JsonProperty("quantidade_parcelas")
    private Integer quantidadeParcelas;

    @JsonProperty("data_vencimento")
    private Date dataVencimento;

    @JsonProperty("cep_carta")
    private String cepCarta;

    @JsonProperty("endereco_carta")
    private String enderecoCarta;

    @JsonProperty("numero_carta")
    private String numeroCarta;

    @JsonProperty("complemento_carta")
    private String complementoCarta;

    @JsonProperty("bairro_carta")
    private String bairroCarta;

    @JsonProperty("cidade_carta")
    private String cidadeCarta;

    @JsonProperty("estado_carta")
    private String estadoCarta;

    @JsonProperty("cep_cliente")
    private String cepCliente;

    @JsonProperty("endereco_cliente")
    private String enderecoCliente;

    @JsonProperty("numero_cliente")
    private String numeroCliente;

    @JsonProperty("complemento_cliente")
    private String complementoCliente;

    @JsonProperty("bairro_cliente")
    private String bairroCliente;

    @JsonProperty("cidade_cliente")
    private String cidadeCliente;

    @JsonProperty("estado_cliente")
    private String estadoCliente;

    @JsonProperty("cep_imovel")
    private String cepImovel;

    @JsonProperty("endereco_imovel")
    private String enderecoImovel;

    @JsonProperty("numero_imovel")
    private String numeroImovel;

    @JsonProperty("complemento_imovel")
    private String complementoImovel;

    @JsonProperty("bairro_imovel")
    private String bairroImovel;

    @JsonProperty("cidade_imovel")
    private String cidadeImovel;

    @JsonProperty("estado_imovel")
    private String estadoImovel;
}

