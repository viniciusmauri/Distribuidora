package br.com.mvsmtech.domain.dto;

import br.com.mvsmtech.domain.model.Fornecedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProdutoDTO {

    private Long id;

    private String nomeProduto;

    private Integer quantidade;

    private Fornecedor fornecedor;
}
