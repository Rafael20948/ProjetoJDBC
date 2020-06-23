package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramExercicio {

	public static void main(String[] args) {

		System.out.println("===Teste 1: Implementing findById ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n===Teste 2: Implementing findByAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department l : list) {
			System.out.println(l);
		}
		
		System.out.println("\n===Teste 3: Implementing findByDelete ===");
		departmentDao.deleteById(5);
		System.out.println("Delete completed");
		
		System.out.println("\n===Teste 4: Implementing findByUpdate ===");
		department = departmentDao.findById(1);
		department.setName("computers");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n===Teste 5: Implementing findByInsert ===");
		Department newDepartment = new Department(null, "RAFAEL");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted!");
		
		
	}
}
