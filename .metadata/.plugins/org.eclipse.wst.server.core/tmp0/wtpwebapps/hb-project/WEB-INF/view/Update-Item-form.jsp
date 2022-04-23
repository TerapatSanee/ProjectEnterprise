<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
	<title>Save Item</title>

	<!-- reference our style sheet -->

 
	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css" />

	<link type="text/css" rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-inventory-style.css" />
		
	<!-- <link href="css/bootstrap.css" rel="stylesheet"> -->

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Inventory Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Item</h3>
				
		<form:form action="saveItem" modelAttribute="inventory" method="POST">
	
			<!--  need to associate this data with inventory id -->
				<form:hidden path="id" />
			
			<table>
				<tbody>
					
					<tr>
						<td><lable>Name:</lable></td>
						<td><form:input path="name" required="required"/></td>
					</tr>

					<tr >
						<td><lable>Pack</lable></td>
						<td><form:input path="pack" required="required"/>
						</td>				
					</tr>

					<tr>
						<td><lable>Type:</lable></td>
						<td>
							<select name="thepack" "cssStyle="width: 150px;">  
								<option value="${inventory.packing.id}">Default Type</option>
								<option value="1">Can 250 ml.</option>
								<option value="2">Bottle 360 ml.</option>
								<option value="3">Bottle 515 ml.</option>
								<option value="4">Bottle 1000 ml.</option>
								<option value="5">Bottle 1600 ml.</option>
							</select>
						</td>
					</tr>
					
					<!--  <tr>
						<td><lable>Type:</lable></td>
						<td>
							<select name="thepack" cssStyle="width: 150px;">    
								<option value="-1">Select Type</option>
								<option value="1">Can 250 ml.</option>
								<option value="2">Bottle 360 ml.</option>
								<option value="3">Bottle 515 ml.</option>
								<option value="4">Bottle 1000 ml.</option>
								<option value="5">Bottle 1600 ml.</option>
							</select>
						</td>
					</tr>
					-->

					<tr>
						<td><lable></lable></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/inventory/list">Back to Home</a>
		</p>
			
	</div>
</body>

</html>