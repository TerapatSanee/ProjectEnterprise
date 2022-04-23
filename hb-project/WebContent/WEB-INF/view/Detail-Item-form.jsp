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
			<h3>ProductName: ${inventory.name}</h3>

			<table>
				<tr>
					<th>Pack</th>
					<th>Type</th>
					<th>Size</th>
					<th>Amount/Pack</th>
					<th>TotalAmount</th>
					<th>Price/Pack</th>
					<th>TotalPrice</th>
				</tr>
				<tr class="word-center">
					<td>${inventory.pack}</td>
					<td>${inventory.packing.type}</td>
					<td>${inventory.packing.size}</td>
					<td>${inventory.packing.amount}</td>
					<td>${inventory.packing.amount*inventory.pack}</td>
					<td>${inventory.packing.price}</td>
					<td>${inventory.packing.price*inventory.pack}</td>
				</tr>
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