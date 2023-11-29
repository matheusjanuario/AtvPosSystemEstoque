package demtech.systemEstoque.model.repository;

import demtech.systemEstoque.model.entity.Comercial.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
