<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Agents Profile</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="properties-section">
				<div class="container">
				<div class="properties-grids">
					<div class="col-md-3 agentprofile-right">						
						<div class="feature">
							<h4>Featured Properties</h4>
							<div class="feature-top">
							<img src="images/s3.jpg" class="img-responsive" alt="/">
									<h5>60 Merrick Way, Miami</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer  elit,… <a href="#">Know More</a></p>
							</div>
							<div class="feature-top top2">
							<img src="images/s2.jpg" class="img-responsive" alt="/">
									<h5>Villa in Hialeah, Dade</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer  elit,… <a href="#">Know More</a></p>
							</div>
						</div>
					</div>
					<div class="col-md-9 agentprofile-left">
						<div class="agent-profile">
							<div class="profile-left">
							<h4>{owner.firstName +" "+ owner.lastName}</h4>
							<p>Property Owner |<a href="mailto:{owner.email}">{owner.email}</a></p>
							<img src="images/a4.jpg" class="img-responsive" alt="/">
							</div>
							<div class="profile-right">
								<h5>My details</h5>
								<ul>									
									<li><i class="glyphicon glyphicon-phone" aria-hidden="true"></i> Mobile : {owner.telNumber}</li>
									<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i> <a href="mailto:{owner.email}">{owner.email}</a></li>
									<li><i class="glyphicon glyphicon-address" aria-hidden="true"></i> Address : {owner.address.street+", "+owner.address.city+" "+owner.address.state+ " "+owner.address.zip}</li>									
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
						<div class="contact-me">
							<h4>Contact Me</h4>
							<form>
								<input type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
								<input type="email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
								<input type="text" value="Telephone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Telephone';}" required="">
								<textarea type="text"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message...';}" required="">Message...</textarea>
								<input type="submit" value="Submit" >
								<input type="reset" value="Clear" >
							</form>
							<div class="clearfix"></div>
						</div>						
					</div>
					<div class="clearfix"></div>
				</div>
				</div>
			</div>
		</div>
		