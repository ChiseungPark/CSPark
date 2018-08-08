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
		<h1>Main Process Test</h1>
	</center>
	
	<form action="search" method="post">
			<table style="margin-left:auto;margin-right:auto;text-align:center;">
				<tr>
					<td>DataBase Table Name</td>
					<td><input name="dbtableName" value=""/></td>
				</tr>
				<tr>
					<td>variable Name</td>
					<td><input name="var1" value="" /></td>
			</table>
			<center>
				<input type="submit" value="Submit"/>
			</center>
		</form>
</body>
</html>