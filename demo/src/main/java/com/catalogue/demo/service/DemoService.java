package com.catalogue.demo.service;

import java.util.List;

import com.catalogue.demo.Entity.CatalogItem;

public interface DemoService {

	public List<CatalogItem> getCatalog( String userId) ;
}
