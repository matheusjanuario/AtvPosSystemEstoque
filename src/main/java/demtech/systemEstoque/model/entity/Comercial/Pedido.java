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
    // Indicando a forma de ligação
    private Set<Cliente> clientes;              /*Pode haver 0 cliente ou N clientes realizando pedido*/

    @ManyToOne
    private FormaPagamento formaPagamento;           /*Pedido deve conter 1 forma de pagamento*/
    @ManyToOne
    private Produto produtos;

    // METODOS GET E SET
    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Data getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Data dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Set<ItensPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(Set<ItensPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

}
