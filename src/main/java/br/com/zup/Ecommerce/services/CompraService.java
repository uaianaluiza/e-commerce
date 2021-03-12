package br.com.zup.Ecommerce.services;

import br.com.zup.Ecommerce.models.Cliente;
import br.com.zup.Ecommerce.models.Compra;
import br.com.zup.Ecommerce.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CompraService {
    private static List<Compra> compras = new ArrayList<>();

    /**
     * Método novaCompra permite adicionar um nova compra na lista de compras
     * */

    public Compra novaCompra(Compra compra){
        compras.add(compra);
        return compra;
    }

    /**
     * Método verListaDeCompra permite visualizar todas as compras na lista de compras
     * */
    public Compra verListaDeCompra(Compra compra){
        compra.setProdutoscomprados(new ArrayList<>());
        return compra;
    }

}
