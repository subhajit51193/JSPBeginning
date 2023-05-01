<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList, com.app.model.Product, com.app.model.Category" %>	
<HTML>
	<HEAD><TITLE>Application with JSP My first Programme</TITLE></HEAD>
	<BODY>
		<%@include file="header.jsp" %>
		<hr/>
		<% List<Product> myList = (List<Product>)request.getAttribute("productList"); %>
		
		<fieldset>
			<legend><strong><big>Product List</big></strong></legend>
			<table width="100%" border="1" cellpadding="4" cellspacing="4">
				<tr>
					<th align="right">Product ID</th>
					<th align="left">Product Name</th>
					<th align="right">MRP</th>
					<th align="right">MFG Date</th>
					<th align="left">Category</th>
				</tr>
				
				<% for(Product pr: myList){
					
					%>
					<tr>
						<td align="right"><% out.println(pr.getProductId()); %></td>
						<td align="left"><% out.println(pr.getProductName()); %></td>
						<td align="right"><% out.println(pr.getMrp()); %></td>
						<td align="right"><% out.println(pr.getMfgDate()); %></td>
						<td align="left"><% out.println(pr.getCategory().getCatName()); %></td>
					</tr>
					<%	
				}%>
				
			</table>
		</fieldset>
		
		
		
		
		
		
	</BODY>
</HTML>