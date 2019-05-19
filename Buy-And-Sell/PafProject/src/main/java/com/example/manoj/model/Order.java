package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "OderDetails")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt","updateAt"},allowGetters = true)

public class Order implements Serializable{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long orderId;
		
		
		@NotBlank
		private float totalPrice;
		
		@NotBlank
		private int customerId;
		
		@Column(nullable = false)
		@Temporal(TemporalType.TIMESTAMP)
		@CreatedDate
		private Date createAt;
		
		@Column(nullable = false)
		@Temporal(TemporalType.TIMESTAMP)
		@LastModifiedDate
		private Date updateAt;

		public long getOrderId() {
			return orderId;
		}

		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}

		public Date getCreateAt() {
			return createAt;
		}

		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}

		public Date getUpdateAt() {
			return updateAt;
		}

		public void setUpdateAt(Date updateAt) {
			this.updateAt = updateAt;
		}

		public float getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(float totalPrice) {
			this.totalPrice = totalPrice;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		
		
		

}
