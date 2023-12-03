package demtech.systemEstoque.controller;

import demtech.systemEstoque.model.entity.Comercial.Pedido;
import demtech.systemEstoque.model.entity.Pessoa.Cliente;
import demtech.systemEstoque.model.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoRepository pedidoRepository;

    public PedidoController(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    //OPERACOES CRUD

    //CONSULTA TODOS OS PEDIDOS
    @GetMapping
    public List<Pedido> listPedido(){
        return pedidoRepository.findAll();
    }

    //CONSULTA PEDIDOS ESPECIFICOS
    @GetMapping("/{id}")
    public Pedido showPedido(@PathVariable Long id){
        return pedidoRepository.getReferenceById(id);
    }

    //INSERIR UM NOVO PEDIDO
    @PostMapping
    public Pedido savePedido(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    //EXCLUSAO DE PEDIDO
    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id){
        pedidoRepository.deleteById(id);
    }

    //ATUALIZACAO DE PEDIDO
    @PutMapping("/{id}")
    public Pedido updatePedido(@PathVariable Long id, @RequestBody Pedido pedido){
        Pedido pedidoAux = pedidoRepository.getReferenceById(id);
        pedidoAux.setDataPedido(pedido.getDataPedido());
        pedidoAux.setClientes(pedido.getClientes());
        pedidoAux.setItensPedidos(pedido.getItensPedidos());
        pedidoAux.setProdutos(pedido.getProdutos());
        pedidoAux.setFormaPagamento(pedido.getFormaPagamento());
        pedidoAux.setValorTotal(pedido.getValorTotal());

        return pedidoRepository.save(pedidoAux);
    }
}
