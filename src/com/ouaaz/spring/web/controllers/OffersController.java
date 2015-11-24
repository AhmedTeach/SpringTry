package com.ouaaz.spring.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ouaaz.spring.web.dao.Offer;
import com.ouaaz.spring.web.service.OfferService;

@Controller
public class OffersController {

	private OfferService offerService;

	@Autowired
	public void setOfferService(OfferService offerService) {
		this.offerService = offerService;
	}

	@RequestMapping("/offer")
	public String showOffers(Model model) {
		
		//offerService.throwTestException();
		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers", offers);
		return "offer";
	}
	/*
	@ExceptionHandler(DataAccessException.class)
	public String handleDBException(DataAccessException ex){
		
		return "error";
	}*/

	@RequestMapping("/createoffers")
	public String createOffer(Model model) {
		
		
		model.addAttribute("offer",new Offer());
		return "createoffers";
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {

		if (result.hasErrors()) {
			return "createoffers";
		}
		
		offerService.create(offer);
		return "offercreated";
	
	}
}
