package com.hust.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hust.ssm.mapper.ItemsMapper;
import com.hust.ssm.mapper.ItemsMapperCustom;
import com.hust.ssm.po.Items;
import com.hust.ssm.po.ItemsCustom;
import com.hust.ssm.po.ItemsQueryVo;
import com.hust.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{
	
	//ע��mapper
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	@Autowired
	private ItemsMapper itemsMapper;

	//��Ʒ�Ĳ�ѯ�б�
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public Items selectByPrimaryKey(Integer id) throws Exception {
		
		return itemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKeySelective(Items items) throws Exception {
		itemsMapper.updateByPrimaryKeySelective(items);
	}

}
