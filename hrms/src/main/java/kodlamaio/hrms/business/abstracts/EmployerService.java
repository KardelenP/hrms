package kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();

}
