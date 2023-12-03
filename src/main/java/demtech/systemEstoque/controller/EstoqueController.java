package demtech.systemEstoque.controller;

import demtech.systemEstoque.model.entity.Estoque;
import demtech.systemEstoque.model.repository.EstoqueRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {

    private EstoqueRepository estoqueRepository;

    public EstoqueController(EstoqueRepository estoqueRepository){
        this.estoqueRepository = estoqueRepository;
    }

    //CONSULTA ESTOQUE TOTAL
    public List<Estoque> listEstoque(){
        return estoqueRepository.findAll();
    }

    //CONSULTA UM ESTOQUE ESPECIFICO
    @GetMapping("/{Id}")
    public Estoque showEstoque(@PathVariable Long id){

        return estoqueRepository.getReferenceById(id);
    }

    //CRIACAO DE ESTOQUE
    @PostMapping
    public Estoque saveEstoque(@RequestMapping Estoque estoque){
        return estoqueRepository.save(estoque);
    }

    //EXCLUSAO DE UM ESTOQUE
    @DeleteMapping("/{id}")
    public void  deleteEstoque(@PathVariable Long id){
        estoqueRepository.deleteById(id);
    }

    //atualiza os dados de estoque
    @PutMapping("/{id}")
        public Estoque updateEstoque(@PathVariable Long id, @RequestBody Estoque estoque){
            Estoque estoqueAux = estoqueRepository.getReferenceById(id);

            estoqueAux.setProdutos(estoque.getProdutos());
            estoqueAux.setCorredor(estoque.getCorredor());
            estoqueAux.setPrateleira(estoque.getPrateleira());
            estoqueAux.setEstoqueMinimo(estoque.getEstoqueMinimo());
            estoqueAux.setEstoqueAlto(estoque.getEstoqueAlto());
            return estoqueRepository.save(estoqueAux);
        }
    }
}
