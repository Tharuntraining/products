package com.training.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productId;

	@Column(name = "producttitle", nullable = false)
	private String productTitle;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "price", nullable = false)
	private float price;

	@ManyToOne
	@JoinColumn(name = "createdby", referencedColumnName = "userid")
	private Users createdBy;

	@ManyToOne
	@JoinColumn(name = "updatedby", referencedColumnName = "userid")
	private Users updatedBy;

	@Column(name = "createddate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
	private LocalDateTime createdDate;

	@Column(name = "updateddate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
	private LocalDateTime updatedDate;

	@Column(name = "isactive", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
	private Boolean isActive;

	public Products() {
		super();
	}

	public Products(int productId, String productTitle, String description, float price, Users createdBy,
			Users updatedBy, LocalDateTime createdDate, LocalDateTime updatedDate, Boolean isActive) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.description = description;
		this.price = price;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.isActive = isActive;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Users getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Users createdBy) {
		this.createdBy = createdBy;
	}

	public Users getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Users updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
