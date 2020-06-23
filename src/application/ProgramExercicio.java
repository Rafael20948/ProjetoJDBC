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
	}
}
