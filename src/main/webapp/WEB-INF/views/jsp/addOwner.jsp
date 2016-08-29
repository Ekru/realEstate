<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Contact</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="contact-section">
				<div class="container">					
					<div class="contact-grids">
						<div class="col-md-8 contact-grid">
							<h5>Fill out the form and we will get back to you within 24 hours</h5>
							<p>Nemo enim ips voluptatem voluptas sitsper natuaut odit aut fugit consequuntur magni dolores eosqratio nevoluptatem  amet eism com odictor ut ligulate cot ameti dapibu</p>
							<form method="post" action="addOwnerSuccess" modelAttribute="owner">
								<input type="text" value="firstName " onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'First Name';}" required="">
								<input type="text" value="lastName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Last Name';}" required="">
								<input type="text" value="telNumber" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone';}" required="">
								<input type="text" value="email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'email';}" required="">
								<input type="text"  value="address.street" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Street';}" required="">
								<input type="text"  value="address.city" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'City';}" required="">
								<input type="text"  value="address.street" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'State';}" required="">
								<input type="text"  value="address.city" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Zip';}" required="">
								<input type="submit" value="Submit" >
							</form>
						</div>
						
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>	

