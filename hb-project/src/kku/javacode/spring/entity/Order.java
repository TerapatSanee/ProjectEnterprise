package kku.javacode.spring.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "date")
	private String date; 
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<Order_item> OrderItem;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	@JoinTable(name = "inventory_order", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "inventory_id"))
	private List<Inventory> inventory;
	
	public Order() {}
	
	public Order( String date) {
		this.date = date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		LocalDateTime date= LocalDateTime.now();   
	    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    this.date = date.format(format);  
		return this.date;
	}
	 
	public void setDate(String date) {
		this.date = date;
	}

	/*public List<Order_item> getOrderItem() {
		return OrderItem;
	}

	public void setOrderItem(List<Order_item> orderItem) {
		OrderItem = orderItem;
	}*/

	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}

	/*@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + formatDateTime + ", OrderItem=" + OrderItem
				+ ", inventory=" + inventory + "]";
	}*/
	
	
	public void addInventory(Inventory theinventory) {

		if (inventory == null) {
			inventory = new ArrayList<>();
		}
		inventory.add(theinventory);
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + "]";
	}

	/*public void add(Order_item tempOrderItem) {

		if (OrderItem != null) {
			OrderItem= new ArrayList<>();
		}

		OrderItem.add(tempOrderItem);

		tempOrderItem.setOrder(this);

	}*/
	
	
}
