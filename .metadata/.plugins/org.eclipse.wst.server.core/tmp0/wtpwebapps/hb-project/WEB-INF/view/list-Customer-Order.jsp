<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Customer Order</title>

<!-- reference our style sheet -->


<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<!-- <link href="css/bootstrap.css" rel="stylesheet"> -->
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Customer Order</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">

			<!--  searchName html -->

			<form:form action="searchOrder" method="GET">
				Search Item: <input type="text" name="theSearchName"
					placeholder="Name Product" />
				<input type="submit" value="Search" class="add-button" />
			</form:form>

			<table>
				<tr>
					<th>Name</th>
					<th>Type</th>
					<th>Size</th>
					<th>Amount/Pack</th>
					<th>Price/Pack</th>
					<th>Order/Pack</th>
				</tr>

				<!--  loop over and print our inventory -->
				<c:forEach var="tempInventory" items="${inventory}">

					<!--  construct an "Take out" link with inventory id -->

					<tr>
						<td>${tempInventory.name}</td>
						<td>${tempInventory.packing.type}</td>
						<td>${tempInventory.packing.size}</td>
						<td>${tempInventory.packing.amount}</td>
						<td>${tempInventory.packing.price}</td>

						<td><form action="takeout" method="GET">
								<input type="hidden" name="theId" value="${tempInventory.id}" />
								<!--  <input type="hidden" name="thename" value="${tempInventory.name}" /> -->

								<input type="number" value="0" name="theamount" min="0"
									max="${tempInventory.pack}" />
								<input type="submit" value="Submit" class="add-button"
									onclick="
								if(${tempInventory.pack} <= 0){
									alert('Quantity not have or equal 0')
								}else{
									if (!(confirm('Are you sure you want to take out this ${tempInventory.name}?'))) {
										return false
									}
								}" />
							</form></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<div style=""></div>

	<p>
		<a href="${pageContext.request.contextPath}/inventory/list">Back
			to Home</a>
	</p>
</body>
</html>