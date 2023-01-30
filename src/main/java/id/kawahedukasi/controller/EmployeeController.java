package id.kawahedukasi.controller;

import id.kawahedukasi.model.Employee;

import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;

@Path("/employee")
public class EmployeeController {
    @POST
    @Transactional
    public Response create(JsonObject request){
        Employee employee = new Employee();
        employee.name = request.getString("name");
        employee.manager_id = request.getInt("manager_id");
        employee.persist();
        return Response.ok().entity(new HashMap<>()).build();
    }

    @GET
    public Response list(){
        List<Employee> listEmployee = Employee.listAll();
        return Response.ok().entity(listEmployee).build();
    }

}
