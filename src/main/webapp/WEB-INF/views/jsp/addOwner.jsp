<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form:form method="post" action="addOwner" modelAttribute="owner">

	<table>
	<tr>
		<td><form:label path="firstNname">First Name</form:label></td>
		<td><form:input text="firstNname" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastNname">Last Name</form:label></td>
		<td><form:input text="lastNname" /></td>
	</tr>
	
	<tr>
		<td><form:label path="telNumber">Telephone</form:label></td>
		<td><form:input text="telNumber" /></td>
	</tr>
	<tr>
		<td><form:label path="street">Street</form:label></td>
		<td><form:input text="address.street" /></td>
	</tr>
	<tr>
		<td><form:label path="city">City</form:label></td>
		<td><form:input text="address.city" /></td>
	</tr>
	<tr>
		<td><form:label path="state">State</form:label></td>
		<td><form:input text="address.state" /></td>
	</tr>
	<tr>
		<td><form:label path="zip">Zip</form:label></td>
		<td><form:input text="address.zip" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Add Owner"/>
		</td>
	</tr>
</table>	
	
</form:form>
