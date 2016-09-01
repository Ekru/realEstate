<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Owner Profile</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="properties-section">
				<div class="container">
				<div class="properties-grids">					
					<div class="col-md-9 agentprofile-left">
						<div class="agent-profile">
							<div class="profile-left">
							<h4><span>${owner.firstName}</span>  <span>${owner.lastName}</span></h4>
							<p>Property Owner |<a href="mailto:${owner.email}"><span>${owner.email}</span></a></p>
							<img src="images/a4.jpg" class="img-responsive" alt="/">
							</div>
							<div class="profile-right">
								<h5>My details</h5>
								<ul>									
									<li><i class="glyphicon glyphicon-phone" aria-hidden="true"></i> Mobile : <span>${owner.telNumber}</span></li>
									<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i> <a href="mailto:{owner.email}"><span>${owner.email}</span></a></li>
									<li><i class="glyphicon glyphicon-home" aria-hidden="true"></i> Address : <span>${owner.address.street},</span> <span>${owner.address.city}</span> <span>${owner.address.state}</span> <span>${owner.address.zip}</span></li>									
								</ul>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="about-me">
							<h4>About Me</h4>
							<p>As a fourth generation realtor, I was raised in a family where real estate was the primary occupation. She has a passion for the business and a steadfast dedication to her clients. As a licensed agent in both California and Arizona, I bring over five years of experience to the table and is adept at handling any transaction, regardless of property type or price point.</p>
							<p>As a fourth generation realtor, I was raised in a family where real estate was the primary occupation. She has a passion for the business and a steadfast dedication to her clients. As a licensed agent in both California and Arizona, I bring over five years of experience to the table and is adept at handling any transaction, regardless of property type or price point.</p>
							<p>In addition to real estate, Maria’s passions include running and cooking. She lives in Santa Monica, a community she knows intimately. She also does a great deal of business in the Hollywood Hills and West Hollywood.</p>
						</div>
		
						<div>
						<h1>My Properties</h1>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Category</th>
									<th>Name</th>
									<th>Price</th>
									<th>Area</th>
									<th>Featured</th>
									<th>Address</th>
									<th>Action</th>
								</tr>
							</thead>
				
							<c:forEach var="property" items="${ownerPropertylist}">
							    <tr>
								<td>
									${property.category}
								</td>
								<td>${property.getName()}</td>
								<td>${property.getPrice()}</td>
								<td>${property.getArea()}</td>
								<td>${property.getFeatured()}</td>
								<td>${property.getAddress().getStreet() cat ', ' cat property.getAddress().getCity() cat ' ' cat property.getAddress().getState() cat ' ' cat property.getAddress().getZip()}</td>
								<td>
								  <spring:url value="/property/${property.id}" var="propertyUrl" />
								  <spring:url value="/property/${property.id}/delete" var="deleteUrl" />
								  <spring:url value="/users/${property.id}/edit" var="editUrl" />
				
								  <button class="btn btn-info"
				                                          onclick="location.href='${propertyUrl}'">Show More</button>
								  <button class="btn btn-primary"
				                                          onclick="location.href='${editUrl}'">Edit</button>
								  <button class="btn btn-danger"
				                                          onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
				                 </td>
							    </tr>
							</c:forEach>
						</table>
					</div>							
					</div>
					<div class="clearfix"></div>
				</div>
				</div>
			</div>
		</div>
		