<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
								<ul id="myTab" class="nav nav-tabs left-tab" role="tablist">
									<li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true"><img src="images/menu1.png"></a></li>
									<li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><img src="images/menu.png"></a></li>
								</ul>
								<div id="myTabContent" class="tab-content">
									<c:forEach items="${properties}" var="property">
						
									<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
										<div class="forsale-grids">
											<h4><a href="<spring:url value='/property/${property.getId()}' /> ">${property.getName()}</a></h4>
											<div class="forsale1">
												<div class="forsale-left">
													<a href="#"><img src="images/p6.jpg" class="img-responsive" alt="/"></a>
												</div>
												<div class="forsale-right">
													<h5><label>$</label> 7,500 Per Month - <span>Single Family Home</span></h5>
													<p>${property.getDescription()}……</p>
													<a href="<spring:url value='/property/${property.getId()}' /> "class="button4">more details</a>
												</div>
												<div class="clearfix"></div>
												<ul>
												<li><span> ${property.getId()} </span>Property Id </li>
													<li><span> ${property.getPrice()} </span>Price</li>
													<li><span> ${property.getAria()} </span>Bathrooms</li>
													
													<li><span> 2 </span>Garages</li>
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
							<h4>Find Your Place</h4>
							<div class="yourplace">
								<h5>all location</h5>
								<select class="sel2">
									<option value="">All Locations</option>
									<option value="">New Jersey</option>
									<option value="">New York</option>
									<option value="">Australia</option>
									<option value="">Canada</option>
									<option value="">India</option>
								</select>
							</div>
							<div class="yourplace">
								<h5>all sub location</h5>
								<select class="sel2">
									<option value="">All Locations</option>
									<option value="">New Jersey</option>
									<option value="">New York</option>
									<option value="">Australia</option>
									<option value="">Canada</option>
									<option value="">India</option>
								</select>
							</div>
							<div class="yourplace">
								<h5>Property Status</h5>
								<select class="sel2">
									<option value="">All status</option>
									<option value="">none</option>
									<option value="">open house</option>
									<option value="">rent</option>
									<option value="">sale</option>
								</select>
							</div>
							<div class="yourplace">
								<h5>Property Type</h5>
								<select class="sel2">
									<option value="">All Type</option>
									<option value="">Commercial</option>
									<option value="">- Office</option>
									<option value="">- Buy</option>
									<option value="">Residential</option>
									<option value="">-Apartment</option>
								</select>
							</div>
							<div class="yourplace-grids">
								<div class="col-md-6 yourplace-grid">
									<h5>Min Beds</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">1</option>
										<option value="">2</option>
										<option value="">3</option>
										<option value="">4</option>
										<option value="">5</option>
									</select>
								</div>
								<div class="col-md-6 yourplace-grid">
									<h5>Min Baths</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">1</option>
										<option value="">2</option>
										<option value="">3</option>
										<option value="">4</option>
										<option value="">5</option>
									</select>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="yourplace-grids1">
								<div class="col-md-6 yourplace-grid">
									<h5>Min Price</h5>
									<select class="sel3">
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
								<div class="col-md-6 yourplace-grid">
									<h5>Max Price</h5>
									<select class="sel3">
										<option value="">any</option>
										<option value="">$1000</option>
										<option value="">$2000</option>
										<option value="">$3000</option>
										<option value="">$4000</option>
										<option value="">$5000</option>
										<option value="">$75000</option>
										<option value="">$10000</option>
									</select>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="search1">
							<form>
								<input type="submit" value="Search">
							</form>
							</div>
						</div>
						<div class="feature">
							<h4>Featured Properties</h4>
								<c:forEach items="${featuredProperties}" var="property">
							<div class="feature-top">
							<img src="images/s6.jpg" class="img-responsive" alt="/">
									<h5>${property.getName()}</h5>
									<p>${property.getDescription() },… <a href="<spring:url value='/property/${property.getId()}' />">Know More</a></p>
							</div>
							
							</c:forEach>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				</div>
			</div>
		</div>
		