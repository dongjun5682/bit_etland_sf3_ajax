package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;

@Component
public interface CategoryService {
	public void registCategory(CategoryDTO cate);
	public List<?> bringCategoryList(Proxy pxy);
	public List<CategoryDTO> retrieveCategorys(Proxy pxy);
	public CategoryDTO retrieveCategory(CategoryDTO cate);
	public int countCategorys(Proxy pxy);
	public boolean existCategory(Proxy pxy);
	public void modifyCategory(CategoryDTO cate);
	public void removeCategory(CategoryDTO cate);
	
}
