/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Pessoa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

//"extends Cliente", representa que Cliente PJ herda as caracteristicas de Cliente
@Entity
@DiscriminatorValue(value = "ClientePessoaJuridica")
public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

}
