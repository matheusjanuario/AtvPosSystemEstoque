/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity;

import demtech.systemEstoque.model.entity.Comercial.Produto;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
public class Estoque {

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    @Id             /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstoque;
    @NotNull
    private Integer corredor;
    @NotNull
    private Integer prateleira;
    private Integer estoqueMinimo;

    private Integer estoqueAlto;

    /*16/11/2023 Ligações das Classes*/
    @OneToMany                                   // Indicando a forma de ligação
    @JoinColumn(name = "estoque_id")             // Chave estrangeira da ligação
    private Set<Produto> produtos;                /*Estoque(Todoo) pode ter 0 ou N produtos */

    public Estoque(){

    }

    //METODOS GETTERS E SETTERS
    public Long getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Long idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Integer getCorredor() {
        return corredor;
    }

    public void setCorredor(Integer corredor) {
        this.corredor = corredor;
    }

    public Integer getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(Integer prateleira) {
        this.prateleira = prateleira;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Integer getEstoqueAlto() {
        return estoqueAlto;
    }

    public void setEstoqueAlto(Integer estoqueAlto) {
        this.estoqueAlto = estoqueAlto;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }



}

