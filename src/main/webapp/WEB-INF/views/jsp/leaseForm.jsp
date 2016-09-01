<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Lease Application Form</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="contact-section">
				<div class="container">
					
					<div class="contact-grids">
						<div class="col-md-8 contact-grid">
							<h5>Fill out the form and we will get back to you within 24 hours</h5>
							
							<form action="leaseAction "  method="post">
							<input type="text" name="client.firstName" value="First Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'First Name';}" required="">
											<input type="text" name="client.lastName" value="Last Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Last Name';}" required="">
											<input type="text" name="client.email"value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">	
											<input type="text" name="client.phone"value="Phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'phone';}" required="">	
											<input type="text" name="client.address.street"value="Street" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Street';}" required="">
											<input type="text" name="client.address.city"value="City" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'City';}" required="">
											<input type="text" name="client.state.state"value="State" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'State';}" required="">
											<input type="text" name="client.address.zip"value="Zip" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Zip';}" required="">
											<input type="text" name="income"value="Income" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Income';}" required="">
											<input type="text" name="leaseDate"value="Date" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Date';}" required="">
							
								<textarea type="text"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Special Instruction/Comments...';}" required="">Special Instruction/Comments...</textarea>
								
								<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
								<input type="submit" value="Apply Lease" >
							</form>
						</div>
					
											</div>
				</div>
			</div>
		</div>