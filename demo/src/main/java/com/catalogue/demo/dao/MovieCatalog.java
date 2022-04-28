package com.catalogue.demo.dao;

import java.util.List;

import com.catalogue.demo.Entity.CatalogItem;

public interface MovieCatalog {
	public List<CatalogItem> getCatalog(String userId);
}
