package br.com.alura.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.loja.models.Produto;

@Controller
public class ProdutosController {	
	
	@RequestMapping("/produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String grava(Produto produto) {
		return "produtos/ok";
	}
}
