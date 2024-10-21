package com.aptech.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "banners")
public class Banner extends IdBasedEntity {

	@Column(nullable = false, length = 45, unique = true)
	private String name;

	@Column(nullable = false, length = 128)
	private String image;

	@Column(nullable = false, length = 256)
	private String title;

	@Transient
	public String getImagePath() {
		if (this.id == null)
			return "/images/image-thumbnail.png";

		return "/banner-images/" + this.id + "/" + this.image;
	}

	public Banner() {
		super();
	}

	public Banner(String name, String image, String title) {
		super();
		this.name = name;
		this.image = image;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Banner(Integer id) {
		this.id = id;
	}
}
