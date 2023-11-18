/* Matheus Januario 16/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import jakarta.persistence.Entity;

@Entity
public class ItensPedido {
    private ItensPedidoPK itensPedidoPK;
    private Integer qtdProduto;
     private Double desconto;

}
