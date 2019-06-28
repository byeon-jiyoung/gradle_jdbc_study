package gradle_jdbc_study.dao;

import java.sql.SQLException;
import java.util.List;

import gradle_jdbc_study.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectEmployeeByAll() throws SQLException;
	Employee selectEmployeeByNo(Employee employee) throws SQLException;
	int insertEmployee(Employee employee) throws SQLException ;
	int deleteEmployee(Employee employee) throws SQLException;
	int updateEmployee(Employee employee) throws SQLException;
	
	//소속부서별사원
	List<Employee> selectEmployeeByDno(int dno) throws SQLException;
}

//ctrl + shift + o 자동 imployee
//ctrl + shitf + f 자동정렬