package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.TbItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {
	@Autowired
	private TbItemService tbItemService;

	@RequestMapping("/item/{id}")
	@ResponseBody
	public TbItem findByID(@PathVariable Long id) {
		TbItem item = tbItemService.findByID(id);
		return item;
	}

}
