package com.hust.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hust.ssm.po.Items;
import com.hust.ssm.po.ItemsCustom;
import com.hust.ssm.po.ItemsQueryVo;
import com.hust.ssm.service.ItemsService;

/**
 * @author yexx
 * @version 1.0
 */
@Controller
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;

	@RequestMapping("queryItems")
	public ModelAndView queryItems() throws Exception {
		
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		
		modelAndView.setViewName("itemsList");

		return modelAndView;
	}
	
	@RequestMapping("editItems")
	public ModelAndView editItems(Items items) throws Exception {
		
		System.out.println(items);
		Items selItems = itemsService.selectByPrimaryKey(items.getId());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("editItem");
		modelAndView.addObject("item", selItems);
		return modelAndView;
	}
	
	@RequestMapping("editItemSubmit")
	public ModelAndView editItemSubmit(Items items) throws Exception {
		
		System.out.println(items);

		itemsService.updateByPrimaryKeySelective(items);
		
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		
		modelAndView.setViewName("itemsList");

		return modelAndView;
	}
	
}
