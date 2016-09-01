<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
		<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Search Results</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="properties-section">
				<div class="container">
				<div class="properties-grids">
					<div class="col-md-9 forsales-left">
						<div class="forsale">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								
								<div id="myTabContent" class="tab-content">
									<c:forEach items="${properties}" var="property">
						
									<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
										<div class="forsale-grids">
											<h4><a href="<spring:url value='/property/${property.getId()}' /> ">${property.getName()}</a></h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="<spring:url value='/property/${property.getId()}' /> "><img src="<spring:url value='/resources/images/p6.jpg'/> " class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5> <span>${property.getName()}</span></h5>
													<p>${property.getDescription()}……</p>
													<a href="<spring:url value='/property/${property.getId()}' />"class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
												<li><span> ${property.getId()} </span>Property Id </li>
													<li><span> ${property.getPrice()} </span>Price</li>
													<li><span> ${property.getArea()} </span>Area</li>
													
													<li><span> <a href="<spring:url value='/leaseForm/${property.getId()}'/>">Apply</a> </span>Write Lease</li>
													<li><span> <a href="<spring:url value='/property/save/${property.getId()}'/>">Save</a> </span>Property</li>
												</ul>
											</div>
										</div>		
										</div>
									</c:forEach>
							
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 properties-right">
						<div class="properties-top">
						
							
							
							
							
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
		