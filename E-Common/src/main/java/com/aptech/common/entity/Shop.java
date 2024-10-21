package com.aptech.common.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.aptech.common.entity.Customer;
import com.aptech.common.entity.IdBasedEntity;
import com.aptech.common.entity.product.ProductImage;

@Entity
@Table(name = "shops")
public class Shop extends IdBasedEntity {
	@Column(unique = true, length = 255, nullable = false)
	private String name;

	@Column(length = 255, nullable = false)
	private String alias;
	
	@Column(nullable = false)
	private String image;

	@Column(name = "created_time")
	private Date createdTime;

	@Column(name = "delivery_address", nullable = false, length = 64)
	private String deliveryAddress;

	private boolean enabled;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
//	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
//	private Set<ShopImage> images = new HashSet<>();

	public Shop() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
		
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

//	public Set<ShopImage> getImages() {
//		return images;
//	}
//
//	public void setImages(Set<ShopImage> images) {
//		this.images = images;
//	}
//	
//	public boolean containsImageName(String imageName) {
//		Iterator<ShopImage> iterator = images.iterator();
//		
//		while (iterator.hasNext()) {
//			ShopImage image = iterator.next();
//			if (image.getName().equals(imageName)) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
	
	
	
	@Transient public String getImagePath() {
		if(this.id == null || this.image == null)
			return "/images/image-thumbnail.png"; 
			return "/shop-images/" + this.id + "/" + this.image;
			
	}
	 
	

	
	
	

}
