<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
							<h5>Lease Status Check</h5>
							
							<form method="post" modelAttribute="lease">
							                <input type="text" name="lease.leaseId" value="${lease.leaseId}"  required="">
											<input type="text" name="client.id" value="${lease.client.id}" required="">
											<input type="text" name="client.firstName" value="${lease.client.firstName}"  required="">	
											<input type="text" name="client.lastName" value="${lease.client.lastName}" required="">												
											<input type="text" name="lease.leaseStatus" value="${lease.leaseStatus}"  required="">
											<input type="text" name="lease.income" value="${lease.income}" required="">
											<input type="text" name="leaseDate" value="${lease.leaseDate}"  required="">									
								            <input type="submit" value="Submit" >
							</form>
						</div>
					
					</div>
				</div>
			</div>
		</div>