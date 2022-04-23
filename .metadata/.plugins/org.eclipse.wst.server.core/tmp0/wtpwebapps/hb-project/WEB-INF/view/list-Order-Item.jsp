<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Detail Item</title>

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
		<div id="content">
			<h3>List Item</h3>
				<table>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Amount/Pack</th>
					</tr>
					
					<c:forEach var="tempOrder" items="${order}">
					
					<tr class="word-center">
						<td>${tempOrder.date}</td>
						<td>${tempOrder.name}</td>
						<td>${tempOrder.amount}</td>
					</tr>
					
					</c:forEach>
					
				</table>
				<div style=""></div>

				<p>
					<a href="${pageContext.request.contextPath}/inventory/list">Back
						to Home</a>
				</p>
		</div>
	</div>
</body>

</html>