package com.prgs.etelco.TelcoECommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OffersController {

	@GetMapping("/get-offers")
	public List<String> getOffers() {
		List<String> list = new ArrayList<>();
		list.add("10% discount");

		return list;

	}

}
