package com.bit_etland.web.mapper;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;

@Repository
public interface ImageMapper {
	
	public void insertImage(ImageDTO img);
	public List<ImageDTO> selectImageList(Proxy pxy);
	public List<ImageDTO> selectImages(ImageDTO img);
	public ImageDTO selectImage(ImageDTO img);
	public ImageDTO selectImageSeq(ImageDTO img);
	public String lastImageSeq();
	public int countImage(ImageDTO img);
	public void updateImage(ImageDTO img);
	public void deleteImage(ImageDTO img);

}
