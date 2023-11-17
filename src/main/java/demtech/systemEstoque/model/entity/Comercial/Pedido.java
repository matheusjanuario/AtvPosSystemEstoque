/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import demtech.systemEstoque.model.entity.Pessoa.Cliente;

import javax.xml.crypto.Data;
import java.util.Set;

public class Pedido {


    private Long idPedido;
    private Data dataPedido;
    private Double valorTotal;

    /*Ligação das Classes 16/11/2023*/

    private Set<ItensPedido> itensPedidos;
    private Set<Cliente> clientes;                  /*Pode haver 0 cliente ou N clientes realizando pedido*/
    private FormaPagamento formaPagamento;           /*Pedido deve conter 1 forma de pagamento*/
}
