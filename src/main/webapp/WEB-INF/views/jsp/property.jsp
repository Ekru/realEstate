<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
		<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>${property.getName()} </h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="blog-section">
				<div class="container">
					<div class="blog-grids">
						<div class="col-md-9 blog-grid">
							<div class="blog">
								<h3>${property.getName()}</h3>
								<p> <a href="<spring:url value='/category/${property.getCategory().getId()}' /> ">${property.getCategory().getName()}</a> </p>
								<a href="<spring:url value='/property/${property.getId()}'/> "><img src="<spring:url value='/resources/images/b1.jpg'/> " class="img-responsive" alt=""/></a>
								<p>${property.getDescription()}</p>
							</div>
							
							
							
							
						</div>
						<div class="col-md-3 blog-grid1">
							<div class="categ">
							<h3>Categories</h3>
							<ul>
							<c:forEach var="category" items="${categories}">
							<li><a href="<spring:url value='/category/${category.getId()}'/>">${category.getName()}</a></li>
							</c:forEach>

							</ul>
							</div>
							
							<div class="feature">
								<h4>Featured Properties</h4>
								<c:forEach items="${featuredProperties}" var="property">
							<div class="feature-top">
							<img src="<spring:url value='/resources/images/s6.jpg' />" class="img-responsive" alt="/">
									<h5>${property.getName()}</h5>
									<p>${property.getDescription() } <a href="<spring:url value='/property/${property.getId()}' />">Know More</a></p>
							</div>
							
							</c:forEach>
								
								
								
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
		