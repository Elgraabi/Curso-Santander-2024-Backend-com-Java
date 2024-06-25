package com.restaurante.controller;

import com.restaurante.model.ItemPedido;
import com.restaurante.model.Pedido;
import com.restaurante.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@PostMapping("/criar")
	public Pedido criarPedido(@RequestParam int numero) {
		return pedidoService.criarPedido(numero);
	}

	@PostMapping("/{numero}/adicionar-item")
	public Pedido adicionarItem(@PathVariable int numero, @RequestBody ItemPedido item) {
		pedidoService.adicionarItem(numero, item.getNome(), item.getPreco(), item.getQuantidade());
		return pedidoService.consultarPedido(numero);
	}

	@DeleteMapping("/{numero}/remover-item")
	public Pedido removerItem(@PathVariable int numero, @RequestParam String nomeItem) {
		pedidoService.removerItem(numero, nomeItem);
		return pedidoService.consultarPedido(numero);
	}

	@GetMapping("/{numero}")
	public Pedido consultarPedido(@PathVariable int numero) {
		return pedidoService.consultarPedido(numero);
	}
}
