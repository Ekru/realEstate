<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
        
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
					<form action="<spring:url value='/home/search' /> " method="post">
				<div class="place-grids">
					<div class="col-md-3 place-grid">
						<h5>All categories</h5>
						<select class="sel">
						<option value="">All categories</option>
						<c:forEach items="${categories}" var="category">
						<option value="${category}">${category.getName}</option>
                         </c:forEach>
						</select>
					</div>
					<div class="col-md-3 place-grid">
					<h5>The title </h5>
					<div class="form-group">
  <label for="name">Name:</label>
  <input type="text" name="name" class="form-control" id="name">
</div>
					</div>
					
					
					<div class="clearfix"></div>
				</div>
				<div class="place-grids">
					
					
					<div class="col-md-2 place-grid1">
						<h5>Min Price</h5>
						<select class="sel" name="minPrice">
							<option value="">any</option>
							<option value="">$500</option>
							<option value="">$1000</option>
							<option value="">$2000</option>
							<option value="">$3000</option>
							<option value="">$4000</option>
							<option value="">$5000</option>
							<option value="">$75000</option>
							<option value="">$10000</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Max Price</h5>
						<select class="sel"  name="maxPrice">
							<option value="">any</option>
							<option value="1000">$1000</option>
							<option value="2000">$2000</option>
							<option value="3000">$3000</option>
							<option value="4000">$4000</option>
							<option value="5000">$5000</option>
							<option value="75000">$75000</option>
							<option value="10000">$10000</option>
						</select>
					</div>
					<div class="col-md-4 search">
				
						<input type="submit" value="Search">
					
					</div>
					<div class="clearfix"></div>
				</div>
				</form>
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
			<div class="offering">
				<div class="container">
					<h3>We are Offering the Best Real Estate Deals</h3>
					<div class="offer-grids">
						<div class="col-md-6 offer-grid">
							<div class="offer-grid1">
								<h4><a href="single.html">Villa In Hialeah, Dade County</a></h4>
								<div class="offer1">
									<div class="offer-left">
										<a href="single.html" class="mask"><img src="<spring:url value='/resources/iimages/p3.jpg' /> " class="img-responsive zoom-img" alt=""/></a>
									</div>
									<div class="offer-right">
										<h5><label>$</label> 7,500 Per Month - <span>Single Family Home</span></h5>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh…</p>
										<a href="single.html"class="button1">more details</a>
									</div>
										<div class="clearfix"></div>
								</div>
							</div>
						</div>
							<div class="col-md-6 offer-grid">
								<div class="offer-grid1">
									<h4><a href="single.html">401 Biscayne Boulevard, Miami</a></h4>
									<div class="offer1">
										<div class="offer-left">
											<a href="single.html" class="mask"><img src="images/p4.jpg" class="img-responsive zoom-img" alt=""/></a>
									</div>
										<div class="offer-right">
											<h5><label>$</label> 3,250 Per Month - <span>Condominium</span></h5>
											<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh…</p>
											<a href="single.html"class="button1">more details</a>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
						<div class="clearfix"></div>
					</div>
					<div class="offer-grids">
						<div class="col-md-6 offer-grid">
							<div class="offer-grid1">
								<h4><a href="single.html">3895 NW 107th Ave</a></h4>
								<div class="offer1">
									<div class="offer-left">
										<a href="single.html" class="mask"><img src="<spring:url value='/resources/images/p5.jpg' /> " class="img-responsive zoom-img" alt=""/></a>
									</div>
									<div class="offer-right">
										<h5><label>$</label> 5,200 Per Month - <span>Office</span></h5>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh…</p>
										<a href="single.html"class="button1">more details</a>
									</div>
										<div class="clearfix"></div>
								</div>
							</div>
						</div>
							<div class="col-md-6 offer-grid">
								<div class="offer-grid1">
									<h4><a href="single.html">1400 Anastasia Avenue, Coral</a></h4>
									<div class="offer1">
										<div class="offer-left">
											<a href="single.html" class="mask"><img src="<spring:url value='/resources/images/p6.jpg'/>" class="img-responsive zoom-img" alt=""/></a>
									</div>
										<div class="offer-right">
											<h5><label>$</label> 525,000 - <span>Villa</span></h5>
											<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh…</p>
											<a href="single.html"class="button1">more details</a>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
						<div class="clearfix"></div>
					</div>
					<div class="offer-grids">
						<div class="col-md-6 offer-grid">
							<div class="offer-grid1">
								<h4><a href="#">12 Apartments Of Type A</a></h4>
								<div class="offer1">
									<div class="offer-left">
										<a href="single.html" class="mask"><img src="<spring:url value='/resources/images/p7.jpg'/>" class="img-responsive zoom-img" alt=""/></a>
									</div>
									<div class="offer-right">
										<h5><label>$</label> 3,200 Per Month - <span>Apartment</span></h5>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh…</p>
										<a href="single.html"class="button1">more details</a>
									</div>
										<div class="clearfix"></div>
								</div>
							</div>
						</div>
							<div class="col-md-6 offer-grid">
								<div class="offer-grid1">
									<h4><a href="single.html">20 Apartments Of Type B</a></h4>
									<div class="offer1">
										<div class="offer-left">
											<a href="single.html" class="mask"><img src="<spring:url value='/resources/images/p8.jpg'/>" class="img-responsive zoom-img" alt=""/></a>
									</div>
										<div class="offer-right">
											<h5><label>$</label> 4,200 Per Month - <span>Apartment</span></h5>
											<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh…</p>
											<a href="single.html"class="button1">more details</a>	
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
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
								<p>${property.getDescription()}� <a href="<spring:url value='/property/${property.getId()}' /> ">Know More</a></p>
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