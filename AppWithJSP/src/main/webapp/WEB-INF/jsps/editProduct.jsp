<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList, com.app.model.Product, com.app.model.Category" %>		
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
	<head>
    <meta charset="ISO-8859-1">
    <title>Add Product</title>

    <link rel="stylesheet"
    	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
    <script
    	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script
    	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>

</head>
	<body>
		<%@include file="header.jsp" %>
		<br>
		<div class="container">

	        <h1 class="p-3"> Edit a Product </h1>
			<form:form action="/editSaveProduct" method="post" modelAttribute="product">
			<div class="row">
				<div class="form-group col-md-12">
					<lebel class="col-md-3" for="productId">productId</lebel>
					<div class="col-md-6">
						<form:input type="number" path="productId" id="productId"
							class="form-control input-sm" required="required"/>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<lebel class="col-md-3" for="productName">productName</lebel>
					<div class="col-md-6">
						<form:input type="text" path="productName" id="productName"
							class="form-control input-sm" required="required"/>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<lebel class="col-md-3" for="mrp">mrp</lebel>
					<div class="col-md-6">
						<form:input type="number" path="mrp" id="mrp"
							class="form-control input-sm" required="required"/>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<lebel class="col-md-3" for="mfgDate">mfgDate</lebel>
					<div class="col-md-6">
						<form:input type="text" path="mfgDate" id="mfgDate"
							class="form-control input-sm" required="required"/>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<lebel class="col-md-3" for="category.catName">catName</lebel>
					<div class="col-md-6">
						<form:input type="text" path="category.catName" id="catName"
							class="form-control input-sm" required="required"/>
					</div>
				</div>
			</div>
			
			<div class="row p-2">
	            	<div class="col-md-2">
	            		<button type="submit" value="Register" class="btn btn-success">Save</button>
	            	</div>
	        </div>
	
	        </form:form>
	    </div>
	    
	    
	       
	</body>


</html>