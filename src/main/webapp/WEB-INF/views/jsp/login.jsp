<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- login -->
<<<<<<< HEAD
<div  role="dialog">
=======
<div role="dialog">
>>>>>>> 5391dc3388f7fa6041d050299004696f009c202b
	<div class="modal-dialog" role="document">
		<div class="modal-content modal-info">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body real-spa">
				<div class="login-grids">
					<div class="login">

						<div class="login-right">
							<c:if test="${not empty error}">
								<div class="error">${error}</div>
							</c:if>
							<c:if test="${not empty msg}">
								<div class="msg">${msg}</div>
							</c:if>
							<form name='loginForm'
								action="<c:url value='/j_spring_security_check' />"
								method='POST'>
								<h3>Login</h3>
								 <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
								<input type="text" name="email" value="Enter your Email"
									onfocus="this.value = '';"
									onblur="if (this.value == '') {this.value = 'Enter your Email';}"
									required=""> <input type="password" name="password"
									value="Password" onfocus="this.value = '';"
									onblur="if (this.value == '') {this.value = 'Password';}"
									required="">
								<h4>
									<a href="#">Forgot password</a> / <a href="#">Create new
										password</a>
								</h4>
								<div class="single-bottom">
									<input type="checkbox" id="brand" value=""> <label
										for="brand"><span></span>Remember Me.</label>
								</div>
								<input type="submit" value="Login Now">
							</form>
						</div>

					</div>
					<p>
						By logging in you agree to our <a href="#">Terms</a> and <a
							href="#">Conditions</a> and <a href="#">Privacy Policy</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- //login -->
