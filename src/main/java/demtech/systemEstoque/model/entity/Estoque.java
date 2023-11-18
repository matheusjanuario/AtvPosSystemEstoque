/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity;

import demtech.systemEstoque.model.entity.Comercial.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Set;

@Entity
public class Estoque {
    @Id             /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstoque;
    private Integer corredor;
    private Integer prateleira;
    private Integer estoqueMinimo;
    private Integer estoqueAlto;

    /*16/11/2023 Ligações das Classes*/
    private Set<Produto> produtos;          /*Estoque(Todoo) pode ter 0 ou N produtos */

}

