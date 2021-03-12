package br.com.zup.Ecommerce.controllers;

import br.com.zup.Ecommerce.models.Compra;
import br.com.zup.Ecommerce.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("compras/")

public class CompraController {

    @Autowired
    private CompraService compraService;

    /**  @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Compra realizarCompra() {

    }*/
    @GetMapping
    public List<Compra> verTodasAsCompras(){
        Compra listadecompras = null;
        listadecompras = compraService.verListaDeCompra(listadecompras);
            return new ArrayList<Compra>();

    }
}
