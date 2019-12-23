package com.yagya.employeeapi.api;

import com.yagya.employeeapi.model.Employee;
import com.yagya.employeeapi.model.EmployeeCUD;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeAPI {
    @GET("employees")
    Call<List<Employee>> getAllEmployees();

    @POST("create")
    Call<Void> registerEmployee(@Body EmployeeCUD emp);

    @GET("employee/{empID}")
    Call<Employee> getEmployeeByID(@Path("empID") int empID);
}
