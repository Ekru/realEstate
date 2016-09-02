<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!---banner--->
		<div class="banner-section">
			<div class="container">
				<h2>Adding Property</h2>
			</div>
		</div>
		<!---banner--->
		<div class="content">
			<div class="contact-section">
				<div class="container">					
					<div class="contact-grids">
						<div class="col-md-8 contact-grid">
							<h4>Enter the details of your property please:</h4>
							<br/>
							<form method="post" action="ownerProfile" modelAttribute="property">
								<label>Category</label>
								<label class="radio-inline"><input type="radio" name="category.name">House</label>
                                <label class="radio-inline"><input type="radio" name="category.name">Appartment</label>								
								<input type="text" name="name" placeholder="Property Name" required="">
								<input type="text" name="price" placeholder="Property Price" required="">
								<input type="text" name="area" placeholder="Property Area"  required="">
								<label>Featured:</label>
								<label class="radio-inline"><input type="radio" name="featured">Yes</label>
                                <label class="radio-inline"><input type="radio" name="featured">No</label>	
                                
								<input type="text" name="description" placeholder="Property Description"  required="">
								<input type="text"  name="address.street" placeholder="Street"  required="">
								<input type="text"  name="address.city" placeholder="City" required="">
								<input type="text"  name="address.state" placeholder="State" required="">
								<input type="text"  name="address.zip" placeholder="Zip Code"  required="">
								<input type="submit" value="Submit" >
							</form>
						</div>
						
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>	
