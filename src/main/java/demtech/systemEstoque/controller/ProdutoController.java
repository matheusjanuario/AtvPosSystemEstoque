package demtech.systemEstoque.controller;

import demtech.systemEstoque.model.entity.Comercial.Produto;
import demtech.systemEstoque.model.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Produto> show(@PathVariable Long id){

        //tratamento de erros
        Optional<Produto> optional = produtoRepository.findById(id);

        //verifica se existe um cadastro com este ID de Produto
        if (optional.isPresent()){
            return new ResponseEntity<Produto>(optional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Produto>(HttpStatus.NOT_FOUND);
        }

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
    public ResponseEntity<Produto> delete(@PathVariable Long id){

        try{
            produtoRepository.deleteById(id);
            return new ResponseEntity<Produto>(HttpStatus.OK);

        }catch (RuntimeException e){
            return new ResponseEntity<Produto>(HttpStatus.NOT_FOUND);
        }
    }

    //operacao de atualizacao UPDATE
    @PutMapping("/{id}")
      public ResponseEntity <Produto>  update(@PathVariable Long id, @RequestBody @Valid Produto produto) {

        //Operacao de validacao
        Optional<Produto> optinal = produtoRepository.findById(id);
        if (optinal.isPresent()) {

            //buscar o produto correto pelo id
            Produto produtoAux = optinal.get();

            produtoAux.setDescProduto(produto.getDescProduto());
            produtoAux.setQuantidade(produto.getQuantidade());
            produtoAux.setVlrUnitario(produto.getVlrUnitario());
            return new ResponseEntity<Produto>(produtoRepository.save(produtoAux), HttpStatus.OK);
        } else
            {
            return new ResponseEntity<Produto>(HttpStatus.NOT_FOUND);

        }
    }
}
