package com.ltts.RESTfulWebServices.Service;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import com.ltts.RESTfulWebServices.Dao.UserDao;
import com.ltts.RESTfulWebServices.Model.User;  
@Path("/UserService") 
// Specify a path for the web service using @Path annotation to the UserService

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
   //specify a path for the particular web service method using @Path annotation
   //to method of UserService.
   @Produces(MediaType.APPLICATION_XML) 
   public List<User> getUsers(){ 
      return userDao.getAllUsers(); 
   }  
}