/* Matheus Januario 16/11/2023
* Criado está classe para ligar as chaves de Itens, Produto e Pedido*/
package demtech.systemEstoque.model.entity.Comercial;

import jakarta.persistence.Entity;

@Entity
public class ItensPedidoPK {

    private Pedido pedido;              /* associação a classe */
    private Produto produto;
}
