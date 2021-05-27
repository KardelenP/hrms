package kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {
	Result add(Employee employee);
	DataResult<List<Employee>> getAll();

}
