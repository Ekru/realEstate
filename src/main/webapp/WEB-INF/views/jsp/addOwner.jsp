<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
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
							<form method="post"  commandName="owner">
								<input type="text" name="firstName" placeholder="First Name" />
								<input type="text" name="lastName" placeholder="Last Name" />
								<input type="text" name="telNumber" placeholder="Mobile Number" />
								<input type="email" name="email" placeholder="Email" />
								<input type="password"  name="password" placeholder="password"/>
								<input type="text"  name="address.street" placeholder="Street"/>
								<input type="text"  name="address.city" placeholder="City"/>
								<input type="text"  name="address.state" placeholder="state"/>
								<input type="text"  name="address.zip" placeholder="Zip Code"/>
								<br/>
								<input type="submit" value="Submit" >
							</form>
						</div>
						
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>	

