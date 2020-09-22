
// Local padrao dos controladores rest.
// onde colocamos os controllers

package com.wpaluno.cursowp.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/categorias")
public class CategoriaResource {
	
// methodo http 
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		
		return " REST esta funcionando";
	}

}
