package com.ouaaz.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouaaz.spring.web.dao.Offer;
import com.ouaaz.spring.web.dao.OffersDAO;

@Service("offerservice")
public class OfferService {
	
	
	
	private OffersDAO offerdao ;
	@Autowired
	public void setOfferdao(OffersDAO offerdao) {
		this.offerdao = offerdao;
	}
		
	public  List<Offer> getCurrent() {
		return offerdao.getOffers();
	}

	public void create(Offer offer) {
		offerdao.create(offer);
		
	}

	public void throwTestException() {
		offerdao.getOffer(99999);
	}

}
