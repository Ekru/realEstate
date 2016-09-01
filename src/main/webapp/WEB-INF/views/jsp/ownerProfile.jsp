<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
							</div>
							<div class="profile-left">
								<h5>My details</h5> <br/>
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
							<br/>
							<br/>
							<br/>					
						</div>
						<div>
							<button class="btn btn-primary" onclick="#">Add New Property</button>
							<button class="btn btn-primary" onclick="#">Look Up Lease Applications</button>
						</div>
						<div>
						<h1>My Properties</h1>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Category</th> <th>Name</th>	<th>Price</th> <th>Area</th> <th>Featured</th> <th>Address</th>	<th>Action</th>
								</tr>
							</thead>
				
							<c:forEach var="property" items="${propertyList}">
							    <tr>
								<td>
									${property.getCategory().getName()}
								</td>
								<td>${property.getName()}</td>
								<td>${property.getPrice()}</td>
								<td>${property.getArea()}</td>
								<td>${property.getFeatured()}</td>
								<td>${property.getAddress().getStreet()} , ${property.getAddress().getCity()}  , ${property.getAddress().getState()}  , ${property.getAddress().getZip()}</td>
								<td>
								  <spring:url value="/property/${property.getId()}" var="propertyUrl" />
								  <spring:url value="/property/${property.getId()}/delete" var="deleteUrl" />
								  <spring:url value="/property/${property.getId()}/edit" var="editUrl" />
				
								  <button class="btn btn-info" onclick="location.href='${propertyUrl}'">Show More</button>
								  <button class="btn btn-primary" onclick="location.href='${editUrl}'">Edit</button>
								  <button class="btn btn-danger"  onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
				                 </td>
							    </tr>
							</c:forEach>
						</table>
					</div>		
					<div>
						<h1>Lease Applications</h1>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Lease Number</th> <th>Client Id</th> <th>Date</th> <th>Income</th> <th>Status</th> <th>Action</th>
								</tr>
							</thead>
				
							<c:forEach var="lease" items="${leases}">
							    <tr>
								<td>
									${lease.id}
								</td>
								<td>${lease.getClient().id}</td>
								<td>${lease.getLeaseDate()}</td>
								<td>${lease.getIncome()}</td>
								<td>${lease.getLeaseStatus()}</td>								
								<td>								  
								  <spring:url value="/lease/${lease.id}" var="showUrl" />								  
								  <button class="btn btn-danger"  onclick="this.disabled=true;post('${showUrl}')">Show More</button>
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
		