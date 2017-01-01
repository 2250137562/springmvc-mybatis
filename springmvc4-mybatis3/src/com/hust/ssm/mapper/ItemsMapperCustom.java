package com.hust.ssm.mapper;

import java.util.List;

import com.hust.ssm.po.ItemsCustom;
import com.hust.ssm.po.ItemsQueryVo;

/**
 * @author yexx
 * @version 1.0
 */
public interface ItemsMapperCustom {
	
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception;

}
