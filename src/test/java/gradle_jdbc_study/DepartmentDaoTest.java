package gradle_jdbc_study;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import gradle_jdbc_study.dao.DepartmentDao;
import gradle_jdbc_study.dto.Department;
import gradle_jdbc_study.daoimpl.DepartmentDaoImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest {
	static final Logger log = LogManager.getLogger();
	static DepartmentDao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new DepartmentDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
	}

//	@Test
//	public void test01SelectDepartmentByAll() {
//		List<Department> lists = dao.selectDepartmentByAll();
//		for(Department d : lists) {
//			log.trace(d);
//		}
//		Assert.assertNotEquals(0, lists.size());
//	}
//	
//	@Test
//	public void test02SelectDepartmentByNo() throws SQLException {
//		Department dept = new Department(1);
//		Department selDept = dao.selectDepartmentByNo(dept);
//		Assert.assertNotNull(selDept);
//	}
//	
//	@Test
//	public void test03InsertDepartment() throws SQLException {
//		Department dept = new Department(5, "마케팅", 40);
//		int res = dao.insertDepartment(dept);
//		Assert.assertNotEquals(-1, res);
//	}
//	
//	@Test
//	public void test04UpdateDepartment() throws SQLException {
//		Department dept = new Department(5, "마케팅2", 12);
//		int res = dao.updateDepartment(dept);
//		Assert.assertNotEquals(-1, res);
//	}
//	
//	@Test
//	public void test05DeleteDepartment() throws SQLException {
//		Department dept = new Department(5);
//		int res = dao.deleteDepartment(dept);
//		Assert.assertNotEquals(-1, res);
//	}
//	
}










