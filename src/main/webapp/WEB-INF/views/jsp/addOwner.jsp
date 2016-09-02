<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Owners Registration</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="contact-section">
				<div class="container">					
					<div class="contact-grids">
						<div class="col-md-8 contact-grid">
							<h5>Enter Owner Details</h5>
							<br/>
							<form method="post"  modelAttribute="owner">
								<input type="text" name="firstName " placeholder="First Name" required="">
								<input type="text" name="lastName" placeholder="Last Name" required="">
								<input type="text" name="telNumber" placeholder="Mobile Number" required="">
								<input type="text" name="email" placeholder="Email" required="">
								<input type="text"  name="address.street" placeholder="Street" required="">
								<input type="text"  name="address.city" placeholder="City" required="">
								<input type="text"  name="address.state" placeholder="state" required="">
								<input type="text"  name="address.zip" placeholder="Zip Code" required="">
								<br/>
								<input type="submit" value="Submit" >
							</form>
						</div>
						
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>	

