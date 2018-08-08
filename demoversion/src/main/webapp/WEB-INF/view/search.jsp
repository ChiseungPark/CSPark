<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1> Country Group Test</h1>
	</center>
	
	
	<form method="post">
	<c:forEach var="q" items="${template1}" varStatus="status">
	<p>
		${status.index + 1}. ${q.question} <br/>
		<c:if test="${q.choice}">
			<c:forEach var="option" items="${q.options}">
			<label><input type="radio" 
			              name="responses[${status.index}]" value="${option}">
				${option}</br></label>
			</c:forEach>
		</c:if>
		<c:if test="${!q.choice }">
		<input type="text" name="responses[${status.index}]">
		</c:if>
	</p>
	</c:forEach>
	
	<c:forEach var="q" items="${template2}" varStatus="status">
	<p>
		${status.index + 2}. ${q.question} <br/>
		<c:if test="${q.choice}">
			<c:forEach var="option" items="${q.options}">
			<label><input type="radio" 
			              name="responses[${status.index}]" value="${option}">
				${option}<br/></label>
			</c:forEach>
		</c:if>
		<c:if test="${!q.choice }">
		<input type="text" name="responses[${status.index}]">
		</c:if>
	</p>
	</c:forEach>
	
	
	<input type="submit" value="Go to Next Step">
	</form>
</body>
</html>