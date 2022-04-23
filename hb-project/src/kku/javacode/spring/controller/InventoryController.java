package kku.javacode.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kku.javacode.spring.entity.Inventory;
import kku.javacode.spring.entity.Order;
import kku.javacode.spring.entity.Order_item;
import kku.javacode.spring.entity.Packing;
import kku.javacode.spring.service.InventoryService;
import kku.javacode.spring.service.OrderItemService;
import kku.javacode.spring.service.OrderService;
import kku.javacode.spring.service.PackingService;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

	// need to inject our inventory service
	@Autowired
	private InventoryService inventoryService;
	@Autowired
	private PackingService packingService;
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private OrderService orderService;

	@GetMapping("/list")
	public String listInventory(Model theModel) {

		// get inventory from the service
		List<Inventory> theInventory = inventoryService.getInventory();

		// add the inventory to the model
		theModel.addAttribute("inventory", theInventory);

		return "list-inventory";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Inventory theInventory = new Inventory();
		
		theModel.addAttribute("inventory", theInventory);
		
		return "Add-Item-form";
	}
	
	@GetMapping("/showFormForCustomer")
	public String showFormForCustomer(Model theModel) {

		Order_item theOrder_item = new Order_item();
		//Order theOrder = new Order();
		List<Inventory> theInventory = inventoryService.getInventory();

		theModel.addAttribute("inventory", theInventory);
		theModel.addAttribute("order_item", theOrder_item);
		//theModel.addAttribute("order", theOrder);

		return "list-Customer-Order";
	}
	
	@PostMapping("/saveItem")
	public String saveItem(@ModelAttribute ("inventory") Inventory theinventory,@RequestParam ("thepack") int thePack) {
		
		Packing thepacking = packingService.getPacking(thePack);	
		theinventory.setPacking(thepacking);
		
		// save the inventory using our service
		inventoryService.saveInventory(theinventory);
		
		return "redirect:/inventory/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("inventoryId") int theId, Model theModel) {

		// get the customer from the database
		Inventory theInventory = inventoryService.getInventory(theId);

		// set inventory as a model attribute to pre-populate the form
		theModel.addAttribute("inventory", theInventory);

		// send over to our form
		return "Update-Item-form";

	}

	@GetMapping("/detele")
	public String deteleItem(@RequestParam("inventoryId") int theId) {

		// delete the item
		inventoryService.deleteItem(theId);

		return "redirect:/inventory/list";
	}

	@GetMapping("/searchInventory")
	public String searchInventory(@RequestParam("theSearchName") String theSearchName, Model theModel) {

		// search Items from the service
		List<Inventory> theInventory = inventoryService.searchItems(theSearchName);

		// add the Inventory to the model
		theModel.addAttribute("inventory", theInventory);

		return "list-inventory";
	}
	
	@GetMapping("/searchOrder")
	public String searchOrder(@RequestParam("theSearchName") String theSearchName, Model theModel) {

		// search Items from the service
		List<Inventory> theInventory = inventoryService.searchItems(theSearchName);

		// add the Inventory to the model
		theModel.addAttribute("inventory", theInventory);

		return "list-Customer-Order";
	}
	
	@GetMapping("/takeout")
	public String tackoutItem(@RequestParam ("theId") int theId, @RequestParam ("theamount") int newPack) {

		
		
		int pack = inventoryService.getInventory(theId).getPack();
		
		inventoryService.tackoutItem(theId,pack,newPack);

		return "redirect:/inventory/list";
	}
	
	@GetMapping("/detail")
	public String detailItem(@RequestParam("inventoryId") int theId, Model theModel) {

		// get the customer from the database
		Inventory theInventory = inventoryService.getInventory(theId);

		// set inventory as a model attribute to pre-populate the form
		theModel.addAttribute("inventory", theInventory);
				
		return "Detail-Item-form";

	}
	
	//public String SaveOrder(@ModelAttribute ("order) Order theOrder,@RequestParam ("thename") String theNmae,
	//		@RequestParam ("theamount") String theAmount)
	
	@GetMapping("/saveorder")
	public String SaveOrder(@RequestParam ("thename") String theNmae,@RequestParam ("theamount") int theAmount) {
		
		Order theOrder = new Order();
		theOrder.setDate(theOrder.getDate());	
		
		orderService.saveOrder(theOrder);
		//orderService.saveOrder(theOrder.getDate(),theName,theAmount);
		
		return "redirect:/inventory/showFormForCustomer";
	}
	
	@GetMapping("/listorder")
	public String listOrder(Model theModel) {
		
		List<Order> theOrder = orderService.getOrder();

		theModel.addAttribute("order", theOrder);
				
		return "list-Order-Item";

	}

}
