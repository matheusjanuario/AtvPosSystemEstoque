package demtech.systemEstoque.model.repository;

import demtech.systemEstoque.model.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
