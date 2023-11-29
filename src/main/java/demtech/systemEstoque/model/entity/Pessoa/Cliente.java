/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Pessoa;

import jakarta.persistence.*;
import jakarta.persistence.Inheritance;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idCliente;
    private String nome;

    private Integer telefone;
    private String endereco;
    private String cidade;
    private String UF;

    public Cliente(){
        // METODO CONSTRUTOR DE CLIENTE
    }

    // METODOS GETTERS E SETTERS
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }


}
