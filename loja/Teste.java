package com.senac.loja;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
//        POJO = plain old java object

//        Carga inicial Sistema, criando categoria, produtos, gerente e vendedor
        Categoria categoria = new Categoria("Bebidas");
        Produto cocaCola = new Produto("Coca Cola",7.50,categoria);
        Produto guarana = new Produto("Guaruna",6.50,categoria);
        Cliente cliente = new Cliente("0000000000","cliente@email.com","Joao Silva");
        cliente.setNome("Marcos Silva");
        Vendedor vendedor = new Vendedor("99999999","vendedor@loja","Maria Souza","ABCD123",2000.00);
        Gerente gerente = new Gerente("8888888888","gerente@loja","Fulano Silva",5000);
        gerente.adicionaVendedor(vendedor);

        System.out.println("O desconto atual é de " + NotaFiscal.desconto / 100);


//        adiciona produtos na nota fiscals
        NotaFiscal notaFiscal = new NotaFiscal(cliente);
        notaFiscal.setVendedor(vendedor);
        notaFiscal.adicionaProduto(cocaCola);
        notaFiscal.adicionaProduto(cocaCola);
        notaFiscal.adicionaProduto(cocaCola);
        notaFiscal.adicionaProduto(guarana);
//      adiciona o vendedor a venda
        vendedor.adicionaVenda(notaFiscal);


//      busca os produtos da nota fisca e exibe
        List<Produto> produtos = notaFiscal.getProdutoList();

        System.out.println("For each tradicional");
        System.out.println("For each LIST");
//        LAMBDA
//        ARROW FUNCTION
        produtos.forEach(produto -> System.out.println(produto.getNome()));
        System.out.println(produtos.contains(cocaCola));
        System.out.println(produtos.indexOf(cocaCola));

        produtos.remove(cocaCola);
        System.out.println("DEPOIS DO REMOVE");
        produtos.forEach(produto -> System.out.println(produto.getNome()));


//       Mostra resultado final da compra e salário do gerente e do vendedor após venda

        System.out.println(notaFiscal.getCliente().getNome() + " comprou " + notaFiscal.getValorTotal() + " vendedor:  " + notaFiscal.getVendedor().getNome());
        System.out.println("Salario Vendedor:" + vendedor.calcularSalario());
        System.out.println("Salario Gerente:" + gerente.calcularSalario());

    }
}
