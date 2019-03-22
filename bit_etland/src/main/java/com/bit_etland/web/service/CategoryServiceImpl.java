package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CategoryDTO;
import com.bit_etland.web.proxy.Proxy;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Override
	public void registCategory(CategoryDTO cate) {
			
	}

	@Override
	public List<?> bringCategoryList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> retrieveCategorys(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO retrieveCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategorys(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existCategory(Proxy pxy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

}
