package pro.jpa2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * This is an exact copy of the {@link Employee} class. The only difference is
 * the user-defined Id
 *
 * @author kostja
 *
 */
@Entity
public class EmployeeCustomId {
	@Id
	private int id;
	private String name;
	private long salary;

	@ManyToOne
	// @JoinColumn(name="DEPT_ID")
	private Department department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return "EmployeeCustomId id: " + getId() + " name: " + getName()
				+ " with department: " + getDepartment();
	}
}