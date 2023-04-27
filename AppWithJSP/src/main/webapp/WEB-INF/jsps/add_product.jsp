<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList, com.app.model.Product, com.app.model.Category" %>		
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<HEAD><TITLE>Add Product Page</TITLE></HEAD>
	<body>
		<%@include file="header.jsp" %>
		<br>
		<form action='/add_product' method='post'>
		 <table class='table table-hover table-responsive table-bordered'>
 
        <tr>
            <td><b>Product Name</b></td> 
            <td><input type='text' name='productName' class='form-control'  required/></td>
        </tr>
 
        <tr>
            <td><b>MRP</b></td>
            <td><input type='number' name='mrp' class='form-control' required /></td>
        </tr>
 
        <tr>
            <td><b>Date of MFG</b></td>
            <td><input type='text' name='mfgDate' class='form-control' size="20" required/></td>
            
        </tr>
         <tr>
            <td><b>Category Name</b></td>
            <td><input type='text' name='catName' class='form-control' size="20" required/></td>
            
        </tr>
 
 
        <tr>
            <td></td>
            <td>
                <button type="submit" class="btn btn-primary">Add</button>
            </td>
        </tr>
 
    	</table>
    	<b><c:out value="${danger}"></c:out></b>
			
		</form>
	</body>


</html>