package demtech.systemEstoque.controller;

import demtech.systemEstoque.model.entity.Pessoa.Cliente;
import demtech.systemEstoque.model.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository){      //construtor que recebe a instancia de clientes
        this.clienteRepository = clienteRepository;
    }

    //OPERACOES CRUD

    // CONSULTA UMA LISTA COM TODOS CLIENTES
    @GetMapping
    public List<Cliente> listCliente(){
        return clienteRepository.findAll();
    }

    //CONSULTA UM CLIENTE ESPECIFICO PELO SEU ID
    @GetMapping("/clientes{id}")
    public Cliente showCliente(@PathVariable Long id){
        return  clienteRepository.getReferenceById(id);
    }

    //INSERE UM NOVO CLIENTE
    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //EXCLUI OS DADOS DE CLIENTE
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }

    //ATUALIZA OS DADOS DE CLIENTE
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente clienteAux = clienteRepository.getReferenceById(id);

        clienteAux.setNome(cliente.getNome());
        clienteAux.setTelefone(cliente.getTelefone());
        clienteAux.setEndereco(cliente.getEndereco());
        clienteAux.setCidade(cliente.getCidade());
        clienteAux.setUF(cliente.getUF());
        return clienteRepository.save(clienteAux);
    }

}
