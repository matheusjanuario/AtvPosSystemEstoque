/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Pessoa;

import jakarta.persistence.Entity;

//"extends Cliente", representa que Cliente PF herda as caracteristicas de Cliente
@Entity
public class ClientePessoaFisica extends Cliente{
    private String cpf;

}
