package com.bit_etland.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDetailDTO;



@Component
public interface OrderDetailService {

	public void registOrderDetail(OrderDetailDTO ord);
	public List<OrderDetailDTO> bringOrderDetailList();
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord);
	public OrderDetailDTO retrieveOrderDetail(String searchWord);
	
	public int countOrderDetail();
	public boolean existOrderDetail(String searchWord);
	
	public void modifyOrderDetail(OrderDetailDTO ord);
	public void removeOrderDetail(OrderDetailDTO ord);
	
}
