package InventoryApplication;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {

   // Buscar todos os clientes.
   Iterable<Cliente> buscarTodos();

   // Buscar cliente por ID.
   Cliente buscarPorId(Long id);

   // Inserir novo cliente.
   void inserir(Cliente cliente);

   // Atualizar cliente existente.
   void atualizar(Long id, Cliente cliente);

   // Deletar cliente por ID.
   void deletar(Long id);
}