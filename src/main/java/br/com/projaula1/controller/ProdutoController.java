package br.com.projaula1.controller;

import br.com.projaula1.constant.Constants;
import br.com.projaula1.model.Produto;
import br.com.projaula1.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping(Constants.API_PRODUTO)
    public Produto save(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

    @GetMapping(Constants.API_PRODUTO)
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @PutMapping(Constants.API_PRODUTO)
    public Produto update(@RequestBody Produto produto){
        return this.save(produto);
    }

    @DeleteMapping(Constants.API_PRODUTO + "/{id}")
    public void delete(@PathVariable("id") int id){
        produtoService.delete(id);
    }

    @GetMapping(Constants.API_PRODUTO + "/{id}")
    public Optional<Produto> findById(@PathVariable("id") int id){
        return produtoService.findById(id);
    }
}
