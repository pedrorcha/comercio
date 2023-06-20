package com.itb.inf2hm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2hm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	
	
@GetMapping("/listar")
	public String listarProdutos(Model model) {
		// System.out.println("Lista de Produtos");   // Não conseguirá, de fato, acessar o model	
	
	Produto produto = new Produto();
	produto.setId(145l);
	produto.setNome("Televisor 70' Samsung");
	produto.setCodigoBarras("JFASJLKJ23OJ94");
	produto.setPreco(6541.25);
	
	Produto produto2 = new Produto();
	produto2.setId(146l);
	produto2.setNome("xbox one");
	produto2.setCodigoBarras("sdlfkj349234");
	produto2.setPreco(6540.23);
	
	// Adicionando os produtos no ArrayList
	listaDeProdutos.add(produto);
	listaDeProdutos.add(produto2);
	
	model.addAttribute("listaDeProdutos", listaDeProdutos);
	
	return "produtos";
	}


@GetMapping("/novo-produto")

	public String novoProduto() {
	return "novo-produto";
	}

	
}
