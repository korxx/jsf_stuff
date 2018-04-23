/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.Dependent;

/**
 *
 * @author kor
 */

@Dependent
public class Catalogo implements Serializable{


    private List<Produto> produtos;

    public Catalogo() {
        produtos = new ArrayList<>();
        inicializar();
    }

    private void inicializar() {
        produtos.add(new Produto(1, "Apontador", 1.95));
        produtos.add(new Produto(2, "Caneta", 2.5));
        produtos.add(new Produto(3, "Borracha", 0.85));
    }

    public void adicionar(Produto umProduto) {
        produtos.add(umProduto);
    }

    public List<Produto> listarTodos() {
        return Collections.unmodifiableList(produtos);
    }
}
