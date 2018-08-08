<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Group Selection</title>

<script>
	$(document).ready(function () {
    $('#radioButton').click(function () {
      // getter
      var radioVal = $('input[name="group"]:checked').val();
      alert(radioVal);
    });
  });
</script>
</head>
<body>
	
	<center>
			<h1>Category selection</h1>
			<h2>1st step: which of the following would you want to do with?</h2>
	</center>
		
	<form action="groupSellection" method="post">
		 
		 <table style="margin-left:auto;margin-right:auto;text-align:center;">
				<tr>
					<td>Country</td>
					<td><input type="radio" name="group" value="country" checked/></td>
				</tr>
				<tr>
					<td>Company</td>
					<td><input type="radio" name="group" value="company"/></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="GO TO NEXT STEP"/>
			</center>
	</form>
	
</body>
</html>