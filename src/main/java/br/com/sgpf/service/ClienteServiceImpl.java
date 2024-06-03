package br.com.sgpf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgpf.entity.ClienteEntity;
import br.com.sgpf.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	private String mensagem;
	
	@Override
	public String save(ClienteEntity clienteEntity) throws Exception {
		
		if (clienteEntity.getNome() == null) {
			this.mensagem = "Digite o nome.";
			throw new Exception("Preencha o nome do cliente.");	
		}
		
		else if (clienteEntity.getCep() == null) {
			this.mensagem = "Preencha o cep.";
			throw new Exception("Preencha o nome do cliente");
			
		}
			else if (clienteEntity.getRua() == null) {
				this.mensagem = "Preencha o rua.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else if (clienteEntity.getTelefone() == null) {
				this.mensagem = "Preencha o telefone do cliente.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else if (clienteEntity.getBairro() == null) {
				this.mensagem = "Preencha o Bairro.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else if (clienteEntity.getNumero() == null) {
				this.mensagem = "Preencha o numero da residência.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else
			{
				clienteRepository.saveAndFlush(clienteEntity);
			}
			
		return mensagem;
		
	}	
@Override
public List<ClienteEntity> findAll() {
	
	return clienteRepository.findAll();
}
@Override
public ClienteEntity getOneByIdCliente(Long idCliente) {
	
	return clienteRepository.getOneByIdCliente(idCliente);
}
	
	}