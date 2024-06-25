package com.restaurante.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurante.model.ItemPedido;
import com.restaurante.model.Pedido;
import com.restaurante.repository.PedidoRepository;
import com.restaurante.service.PedidoService;

@Service
@Transactional
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido criarPedido(int numero) {
		Pedido novoPedido = new Pedido(numero);
		return pedidoRepository.save(novoPedido);
	}

	@Override
	public void adicionarItem(int numeroPedido, String nomeItem, double precoItem, int quantidade) {
		Pedido pedido = pedidoRepository.findById((long) numeroPedido)
				.orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado: " + numeroPedido));

		ItemPedido item = new ItemPedido(nomeItem, precoItem, quantidade);
		pedido.adicionarItem(item);
		pedidoRepository.save(pedido);
	}

	@Override
	public void removerItem(int numeroPedido, String nomeItem) {
		Pedido pedido = pedidoRepository.findById((long) numeroPedido)
				.orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado: " + numeroPedido));

		ItemPedido itemParaRemover = pedido.getItens().stream().filter(item -> item.getNome().equals(nomeItem))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Item não encontrado no pedido: " + nomeItem));

		pedido.removerItem(itemParaRemover);
		pedidoRepository.save(pedido);
	}

	@Override
	public Pedido consultarPedido(int numeroPedido) {
		return pedidoRepository.findById((long) numeroPedido)
				.orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado: " + numeroPedido));
	}
}
