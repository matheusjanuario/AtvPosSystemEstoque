/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity.Comercial;

import jakarta.persistence.Entity;

@Entity
public class Produto {
    private Long idProduto;
    private String descProduto;
    private Long quantidade;
    private Double vlrUnitario;

}
