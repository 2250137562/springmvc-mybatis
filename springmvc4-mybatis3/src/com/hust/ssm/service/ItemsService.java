package com.hust.ssm.service;

import java.util.List;

import com.hust.ssm.po.Items;
import com.hust.ssm.po.ItemsCustom;
import com.hust.ssm.po.ItemsQueryVo;

/**
 * 商品的服务接口
 * @author yexx
 */
public interface ItemsService {
	
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	public Items selectByPrimaryKey(Integer id) throws Exception;
	
	public void updateByPrimaryKeySelective(Items items) throws Exception;
}
