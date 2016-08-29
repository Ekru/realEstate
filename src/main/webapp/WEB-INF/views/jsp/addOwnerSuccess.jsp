<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h2>Submitted Employee Information</h2>
    <table>
        <tr>
            <td>First Name :</td>
            <td>${owner.firstName}</td>
        </tr>
        <tr>
            <td>Last Name :</td>
            <td>${owner.lastName}</td>
        </tr>
        <tr>
            <td>Telephone Number :</td>
            <td>${owner.telNumber}</td>
        </tr>
         <tr>
            <td>Street :</td>
            <td>${owner.address.street}</td>
        </tr>
        <tr>
            <td>City :</td>
            <td>${owner.address.city}</td>
        </tr>
        <tr>
            <td>State :</td>
            <td>${owner.address.state}</td>
        </tr>
        <tr>
            <td>zip :</td>
            <td>${owner.address.zip}</td>
        </tr>        
    </table>
