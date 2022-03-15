package com.valdemar.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdemar.cursomc.domain.Categoria;
import com.valdemar.cursomc.repositories.CategoriaRepository;
import com.valdemar.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private  CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));
	}	

}
