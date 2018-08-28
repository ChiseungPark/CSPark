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
	<!--  
	<c:forEach var="each" items="${test}" varStatus="status">
		${status.index + 1}. ${each.selectedCountry}  ${each.selectedSubCategory}<br/>
	</c:forEach>
	<c:forEach var="each" items="${test2}" varStatus="status">
		${each} </br>
	</c:forEach>
	-->	
	
	<!-- ArrayList 안에 ArrayList가 있을 경우 var와 item이름을 맞춰주어야 한다  -->
	<p>
	</p>
	<table border=1>
	<c:forEach var="each" items="${selectedList1}" varStatus="status">
			<tr>
			<th>${each.countryName}
			${each.countryAction}</th>
				<c:forEach var="subnumbers" items="${each.countryNumbers}" varStatus="status">
				<td>${subnumbers}</td>
				</c:forEach>
			</tr>
	</c:forEach>
	</table>
	</div>
		<input type="submit" name="nextpath" value="Basic Summaries for each">
		<input type="submit" name="nextpath" value="1st orger regression">
		<input type="submit" name="nextpath" value="2nd orger regression">
		<input type="submit" name="nextpath" value="3rd orger regression">
		<input type="submit" name="nextpath" value="4th orger regression">
		<input type="submit" name="nextpath" value="5th orger regression">
		<input type="submit" name="nextpath" value="factor analysis of all">
	</form>

</body>
</html>