
<%
String path=application.getContextPath();
%>

<!doctype html>
<html class="no-js" lang="zxx">
<head>
	<meta charset="utf-8">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<title>Home | Bookaro</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Favicons -->
	<link rel="shortcut icon" href="/images/favicon.ico">
	<link rel="apple-touch-icon" href="/images/icon.png">
	<script src="/js/main1.js"></script>
	
    <link rel="stylesheet" href="/css/sell/style.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
  

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<!-- Google font (font-family: 'Roboto', sans-serif; Poppins ; Satisfy) -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet"> 
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,600,600i,700,700i,800" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet"> 

	<!-- Stylesheets -->
	<link rel="stylesheet" href="/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/plugins.css">
	<link rel="stylesheet" href="/css/cart/style.css">

	<!-- Cusom css -->
   <link rel="stylesheet" href="/css/custom.css">

	<!-- Modernizer js -->
	<script src="/js/modernizr-3.5.0.min.js"></script>
</head>
<body>

	<div class="wrapper" id="wrapper">
	
		<%@include file="../header.jsp" %>
	
		
    <div class="main">

        <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <h2 class="form-title">Sell Your Books</h2>
                        <form class="register-form" id="register-form" action="<%=path%>/bookaro/sellbook" enctype="multipart/form-data" method="POST" >

                             <div class="form-group">
								<select name="classes">
								<option disabled selected>Choose Class</option>
  								<option value="1">Class 1 <sup>st</sup></option>
  								<option value="2">Class 2 <sup>nd</sup></option>
  								<option value="3">Class 3 <sup>rd</sup></option>
  								<option value="4">Class 4 <sup>th</sup></option>
  								<option value="5">Class 5 <sup>th</sup></option>
  								<option value="6">Class 6 <sup>th</sup></option>
  								<option value="7">Class 7 <sup>th</sup></option>
  								<option value="8">Class 8 <sup>th</sup></option>
  								<option value="9">Class 9 <sup>th</sup></option>
  								<option value="10">Class 10 <sup>th</sup></option>
  								<option value="11">Class 11<sup>th</sup></option>
  								<option value="12">Class 12 <sup>th</sup></option>
								</select>
							</div>
                             <div class="form-group">
                                <input type="text" placeholder="Subject" name="subject" required>
                             </div>
                            <div class="form-group">
                                <input type="text" placeholder="Author" name="author" required>
                            </div>
                            <div class="form-group">
                                <input type="text" placeholder="Board" name="Board" required>
                            </div>
                            <div class="form-group">
                                <input type="text" placeholder="How old the book?" name="old" required>
                            </div>
                            <div class="form-group">
                                 <input type="text" placeholder="Set Your Price"  name="price" required>
                            </div>
                                                  <div class="form-group">
                                <input type="file" name="filename1" requried>
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" name="signup" id="signup" class="form-submit" value="POST">
                            </div>
                                  
                        </form>
                    </div>
                    <div class="signup-image">
                        <figure><img src="/images/signup-image.jpg" alt="sing up image"></figure>
                        
                    </div>
                </div>
            </div>
        </section>

      
    </div>
		

		<footer id="wn__footer" class="footer__area bg__cat--8 brown--color">
			<div class="footer-static-top">
				<div class="container">
					<div class="row">
						<div class="col-lg-12">
							<div class="footer__widget footer__menu">
								<div class="ft__logo">
									<a href="index.html">
										<img src="/images/logo.png" alt="logo">
									</a>
									<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered duskam alteration variations of passages</p>
								</div>
								<div class="footer__content">
									<ul class="social__net social__net--2 d-flex justify-content-center">
									<li><a href="#" class="fa fa-facebook"></a></li>
									        <li><a href="#" class="fa fa-twitter"></a></li>
									        <li><a href="#" class="fa fa-google"></a></li>
									        <li><a href="#" class="fa fa-linkedin"></a></li>
									        <li><a href="#" class="fa fa-youtube"></a></li>
									</ul>
									<ul class="mainmenu d-flex justify-content-center">
										<li><a href="index.html">Trending</a></li>
										<li><a href="index.html">Best Seller</a></li>
										<li><a href="index.html">All Product</a></li>
										<li><a href="index.html">Wishlist</a></li>
										<li><a href="index.html">Blog</a></li>
										<li><a href="index.html">Contact</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="copyright__wrapper">
				<div class="container">
					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-12">
							<div class="copyright">
								<div class="copy__right__inner text-left">
									<p>Copyright <i class="fa fa-copyright"></i> <a href="https://freethemescloud.com/">Bookaro</a> All Rights Reserved</p>
								</div>
							</div>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-12">
							<div class="payment text-right">
								<img src="images/icons/payment.png" alt="" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
		<!-- //Footer Area -->
				<!-- END QUICKVIEW PRODUCT -->
	</div>
	<!-- //Main wrapper -->

	<!-- JS Files -->
	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/plugins.js"></script>
	<script src="/js/active.js"></script>
	
</body>
</html>