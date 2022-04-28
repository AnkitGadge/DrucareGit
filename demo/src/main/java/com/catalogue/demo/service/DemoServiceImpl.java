package com.catalogue.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogue.demo.Entity.CatalogItem;
import com.catalogue.demo.dao.MovieCatalog;
@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private MovieCatalog movieCatalog;
	@Override
	
	public List<CatalogItem> getCatalog(String userId) {
		
		return movieCatalog.getCatalog(userId);
	}

}
