/* Matheus Januario 16/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItensPedido {
    @Id             /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ItensPedidoPK itensPedidoPK;
    private Integer qtdProduto;
     private Double desconto;

}
