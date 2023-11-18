/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import demtech.systemEstoque.model.entity.Pessoa.Cliente;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Set;
@Entity
public class Pedido {
    @Id              /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPedido;
    @Temporal(TemporalType.DATE)                    // Indica que a coluna no banco de dados será formato Data
    private Data dataPedido;
    private Double valorTotal;

    /*Ligação das Classes 16/11/2023*/

    private Set<ItensPedido> itensPedidos;
    private Set<Cliente> clientes;                  /*Pode haver 0 cliente ou N clientes realizando pedido*/
    private FormaPagamento formaPagamento;           /*Pedido deve conter 1 forma de pagamento*/

    private Produto produtos;

}
