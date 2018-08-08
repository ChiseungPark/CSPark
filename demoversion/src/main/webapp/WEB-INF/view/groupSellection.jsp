<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Group Selection</title>
</head>
<body>
	
	<c>
			<h1>welcome again to I-statics</h1>
			<h2>1st step: the selection of target</h2>
	</c>
		
	<form method="post">
	<c:forEach var="q" items="${template1}" varStatus="status">
	<p>
		${status.index + 1}. ${q.question} <br/>
		<c:if test="${q.choice}">
			<c:forEach var="option" items="${q.options}">
			<label><input type="radio" 
			              name="responses[${status.index}]" value="${option}">
				${option}</label>
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