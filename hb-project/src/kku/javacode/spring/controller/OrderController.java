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

import kku.javacode.spring.entity.Order_item;
import kku.javacode.spring.entity.Order;
import kku.javacode.spring.service.OrderItemService;

@Controller
@RequestMapping("/order_item")
public class OrderController {

	@Autowired
	private OrderItemService OrderItemService;

	@GetMapping("/list")
	public String listOrder_item(Model theModel) {

		List<Order_item> theOrder_item = OrderItemService.getOrderItem();

		// add the inventory to the model
		theModel.addAttribute("order_item", theOrder_item);

		return "list-Order";
	}
	
	@PostMapping("/saveItem")
	public String saveItem(@ModelAttribute ("order_item") Order_item theorderitem) {

		OrderItemService.saveOrderItem(theorderitem);
		
		return "redirect:/order_item/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("order_itemId") int theId, Model theModel) {

		Order_item theOrder_item = OrderItemService.getOrderItem(theId);

		theModel.addAttribute("order_item", theOrder_item);

		// send over to our form
		return "Update-Order-form";

	}

	@GetMapping("/detele")
	public String deteleItem(@RequestParam("order_itemId") int theId) {

		// delete the item
		OrderItemService.deleteOrderItem(theId);

		return "redirect:/order_item/list";
	}
	
	/*@GetMapping("/takeout")
	public String tackoutItem(@RequestParam ("theId") int theId, @RequestParam ("thequantity") int newPack) {

		int pack = inventoryService.getInventory(theId).getPack();
		
		// tackout the item
		inventoryService.tackoutItem(theId,pack,newPack);

		return "redirect:/inventory/list";
	}*/
	
}
