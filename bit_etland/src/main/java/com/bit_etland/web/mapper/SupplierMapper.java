package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.SupplierDTO;

@Repository
public interface SupplierMapper {
	
	public void insertSupplier(SupplierDTO sup);
	public List<SupplierDTO> selectSupplierList();
	public List<SupplierDTO> selectSuppliers(String searchWord);
	public SupplierDTO selectSupplier(String searchWord);
	
	public int countSuppliers();
	public boolean existSupplier(String searchWord);
	
	public void updateSupplier(SupplierDTO sup);
	public void deleteSupplier(SupplierDTO sup);
}
