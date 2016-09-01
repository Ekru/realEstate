<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>My profile</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="contact-section">
				<div class="container">
					
					<div class="contact-grids">
						<div class="col-md-8 contact-grid">
							<h5>See you previous leases</h5>
							<c:forEach var="lease" items="${leases}">
							
							<p><a href="<spring:url value='/lease/${lease.getLeaseId()}'/>">Lease Id ${lease.getLeaseId()} for the property : ${lease.getProperty().getName()}</a></p>
							</c:forEach>
						<h5>See you Saved Properties</h5>
							<c:forEach var="sProperty" items="${savedProperties}">
							
							<p><a href="<spring:url value='/property/${sProperty.getProperty().getId()}'/>"> ${sProperty.getProperty().getName()}</a></p>
							</c:forEach>
				
						</div>
						<div class="col-md-4 contact-grid1">
							<h4>Listing Agent</h4>
							<div class="contact-top">
								<div class="agent-img">
									<img src="<spring:url value='/resources/images/t1.png' /> " class="img-responsive" alt="">
								</div>
								<div class="agent-info">
									<h5>${client.getFirstName()} ${client.getLastName()}</h5>
									<h6>Real Space Group</h6>
								</div>
								<div class="clearfix"></div>
							</div> 
		
							<ul>
									
									<li><i class="glyphicon glyphicon-phone" aria-hidden="true"></i> Mobile : ${client.getPhone()}</li>
									<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i> <a href="#"><a href="mailto:${client.getEmail()}">${client.getEmail()}</a></a></li>
								
								</ul>

						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
		