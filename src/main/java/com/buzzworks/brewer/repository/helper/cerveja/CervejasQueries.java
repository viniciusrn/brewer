package com.buzzworks.brewer.repository.helper.cerveja;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.buzzworks.brewer.model.Cerveja;
import com.buzzworks.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {
	public Page<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);
}
