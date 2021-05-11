<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
	background-color: #666;
	padding: 30px;
	text-align: center;
	font-size: 35px;
	color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
	float: left;
	width: 30%;
	height: 300px; /* only for demonstration, should be removed */
	background: #ccc;
	padding: 20px;
}

/* Style the list inside the menu */
nav ul {
	list-style-type: none;
	padding: 0;
}

article {
	float: left;
	padding: 20px;
	width: 70%;
	background-color: #f1f1f1;
	height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section::after {
	content: "";
	display: table;
	clear: both;
}

/* Style the footer */
footer {
	background-color: #777;
	padding: 10px;
	text-align: center;
	color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media ( max-width : 600px) {
	nav, article {
		width: 100%;
		height: auto;
	}
}
.card img {
    max-width: 100%;
    border-radius: 5px;
}
.card {
	margin: 10px;
    background-color: white;
    border-radius: 10px;
    padding: 1em;
    box-shadow: 0px 10px 5px #b2bec3;
    text-align: center;
    font-family: 'Poppins';
    max-width: 25%;
}
.container{
display: flex;

}
</style>
</head>
<body>

	<h2>CSS Layout Float</h2>
	<p>In this example, we have created a header, two columns/boxes and
		a footer. On smaller screens, the columns will stack on top of each
		other.</p>
	<p>Resize the browser window to see the responsive effect (you will
		learn more about this in our next chapter - HTML Responsive.)</p>

	<%@include file="/WEB-INF/views/layouts/header.jsp"%>

	<section>
	<div class="container">
		<div class="card">
			<div class="title">Headphone</div>
			<div class="image">
				<img
					src="https://cdn.glitch.com/5f8445e6-7cb3-47ef-8b81-884235184212%2Fphoto-1505740420928-5e560c06d30e.jpeg?v=1585724732029">
			</div>
			<div class="text">This is a headphone. It has noise cancelling
				properties.</div>

			<button class="buy-button">Trial_product</button>

		</div>
		<div class="card">
			<div class="title">Headphone</div>
			<div class="image">
				<img
					src="https://cdn.glitch.com/5f8445e6-7cb3-47ef-8b81-884235184212%2Fphoto-1505740420928-5e560c06d30e.jpeg?v=1585724732029">
			</div>
			<div class="text">This is a headphone. It has noise cancelling
				properties.</div>

			<button class="buy-button">Trial_product</button>

		</div>
		<div class="card">
			<div class="title">Headphone</div>
			<div class="image">
				<img
					src="https://cdn.glitch.com/5f8445e6-7cb3-47ef-8b81-884235184212%2Fphoto-1505740420928-5e560c06d30e.jpeg?v=1585724732029">
			</div>
			<div class="text">This is a headphone. It has noise cancelling
				properties.</div>

			<button class="buy-button">Trial_product</button>

		</div>
	</div>
		


	</section>

	<%@include file="/WEB-INF/views/layouts/footer.jsp"%>

</body>
</html>
