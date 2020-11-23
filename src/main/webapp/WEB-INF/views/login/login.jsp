<% String path=application.getContextPath();
%>


<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V18</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="/css/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="/css/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/css/login/util.css">
	<link rel="stylesheet" type="text/css" href="/css/login/main.css">
	<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
	
<!--===============================================================================================-->
</head>
<body style="background-color: #666666;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form" action="<%=path%>/bookaro/login",method="POST">
					<span class="login100-form-title p-b-43">
						Login to continue
					</span>
					
                    
					<div class="wrap-input100 validate-input" data-validate = "Valid Username is required!!">
						<input class="input100" type="text" name="username">
						<span class="focus-input100"></span>
						<span class="label-input100">Username</span>
					</div>
					
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="password">
						<span class="focus-input100"></span>
						<span class="label-input100">Password</span>
					</div>

					<div class="flex-sb-m w-full p-t-3 p-b-32">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Remember me
							</label>
						</div>

						<div>
							<a href="#" class="txt1">
								Forgot Password?
							</a>
						</div>
					</div>
			

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>
					

				</form>

				<div class="login100-more" style="background-image: url('/images/bg-01.png');">
				</div>
			</div>
		</div>
	</div>
	
	

	
	
<!--===============================================================================================-->
	<script src="/js/jquery-3.3.1.min.js"></script>
<!--===============================================================================================-->
	<script src="/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="/js/popper.js"></script>
	<script src="/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="/js/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="/js/moment.min.js"></script>
	<script src="/js/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="/js/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="/js/login/main.js"></script>

</body>
</html>