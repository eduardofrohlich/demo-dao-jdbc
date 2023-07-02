package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String email;
	private Date birthdate;
	private Double baseSalary;
	
	private Department department; 
	
	
	public Seller() {
		
	}


	public Seller(Integer id, String nome, String email, Date birthdate, Double baseSalary, Department department) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.birthdate = birthdate;
		this.baseSalary = baseSalary;
		this.department = department;
	}


	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public Date getBirthdate() {
		return birthdate;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Seller [id=" + id + ", nome=" + nome + ", email=" + email + ", birthdate=" + birthdate + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}
	
	
	
	
	
}
