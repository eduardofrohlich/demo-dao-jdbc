package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department insert ===");
		Department department = new Department(null, "Technology");
		departmentDao.insert(department);
		System.out.println("Inserted! New id: "+department.getId());
		
		System.out.println("\n=== TEST 3: department update ===");
		dep = departmentDao.findById(7);
		dep.setName("Vinicius Eduardo");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\\n=== TEST 4: department findAll ===");
		List<Department> listDep = departmentDao.findAll();
		for (Department obj : listDep) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 5: department deleteById ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
