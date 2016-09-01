<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Register </title>
</head>
<body>
<!-- Register -->
			<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content modal-info">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
						</div>
						<div class="modal-body real-spa">
							<div class="login-grids">
								<div class="login">
									<div class="login-right">
										<form action="client"  method="post">
											<h3>Register </h3>
											<input type="text" name="firstName" value="First Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'First Name';}" required="">
											<input type="text" name="lastName" value="Last Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Last Name';}" required="">
											<input type="text" name="email"value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">	
											<input type="text" name="phone"value="Phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'phone';}" required="">	
											<input type="text" name="address.street"value="Street" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Street';}" required="">
											<input type="text" name="address.city"value="City" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'City';}" required="">
											<input type="text" name="state.state"value="State" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'State';}" required="">
											
											<input type="text" name="address.zip"value="Zip" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Zip';}" required="">
												
											<input type="password" name="password"value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">	
											
											<input type="submit" value="Register Now" >
										</form>
									</div>
									<div class="clearfix"></div>								
								</div>
								<p>By logging in you agree to our <a href="#">Terms</a> and <a href="#">Conditions</a> and <a href="#">Privacy Policy</a></p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- //Register -->

</body>
</html>