package com.maven;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
  private int id;
	@Column(length=50,name="STREET")
  private String street;
  private String city;
  @Column(name="is_open")
  private boolean Is_open;
  
  public byte[] getImage() 
  {
	return image;
  }
public void setImage(byte[] image)
{
	this.image = image;
}
@Transient
  private double x;
  private byte[] image;
  private Date addedDate;
  
  
public boolean isIs_open()
{
	return Is_open;
}
public void setIs_open(boolean is_open) 
{
	Is_open = is_open;
}
public double getX() {
	return x;
}
public void setX(double x)
{
	this.x = x;
}
public Date getAddedDate() 
{
	return addedDate;
}
public void setAddedDate(Date addedDate) 
{
	this.addedDate = addedDate;
}
public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getStreet()
{
	return street;
}
public void setStreet(String street)
{
	this.street = street;
}
public String getCity() 
{
	return city;
}
public void setCity(String city) 
{
	this.city = city;
}
}
