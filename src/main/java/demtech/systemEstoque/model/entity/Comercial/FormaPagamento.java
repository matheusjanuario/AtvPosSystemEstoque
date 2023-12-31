/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormaPagamento  {

    @Id             /* Indica que é a chave ID para tabela que é auto incremento */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPagamento;
    private String descPagamento;

    // METODOS
    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getDescPagamento() {
        return descPagamento;
    }

    public void setDescPagamento(String descPagamento) {
        this.descPagamento = descPagamento;
    }



}
