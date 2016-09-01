<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
		<!---banner--->
		<div class="slider">
			<div class="callbacks_container">
				<ul class="rslides" id="slider">
					<div class="slid banner1">
						  <div class="caption">
								<h3>1400 Anastasia Avenue</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec pellentesque ex. Morbi iaculis mi in varius auctor. Nullam feugiat erat .</p>
								<a href="#" class="button">know more</a>
						  </div>
					</div>
					<div class="slid banner2">	
						  <div class="caption">
								<h3>Oakland, NJ94605</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec pellentesque ex. Morbi iaculis mi in varius auctor. Nullam feugiat erat .</p>
								<a href="#" class="button">know more</a>
						  </div>
					</div>
					<div class="slid banner3">	
						<div class="caption">
							<h3>Florida 5, Pinecrest, FL</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec nec pellentesque ex. Morbi iaculis mi in varius auctor. Nullam feugiat erat .</p>
							<a href="#" class="button">know more</a>
						</div>
					</div>
				</ul>
			</div>
		</div>
<!---banner--->
	<div class="content">
		<div class="place-section">
			<div class="container">
				<h2>find your Property</h2>
					<form:form method="POST"  modelAttribute="search">
				<div class="place-grids">
					<div class="col-md-3 place-grid">
						<h5>All categories</h5>
					<form:select path="catId" >
						<form:option value="0" label="All categories" />
						<c:forEach var="category" items="${categories}">
				    <form:option value="${category.getId()}" label="${category.getName()}" />
						</c:forEach>
						</form:select>
					</div>
					<div class="col-md-3 place-grid">
					<h5>The title </h5>
					<div class="form-group">
  <label for="name">Name:</label>
  <form:input  path="name" class="form-control"  />
</div>
					</div>
					
					
					<div class="clearfix"></div>
				</div>
				<div class="place-grids">
					
					
					<div class="col-md-2 place-grid1">
						<h5>Min Price</h5>
						<form:select path="minPrice" >
							<form:option value="0">any</form:option>
							<form:option value="500">$500</form:option>
							<form:option value="1000">$1000</form:option>
							<form:option value="2000">$2000</form:option>
							<form:option value="3000">$3000</form:option>
							<form:option value="4000">$4000</form:option>
							<form:option value="5000">$5000</form:option>
							<form:option value="75000">$75000</form:option>
							<form:option value="10000">$10000</form:option>
						</form:select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Max Price</h5>
						<form:select class="sel"  path="maxPrice">
							<form:option value="0">any</form:option>
							<form:option value="1000">$1000</form:option>
							<form:option value="2000">$2000</form:option>
							<form:option value="3000">$3000</form:option>
							<form:option value="4000">$4000</form:option>
							<form:option value="5000">$5000</form:option>
							<form:option value="75000">$75000</form:option>
							<form:option value="10000">$10000</form:option>
						</form:select>
					</div>
					<div class="col-md-4 search">
				
						<input type="submit" value="Search">
					
					</div>
					<div class="clearfix"></div>
				</div>
				</form:form>
			</div>
		</div>
			<div class="friend-agent">
				<div class="container">
					<div class="friend-grids">
						<div class="col-md-4 friend-grid">
							<img src="<spring:url value='/resources/images/p.png' /> ">
							<h4>Search From Anywhere</h4>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis egestas rhoncus. Donec facilisis fermentum sem, ac viverra ante luctus vel.</p>
						</div>
						<div class="col-md-4 friend-grid">
							<img src="<spring:url value='/resources/images/p1.png' /> ">
							<h4>Friendly Agents</h4>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis egestas rhoncus. Donec facilisis fermentum sem, ac viverra ante luctus vel.</p>
						</div>
						<div class="col-md-4 friend-grid">
							<img src="<spring:url value='/resources/images/p2.png' /> ">
							<h4>Buy or Rent</h4>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla convallis egestas rhoncus. Donec facilisis fermentum sem, ac viverra ante luctus vel.</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			
			<!---Featured Properties--->
				<div class="feature-section">
					<div class="container">
						<h3>Featured Properties</h3>
						<div class="feature-grids">
						<c:forEach items="${featuredProperties}" var="property">
							<div class="col-md-3 feature-grid">
								<img src="<spring:url value='/resources/images/f1.jpg'/>" class="img-responsive" alt="/">
								<h5>${property.getName()}</h5>
								<p>${property.getDescription()}¦ <a href="<spring:url value='/property/${property.getId()}' /> ">Know More</a></p>
								<span>$ ${property.getPrice()}</span>
							</div>
							</c:forEach>
							
							
							
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
			<!---Featured Properties--->
			<div class="membership">
				<div class="container">
					<h3>Membership Plans</h3>
					<div class="membership-grids">
						<div class="col-md-4 membership-grid">
								<h4>Personal</h4>
							<div class="membership1">
								<h5>9.99 <span>USD</span></h5>
								<h6>/ 1 month</h6>
								<ul class="member">
									<li>10 Listings</li>
									<li>2 Featured Listings</li>
								</ul>
							</div>
						</div>
						<div class="col-md-4 membership-grid">
								<h4>Professional</h4>
							<div class="membership1">
								<h5>49.99 <span>USD</span></h5>
								<h6>/ 6 month</h6>
								<ul class="member">
									<li>40 Listings</li>
									<li>10 Featured Listings</li>
								</ul>
							</div>
						</div>
						<div class="col-md-4 membership-grid">
								<h4>Bussiness</h4>
							<div class="membership1">
								<h5>99.99 <span>USD</span></h5>
								<h6>/ 1 year</h6>
								<ul class="member">
									<li>Unlimited Listings</li>
									<li>20 Featured Listings</li>
								</ul>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!---testimonials--->
					<div class="testimonials">
						<div class="container">
							<h3>testimonial</h3>
							<span></span>
							<div id="owl-demo" class="owl-carousel">
								<div class="item">
									<div class="col-md-2 testmonial-img">
										<img src="<spring:url value='/resources/images/t1.png'/>" class="img-responsive" alt=""/>
									</div>
									<div class="col-md-10 testmonial-text">
										<p>Lorem ipsum dolor sit amet, offendit volutpat sea ex, at omnium scripta pro, at omnium scripta pro, ei mea oratio malorum forensibus. ei mea oratio malorum forensibus. Sed ei omnes laoreet posidonium ei mea oratio malorum forensibus.</p>
										<h4><a href="#">Michael Feng</a></h4>
									</div>
									<div class="clearfix"> </div>
								</div>
								<div class="item">
									<div class="col-md-2 testmonial-img">
										<img src="<spring:url value='/resources/images/t2.png' /> " class="img-responsive" alt=""/>
									</div>
									<div class="col-md-10 testmonial-text">
										<p>Lorem ipsum dolor sit amet, offendit volutpat sea ex, at omnium scripta pro, at omnium scripta pro, ei mea oratio malorum forensibus. ei mea oratio malorum forensibus. Sed ei omnes laoreet posidonium ei mea oratio malorum forensibus.</p>
										<h4><a href="#">Stacy Barron</a></h4>
									</div>
									<div class="clearfix"> </div>
								</div>
								<div class="item">
									<div class="col-md-2 testmonial-img">
										<img src="<spring:url value='/resources/images/t3.png' /> " class="img-responsive" alt=""/>
									</div>
									<div class="col-md-10 testmonial-text">
										<p>Lorem ipsum dolor sit amet, offendit volutpat sea ex, at omnium scripta pro, at omnium scripta pro, ei mea oratio malorum forensibus. ei mea oratio malorum forensibus. Sed ei omnes laoreet posidonium ei mea oratio malorum forensibus.</p>
										<h4><a href="#">Johnson </a></h4>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
						</div>
					</div>
					<!---testmonials--->
	</div>				