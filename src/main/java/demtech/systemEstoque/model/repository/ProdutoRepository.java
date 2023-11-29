package demtech.systemEstoque.model.repository;

import demtech.systemEstoque.model.entity.Comercial.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //ESTE REPOSITORIO É UMA EXTENCAO DA CLASSE DE PLANO
}
