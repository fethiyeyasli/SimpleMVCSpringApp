<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Kitaplar</title>
<style type="text/css">
body {
	background-c: url('https://crunchify.com/bg.png');
}
</style>
<%@ include file="header.jsp"%>
</head>
<body>
	<br>
	<div style="text-align: left">
		<h3>Ürünler</h3>
	</div>
	<c:if test="${not empty items}">

		<ul>
			<c:forEach var="listValue" items="${items}">
				<ul>
					<img src="${listValue.mediumImage}" alt="">
					<br><br>
					<li>${listValue.name}</li>
					<li>Fiyat : ${listValue.salePrice}</li>
					<li>Kategori : ${listValue.categoryPath}</li>
					<li>Açıklama : ${listValue.longDescription}</li>
					
					

				</ul>


				<br>
				<br>

			</c:forEach>

		</ul>

	</c:if>
	<%@ include file="footer.jsp"%>
</body>
</html>