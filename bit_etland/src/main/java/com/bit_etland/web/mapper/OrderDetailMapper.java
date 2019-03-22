package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.OrderDetailDTO;

@Repository
public interface OrderDetailMapper {

	public void insertOrderDetail(OrderDetailDTO ord);
	public List<OrderDetailDTO> selectOrderDetailList();
	public List<OrderDetailDTO> selectOrderDetails(String searchWord);
	public OrderDetailDTO selectOrderDetail(String searchWord);
	
	public int countOrderDetail();
	public boolean existOrderDetail(String searchWord);
	
	public void updateOrderDetail(OrderDetailDTO ord);
	public void deleteOrderDetail(OrderDetailDTO ord);
}
