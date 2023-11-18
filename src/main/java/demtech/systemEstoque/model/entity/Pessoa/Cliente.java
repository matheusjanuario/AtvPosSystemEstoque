/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Pessoa;

import jakarta.persistence.Entity;

@Entity
public class Cliente {
    private Long idCliente;
    private String nome;

    private Integer telefone;
    private String endereco;
    private String cidade;
    private String UF;
}
