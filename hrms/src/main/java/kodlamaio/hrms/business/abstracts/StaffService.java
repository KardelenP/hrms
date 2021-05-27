package kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Staff;

public interface StaffService {
	Result add(Staff staff);
	DataResult<List<Staff>> getAll();

}
