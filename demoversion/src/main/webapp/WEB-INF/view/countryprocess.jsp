<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

		<!--Main Stylesheet-->
        <link href="css/style.css" rel="stylesheet">
        <!--Responsive Framework-->
		
		<style type="text/css">
			c{
				text-align:center
			}
		</style>
		
</head>
<body>
	<center>
		<h1>Country Process Test</h1>
	</center>
	
	<form action="countryprocess" method="post">

	<div>
	<c:forEach var="each" items="${test}" varStatus="status">
		${status.index + 1}. ${each.selectedCountry}  ${each.selectedSubCategory}<br/>
	</c:forEach>
		<!--
		<c:forEach var="each" items="${selectedList1}" varStatus="status">
			<p>
				${status.index + 1}. ${each.countryName}  ${each.countryAction}<br/>
					<c:forEach var="subnumbers" items="${selectedList1.countryNumbers}" varStatus="status">
						${subnumbers} 
						값 사이에 콤마 넣음<c:if test="${not status.last }">, </c:if>
					</c:forEach>
			</p>
		</c:forEach>
		-->
			
	</div>
	</form>

</body>
</html>