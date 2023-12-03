package demtech.systemEstoque.controller;

import demtech.systemEstoque.model.entity.Comercial.Produto;
import demtech.systemEstoque.model.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                                                     //API do tipo REST
@RequestMapping("/produtos")                                       //trata as requisicoes da URI de Produto "/produtos"
public class ProdutoController {
    // controlador ira tratar as requisicos para operacoes CRUD de Produtos

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){      //construtor que recebe uma instancina de produtos
        this.produtoRepository = produtoRepository;
    }
    //OPERACOES CRUD

    //Consulta dados dos Produtos por ID
    @GetMapping("/{id}")                                            //trata apenas a requisicoes da URI de /produtos que estiverem com ID
    public Produto show(@PathVariable Long id){
        //busca os produtos no bancos por ID
        return produtoRepository.getReferenceById(id);
    }

    //Consulta uma lista de Produtos
    @GetMapping
    public List<Produto> list(){
        return produtoRepository.findAll();
    }

    //Operacao de insercao de produtos
    @PostMapping
    public Produto save(@RequestBody Produto produto){                       //Os dados serao instanciados de acordo com as informacoes da requisicao
       return produtoRepository.save(produto);
    }


    //operacao de exclusao de produtos
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produtoRepository.deleteById(id);
    }

    //operacao de atualizacao UPDATE
    @PutMapping("/{id}")
      public Produto update(@PathVariable Long id, @RequestBody Produto produto){
        //buscar o produto correto pelo id
        Produto produtoAux = produtoRepository.getReferenceById(id);

        produtoAux.setDescProduto(produto.getDescProduto());
        produtoAux.setQuantidade(produto.getQuantidade());
        produtoAux.setVlrUnitario(produto.getVlrUnitario());
        return produtoRepository.save(produtoAux);
      }
}
