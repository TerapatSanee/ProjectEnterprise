package kku.javacode.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "packing")
public class Packing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "type")
	private String type;

	@Column(name = "size")
	private String size;

	@Column(name = "amount")
	private int amount;

	@Column(name = "price")
	private double price;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "packing", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<Inventory> inventory;

	public Packing() {
	}

	public Packing(String type, String size, int amount, double price) {
		this.type = type;
		this.size = size;
		this.amount = amount;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Packing [id=" + id + ", type=" + type + ", size=" + size + ", amount=" + amount + ", price=" + price
				+ "]";
	}

	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}

	public void add(Inventory tempInventory) {

		if (inventory != null) {
			inventory = new ArrayList<>();
		}

		inventory.add(tempInventory);

		tempInventory.setPacking(this);

	}
}
