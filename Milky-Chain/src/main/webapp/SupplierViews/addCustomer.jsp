<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

	<!-- title -->
	<title>Customer Signup</title>

	<!-- favicon -->
	<link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
	<!-- google font -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
	<!-- fontawesome -->
	<link rel="stylesheet" href="assets/css/all.min.css">
	<!-- bootstrap -->
	<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
	<!-- owl carousel -->
	<link rel="stylesheet" href="assets/css/owl.carousel.css">
	<!-- magnific popup -->
	<link rel="stylesheet" href="assets/css/magnific-popup.css">
	<!-- animate css -->
	<link rel="stylesheet" href="assets/css/animate.css">
	<!-- mean menu css -->
	<link rel="stylesheet" href="assets/css/meanmenu.min.css">
	<!-- main style -->
	<link rel="stylesheet" href="assets/css/main.css">
	<!-- responsive -->
	<link rel="stylesheet" href="assets/css/responsive.css">

</head>
<body>
	
	<!--PreLoader-->
    <div class="loader">
        <div class="loader-inner">
            <div class="circle"></div>
        </div>
    </div>
    <!--PreLoader Ends-->
	
		
<!-- header -->
<div class="top-header-area" id="sticker">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-sm-12 text-center">
				<div class="main-menu-wrap">
					<!-- logo -->
					<div class="site-logo" >
						<a href="index.jsp">
							<img src="assets/img/logo.png" alt="">
							<!-- <h6>Milky Chain </h6> -->
							<!-- <h4 style="color:rgb(247, 11, 23)">
							 <body>
							<font size="2.9">  
								the taste of nutrition   
							</font> </h4> -->
						</body>
						</a>
					</div>
				
					<!-- logo -->

					<!-- menu start -->
					<nav class="main-menu">
						<ul>
							<li class="current-list-item"><a href="index.html">Home</a>
							</li>
							<li><a href="about.html">About Us</a></li>
							<li class="current-list-item"><a href="#">Customer</a>
								<ul class="sub-menu">
									<li><a href="addCustomer.jsp">Add Customer</a></li>
								   <li><a href="/SupplierViews/allSubscriber">View Customer</a></li>
									<li><a href="customerInArea.jsp">Customer In Area</a></li>
									<!-- <li><a href="removeCustomer.html">Remove Customer</a></li>
									<li><a href="updateCustomerAddress.html">Update Address</a></li>
									<li><a href="updateCustomerPassword.html">Update Password</a></li>
									<li><a href="updateCustomerMobileno.html">Update Mobile Number</a></li> -->
									
								</ul>
							</li>
							
							<li class="current-list-item"><a href="#">Subscription</a>
								<ul class="sub-menu">
								     <li><a href="SupplierViews/addSubscription.jsp">Add Subscription</a></li>
										<!-- <li><a href="endSubscription.jsp">End Subscription</a></li> -->
										<li><a href="/SupplierViews/allSubscriber">View Subscriber</a></li>
									<!-- <li><a href="unDeliverdDate.html">Non Delivered Order</a></li> -->
									<!-- <li><a href="customerInArea.html">Customer In Area</a></li> -->
									
									
								</ul>
							</li>
							<li class="current-list-item"><a href="#">Order</a>
								<ul class="sub-menu">
									<li><a href="/SupplierViews/showAllOrders">Show Orders</a></li>
									<!-- <li><a href="acceptOrders.html">Accept Order</a></li>
									<li><a href="rejectOrder.html">Reject Order</a></li>
									<li><a href="deliveredOrder.html">Delivered Order</a></li> -->
									<!-- <li><a href="unDeliverdDate.html">Non Delivered Order</a></li> -->
									
								</ul>
							</li>
							<li class="current-list-item"><a href="#">Complaint</a>
								<ul class="sub-menu">
									<li><a href="/SupplierViews/showComplaints">View Complaint</a></li>
									<!-- <li><a href="addComment.html">Add Comment</a></li> -->
									
									
									
								</ul>
							</li>
							<li class="current-list-item"><a href="#">Bill Genration</a>
								<ul class="sub-menu">
									<li><a href="generateBill.jsp">Generate Bill</a></li>
									<!-- <li><a href="addComment.html">Add Comment</a></li> -->
									
									
									
								</ul>
							</li>
							<!-- <li><a href="customerBill.html">Bill Genration</a></li>
							<ul class="sub-menu">
							<li><a href="generateBill.html">Generate Bill</a></li>
							
									
									
									
							</ul>
						</li> -->
							
							<li>
								<div class="header-icons">
								</div>
							</li>
							<li><a  href="${pageContext.request.contextPath}/homeLogout">Logout</a></li>
							
						</ul>
					</nav>
					<a class="mobile-show search-bar-icon" href="#"><i class="fas fa-search"></i></a>
					<div class="mobile-menu"></div>
					<!-- menu end -->
				</div>
			</div>
		</div>
	</div>
</div>
<!-- end header -->



	<!-- search area -->
	<div class="search-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<span class="close-btn"><i class="fas fa-window-close"></i></span>
					<div class="search-bar">
						<div class="search-bar-tablecell">
							<h3>Search For:</h3>
							<input type="text" placeholder="Keywords">
							<button type="submit">Search <i class="fas fa-search"></i></button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end search arewa -->
	
	<!-- breadcrumb-section -->
	<div class="breadcrumb-section breadcrumb-bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
					<div class="breadcrumb-text">
						<!-- <p>Get 24/7 Support</p> -->
						<h1>Add Customer</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->

	<!-- Customer Sign Up section -->
	<div class="checkout-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<!-- <div class="col-lg-8">
					<div class="checkout-accordion-wrap">
						<div class="accordion" id="accordionExample">
						  <div class="card single-accordion">
						    <div class="card-header" id="headingOne"> -->
						      <!-- <h5 class="mb-0"> -->
						        <!-- <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne"> -->
						         
						        <!-- </button> -->
						      <!-- </h5> -->

									<h3 style="align-content: center;"> Add Customer </h3>
									<br>
						    </div>

						      <div class="card-body">
										<!-- Customer Sign Up Form -->
						        <div class="billing-address-form">
                      <div class="customer-sign-up">
				    <form:form method="post" action="/SupplierViews/addCustomer" modelAttribute="customer">
                       					            <!-- first name -->
                        <label for="customerFname">Enter First Name</label>
                        <p><input type="text" name="customerFname" id="customerFname"placeholder="First Name"></p>
                        <!-- last name -->
                        <label for="customerLname">Enter Last Name</label>
                        <p><input type="text" name="customerLname" id="customerLname"placeholder="Last Name"></p>
                        <!-- customerAddress -->
                        <label for="Customer Address">Enter  Address</label>
                       <p><input type="text" name="customerAddress" id="customerAddress" placeholder="Address"></p>
                    
                        <!-- customerMobileNo-->
                        <label for="Mobile">Enter Mobile Number</label>
                        <p><input type="text" name="customerMobileNo" id="customerMobileNo" placeholder="Mobile Number"></p>
                        <!-- customerEmail -->
                        <label for="Email">Enter Email Id</label>
                        <p><input type="email" name="customerEmail" id="customerEmail" placeholder="Email"></p>
                        
                       <!-- Shipping Address -->
                       <!-- <label for="Shipping Address">Enter  Shipping Address</label>
                       <p> <textarea name="Shipping Address" id="Shipping Address" placeholder="Shipping Address"cols="140" rows="5"></textarea></p> -->
                       
                        <!-- customerUsername -->
                        <label for="Username">Enter User Name</label>
						        		<p><input type="text" name="customerUsername" id="customerUsername"placeholder="Username"></p>
                        <!-- customerPassword" -->
                        <label for="Password">Enter Password</label>
						        		<p><input type="text" name="customerPassword" id="customerPassword" placeholder="Password"></p>
                        <!-- customerPincode -->
                       <label for="Pincode">Enter Pincode</label>
                       <p><input type="text" name="customerPincode" id="customerPincode" placeholder="Pincode"></p>
							 <label for="Pincode">customerArea</label>
                       <p><input type="text" name="customerArea" id="customerArea" placeholder="Pincode"></p>			
					   
                                        
                        <!-- submit -->
												<!-- <a href="#" class="boxed-btn">Add</a> -->
                                                <button type="submit">Register</button>
                                                <!-- <input type="button" value="Add"> -->
						        		<!-- <p><input type="tel" placeholder="Phone"></p>
						        		<p><textarea name="bill" id="bill" cols="30" rows="10" placeholder="Say Something"></textarea></p> -->
						        	
                                </form:form>
                    </div>
						        </div>
						      </div>
						    </div>
						  </div>
						</div>

					</div>
				</div>

				
					
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end check out section -->
    
	<!-- find our location -->
	<!-- <div class="find-location blue-bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<p> <i class="fas fa-map-marker-alt"></i> Find Our Location</p>
				</div>
			</div>
		</div>
	</div> -->
	<!-- end find our location -->


	<!-- google map section -->
	<!-- <div class="embed-responsive embed-responsive-21by9">
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d26432.42324808999!2d-
		118.34398767954286!3d34.09378509738966!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x80c2bf07045
		279bf%3A0xf67a9a6797bdfae4!2sHollywood%2C%20Los%20Angeles%2C%20CA%2C%20USA!5e0!3m2!1sen!2sbd!4v1576846473265!5m2!1
		sen!2sbd" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" class="embed-responsive-item"></iframe>
		
	</div> -->
	<!-- end google map section -->


		<!-- footer -->
	<div class="footer-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<div class="footer-box about-widget">
						<h2 class="widget-title">About us</h2>
						<p>
							Join us in our journey of managing milk order & distribuition process by reaching out to end customer.
							We are providing only the best quality of milk.
						 
						</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box get-in-touch">
						<h2 class="widget-title">Get in Touch</h2>
						<ul>
							<li>Shop No.1, 503, Mayfair Tower S Phase-II, Wakdewadi, Shivajinagar
								Near Bank Of India,
								Pune, Maharashtra 411005 .</li>
							<li>support@milkychain.com</li>
							<li> +91-20-26450045</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box pages">
						<h2 class="widget-title">Our services</h2>
						<ul>
							<li><a href="${pageContext.request.contextPath}/homeLogout">Home</a></li>
							<li><a href="addCustomer.jsp">Add Customer</a></li>
							<li><a href="addSubscription.jspl">Add Subscription</a></li>
							<!-- <li><a href="checkbylocation.html">Check By Location</a></li> -->
							<!-- <li><a href="services.html">Shop</a></li>
							<li><a href="news.html">News</a></li> -->
						<!-- 	<li><a href="contact.html">Contact Us</a></li> -->
						</ul>
					</div>
				</div>
				<!-- <div class="col-lg-3 col-md-6">
					<div class="footer-box subscribe">
						<h2 class="widget-title">Subscribe</h2>
						<p>Subscribe to our mailing list to get the latest updates.</p>
						<form action="index.html">
							<input type="email" placeholder="Email">
							<button type="submit"><i class="fas fa-paper-plane"></i></button>
						</form>
					</div>
				</div> -->
			</div>
		</div>
	</div>
	<!-- end footer -->
		
		<!-- copyright -->
		<!-- <div class="copyright">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-12">
						<p>Copyrights &copy; 2019 - <a href="https://imransdesign.com/">Imran Hossain</a>,  All Rights Reserved.<br>
							Distributed By - <a href="https://themewagon.com/">Themewagon</a>
						</p>
					</div>
					<div class="col-lg-6 text-right col-md-12">
						<div class="social-icons">
							<ul>
								<li><a href="#" target="_blank"><i class="fab fa-facebook-f"></i></a></li>
								<li><a href="#" target="_blank"><i class="fab fa-twitter"></i></a></li>
								<li><a href="#" target="_blank"><i class="fab fa-instagram"></i></a></li>
								<li><a href="#" target="_blank"><i class="fab fa-linkedin"></i></a></li>
								<li><a href="#" target="_blank"><i class="fab fa-dribbble"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div> -->
		<!-- end copyright -->
		
		<!-- jquery -->
		<script src="assets/js/jquery-1.11.3.min.js"></script>
		<!-- bootstrap -->
		<script src="assets/bootstrap/js/bootstrap.min.js"></script>
		<!-- count down -->
		<script src="assets/js/jquery.countdown.js"></script>
		<!-- isotope -->
		<script src="assets/js/jquery.isotope-3.0.6.min.js"></script>
		<!-- waypoints -->
		<script src="assets/js/waypoints.js"></script>
		<!-- owl carousel -->
		<script src="assets/js/owl.carousel.min.js"></script>
		<!-- magnific popup -->
		<script src="assets/js/jquery.magnific-popup.min.js"></script>
		<!-- mean menu -->
		<script src="assets/js/jquery.meanmenu.min.js"></script>
		<!-- sticker js -->
		<script src="assets/js/sticker.js"></script>
		<!-- main js -->
		<script src="assets/js/main.js"></script>
	
	</body>
	</html>