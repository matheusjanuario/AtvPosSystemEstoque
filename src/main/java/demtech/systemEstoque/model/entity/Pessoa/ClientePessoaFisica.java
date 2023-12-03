/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Pessoa;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

//"extends Cliente", representa que Cliente PF herda as caracteristicas de Cliente
@Entity
@DiscriminatorValue(value = "ClientePessoaFisica")
public class ClientePessoaFisica extends Cliente{
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;

}
