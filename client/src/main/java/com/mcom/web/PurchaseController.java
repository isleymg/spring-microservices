package com.mcom.web;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mcom.StoreClient;
import com.mcom.domain.Purchase;

@Controller
public class PurchaseController {
	@Autowired
	private StoreClient svc;
	
	@GetMapping("/index.html")
	public String getIndex() {
		return "/index";
	}
	
	@GetMapping("/")
	public String getRoot() {
		return "redirect:/index.html";
	}
	
	@ModelAttribute("date")
	public Date getDate() {
		return new Date();
	}
	
	@RequestMapping("/browse")
	public ModelAndView browsePurchases() {
		Collection<Purchase> list = svc.purchases();
		return new ModelAndView("browsePurchases", "purchaseList", list);
	}
}
