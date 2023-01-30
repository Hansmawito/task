package id.kawahedukasi.controller;

import id.kawahedukasi.model.Employee;
import id.kawahedukasi.model.Employee_score;

import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;

@Path("/employee_score")
public class Employee_scoreController {


        @POST
        @Transactional
        public Response create(JsonObject request){
            Employee_score employee_score = new Employee_score();
            employee_score.nama = request.getString("nama");
            employee_score.score = request.getInt("score");
            employee_score.persist();
            return Response.ok().entity(new HashMap<>()).build();
        }
        @GET
        public Response list(){
        List<Employee_score> listEmployee_score = Employee_score.listAll();
        return Response.ok().entity(listEmployee_score).build();
        }
        @PUT
        @Path("/{id}")
        @Transactional
        public Response update(@PathParam("id") Integer id, JsonObject request){
        Employee_score employee_score = new Employee_score();
        employee_score.nama = request.getString("nama");
        employee_score.score = request.getInt("score");
        employee_score.persist();
        return Response.ok().entity(new HashMap<>()).build();
         }
    }


