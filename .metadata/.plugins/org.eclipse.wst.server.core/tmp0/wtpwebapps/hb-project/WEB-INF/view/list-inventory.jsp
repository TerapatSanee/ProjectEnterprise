<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>List Inventory</title>

<!-- reference our style sheet -->


<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<!-- <link href="css/bootstrap.css" rel="stylesheet"> -->
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Inventory Manager</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">

			<!--  searchName html -->

			<form:form action="searchInventory" method="GET">
				Search Item: <input type="text" name="theSearchName" placeholder="Name Product"/>
				<input type="submit" value="Search" class="add-button" />
			</form:form>
					
			 <input type="button" value="Add Item" 
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button" />
			
			<input type="button" value="Customer" 
				onclick="window.location.href='showFormForCustomer'; return false;"
				class="add-button" />
				
			<table>
				<tr>
					<th>Name</th>
					<th>Pack</th>
					<th>Type</th>
					<th>Action</th>
				</tr>

				<!--  loop over and print our inventory -->
				<c:forEach var="tempInventory" items="${inventory}">

					<!--  construct an "update" link with inventory id -->
					<c:url var="updatelink" value="/inventory/showFormForUpdate">
						<c:param name="inventoryId" value="${tempInventory.id}" />
					</c:url>

					<!--  construct an "delete" link with inventory id -->
					<c:url var="detelelink" value="/inventory/detele">
						<c:param name="inventoryId" value="${tempInventory.id}" />
					</c:url>

					<!--  construct an "Take out" link with inventory id -->
					
					<c:url var="detaillink" value="/inventory/detail">
						<c:param name="inventoryId" value="${tempInventory.id}" />
					</c:url>

					<tr>
						<td>${tempInventory.name}</td>
						<td>${tempInventory.pack}</td>
						<td>${tempInventory.packing.type}</td>

						<td>
							<a href="${detaillink}"> <input
								type="button" value="Detail" class="add-button">
							</a> 
							<!--  display the update link --> 
							<a href="${updatelink}"> <input
								type="button" value="Update" class="add-button">
							</a> 
							<!--  display the delete link --> 
							<a href="${detelelink}"
								onclick="if (!(confirm('Are you sure you want to delete this ${tempInventory.name}?'))) return false">
								<input type="button" value="Delete" class="add-button">
							</a> 
							
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>