package com.restaurante.service;

import com.restaurante.model.Pedido;

public interface PedidoService {
    Pedido criarPedido(int numero);
    void adicionarItem(int numeroPedido, String nomeItem, double precoItem, int quantidade);
    void removerItem(int numeroPedido, String nomeItem);
    Pedido consultarPedido(int numeroPedido);
}

