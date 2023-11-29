package demtech.systemEstoque.model.repository;

import demtech.systemEstoque.model.entity.Pessoa.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
