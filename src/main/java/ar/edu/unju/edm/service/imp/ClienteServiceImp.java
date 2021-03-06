package ar.edu.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Cliente;
import ar.edu.unju.edm.service.IClienteService;
import ar.edu.unju.edm.util.ListadoClientes;

@Service
@Qualifier("unImp")
public class ClienteServiceImp implements IClienteService{
	
	private List<Cliente> listadoClientes = ListadoClientes.clientes;
	
	@Autowired
	Cliente unCliente;

	@Override
	public void guardarCliente(Cliente unCliente) {
		// TODO Auto-generated method stub
		listadoClientes.add(unCliente);
	}

	@Override
	public Cliente crearCliente() //retorna un cliente a travez del @Autowired
	{
		// TODO Auto-generated method stub
		return unCliente;
	}

	@Override
	public List<Cliente> obtenerTodosClientes() {
		// TODO Auto-generated method stub
		return listadoClientes;
	}

}