<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>About Country</title>
</head>
<body>
	<center>
		<h1> Country Group Detailst</h1>
		<h2>2nd step: Select what details you want to use for analysis</h2>
	</center>
	
	
	<form action="countrysearch" method="post">
	<div>
	<c:forEach var="q" items="${template1}" varStatus="status">
	<p>
		${status.index + 1}. ${q.question} <br/>
		<c:if test="${q.choice}">
			<c:forEach var="option" items="${q.options}">
			<label><input type="radio" 
			              name="countryResult" value="${option}">
				${option}</br></label>
			</c:forEach>
		</c:if>
		<c:if test="${!q.choice }">
		<input type="text" name="countryResult">
		</c:if>
	</p>
	</c:forEach>
	</div>
	
	<div>
	<c:forEach var="q" items="${template2}" varStatus="status">
	<p>
		${status.index + 2}. ${q.question} <br/>
		<c:if test="${q.choice}">
			<c:forEach var="option" items="${q.options}">
			<label><input type="radio" name="subResult" value="${option}">			  
			         	<!--name="responses[${status.index}]" value="${option}">-->		         	
				${option}<br/></label>
			</c:forEach>
		</c:if>
		<c:if test="${!q.choice }">
		<input type="text" name="subResult">
		</c:if>
	</p>
	</c:forEach>
	</div>
	
	<input type="submit" value="Add To List">
	</form>
	
	<form action="main" method="post">
	<div>
	<c:forEach var="q" items="${template3}" varStatus="status">
	<p>
		<c:forEach var="option" items="${q.selectedCountry} with ${q.selectedSubCategory}">
		<label><input type="radio" 
		              name="totalcountryResult" value="${q.selectedCountry}${q.selectedSubCategory}">
			${q.selectedCountry} with ${q.selectedSubCategory} </br></label>
		</c:forEach>
	</p>
	</c:forEach>
	</div>
	</form>
	
</body>
</html>