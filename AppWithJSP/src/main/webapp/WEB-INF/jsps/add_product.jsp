<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList, com.app.model.Product, com.app.model.Category" %>		
<html>
    <head>
        <title>Add Product</title>
    </head>
    <body>
    <%@include file="header.jsp" %>
    <% Product newProduct = request.getAttribute("newProduct"); %>
    <legend><strong><big>Product List</big></strong></legend>
        <c:if test="${addProductSuccess}">
            <div>Successfully added Product with Id: ${savedProduct.getProductId}</div>
        </c:if>
    
        <c:url var="add_product_url" value="/add_product"/>
        <form:form action="${add_product_url}" method="post" modelAttribute="product">
            <form:label path="productName">Product Name: </form:label> <form:input type="text" path="productName"/>
            <form:label path="mrp">MRP: </form:label> <form:input path="mrp"/>
            <form:label path="mfgDate">Date of Manufature: </form:label> <form:input path="mfgDate"/>
            <input type="submit" value="submit"/>
        </form:form>
    </body>
</html>