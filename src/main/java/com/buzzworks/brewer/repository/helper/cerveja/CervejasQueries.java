package com.buzzworks.brewer.repository.helper.cerveja;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.buzzworks.brewer.model.Cerveja;
import com.buzzworks.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {
	public List<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);
}
