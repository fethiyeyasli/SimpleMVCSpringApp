package com.bookshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookshopping.model.ItemListModel;
import com.bookshopping.service.WalmartApiService;

 
@Controller
public class LandingPageController {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		ModelAndView mav = new ModelAndView();

		return mav;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {

		ModelAndView mav = new ModelAndView();

		WalmartApiService was = new WalmartApiService();
		ItemListModel itemModel = was.callWalmartApi();
		
		mav.addObject("items",itemModel.getItems());
		return mav;
	}
}