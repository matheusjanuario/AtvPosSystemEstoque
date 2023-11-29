/* Matheus Januario 16/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import jakarta.persistence.*;

@Entity
public class ItensPedido {

    @Id             /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private Integer qtdProduto;
    private Double desconto;

    public ItensPedido(){

    }

    // METODOS GETTERS E SETTERS
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(Integer qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }


}
