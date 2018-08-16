<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	<table>
		<c:forEach items="${selectedList}" var="each" varStatus="status">
		<tr>
			<td>${status.index + 1}. ${each[status.index].CountryActionsAndNumbers.countryName}</td>
			<td>${each[status.index].CountryActionsAndNumbers.countryAction}</td>
		</tr>
		</c:forEach>
	</table>
	</div>
	</form>

</body>
</html>