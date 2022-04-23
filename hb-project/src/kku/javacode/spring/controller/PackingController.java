package kku.javacode.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kku.javacode.spring.entity.Packing;
import kku.javacode.spring.service.InventoryService;
import kku.javacode.spring.service.PackingService;


@Controller
@RequestMapping("/packing")
public class PackingController {

	// need to inject our inventory service
	@Autowired
	private InventoryService inventoryService;
	@Autowired
	private PackingService packingService;

	@GetMapping("/list")
	public String listInventory(Model theModel) {

		// get inventory from the service
		List<Packing> thePacking = packingService.getPacking();

		// add the inventory to the model
		theModel.addAttribute("packing", thePacking);

		return "list-inventory";
	}

}
