/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id              /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    private String nome;

    private Integer telefone;
    private String endereco;
    private String cidade;
    private String UF;
}
