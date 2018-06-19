<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Durian</title>
</head>
<body>
<h2>Hello Durian</h2>
<form method="post" action="duriangrove/h2g2j" name="h2g2form">
<table cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td>Who</td>
<td><input readonly="readonly" name="who" value="Annie Walker"></td>
</tr>
<tr>
<td colspan="2">Where</td>
</tr>

<tr>
<td>Street</td>
<td><input name="street" value="123 Main St"></td>
</tr>

<tr>
<td>Zip</td>
<td><select name="zip" value="12345">
${zippers}
</select></td>
</tr>

<tr>
<td><input value="Post it" name="postit" type="submit"></td>
<td> <br>
</td>
</tr>
</tbody>
</table>
</form></body>
</html>