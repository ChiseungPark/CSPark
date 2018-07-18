<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>I-statics</title>

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
		<c>
			<h1>welcome to I-statics</h1>
			<h2>Login Test</h2>
		</c>
		
		<form action="login" method="post">
			<table style="margin-left:auto;margin-right:auto;text-align:center;">
				<tr>
					<td>Email</td>
					<td><input name="email" value=""/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" value="" /></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="Submit"/>
			</center>
		</form>
		
    </body>   

</html>