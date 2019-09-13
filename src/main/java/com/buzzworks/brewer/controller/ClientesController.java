package com.buzzworks.brewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.buzzworks.brewer.model.TipoPessoa;
import com.buzzworks.brewer.repository.Estados;
@Controller

@RequestMapping("/cliente")
public class ClientesController {

	
	@Autowired
	private Estados estados;
	
	@RequestMapping("novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cliente/CadastroCliente");
		mv.addObject("tiposPessoa", TipoPessoa.values());
		mv.addObject("estados", estados.findAll());
		return mv;
	}
	
}
