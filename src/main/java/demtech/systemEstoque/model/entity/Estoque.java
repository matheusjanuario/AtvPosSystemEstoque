/* Matheus Januario 15/11/2023 */
package demtech.systemEstoque.model.entity;

import demtech.systemEstoque.model.entity.Comercial.Produto;

import java.util.Set;

public class Estoque {
    private Long idEstoque;
    private Integer corredor;
    private Integer prateleira;
    private Integer estoqueMinimo;
    private Integer estoqueAlto;

    /*16/11/2023 Ligações das Classes*/
    private Set<Produto> produtos;          /*Estoque(Todoo) pode ter 0 ou N produtos */

}

