	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="qu"%>
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<header id="wn__header" class="header__area header__absolute sticky__header">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-6 col-sm-6 col-6 col-lg-2">
						<div class="logo">
							<a href="index.html">
								<img src="/images/logo.png" alt="logo images">
							</a>
						</div>
					</div>
					<div class="col-lg-8 d-none d-lg-block">
						<nav class="mainmenu__nav">
							<ul class="meninmenu d-flex justify-content-start">
								<li class="drop with--one--item"><a href="index.html">Home</a></li>
								<li class="drop"><a href="#">Shop</a>
									<div class="megamenu mega03">
										<ul class="item item03">
											<li class="title">Shop Layout</li>
											<li><a href="shop-grid.html">Shop Grid</a></li>
											<li><a href="single-product.html">Single Product</a></li>
										</ul>
										<ul class="item item03">
											<li class="title">Shop Page</li>
											<li><a href="my-account.html">My Account</a></li>
											<li><a href="cart.html">Cart Page</a></li>
											<li><a href="checkout.html">Checkout Page</a></li>
											<li><a href="wishlist.html">Wishlist Page</a></li>
											<li><a href="error404.html">404 Page</a></li>
											<li><a href="faq.html">Faq Page</a></li>
										</ul>
										<ul class="item item03">
											<li class="title">Bargain Books</li>
											<li><a href="shop-grid.html">Bargain Bestsellers</a></li>
											<li><a href="shop-grid.html">Activity Kits</a></li>
											<li><a href="shop-grid.html">B&N Classics</a></li>
											<li><a href="shop-grid.html">Books Under $5</a></li>
											<li><a href="shop-grid.html">Bargain Books</a></li>
										</ul>
									</div>
								</li>
								<li class="drop"><a href="shop-grid.html">Books</a>
									<div class="megamenu mega03">
										<ul class="item item03">
											<li class="title">Categories</li>
											<li><a href="shop-grid.html">Biography </a></li>
											<li><a href="shop-grid.html">Business </a></li>
											<li><a href="shop-grid.html">Cookbooks </a></li>
											<li><a href="shop-grid.html">Health & Fitness </a></li>
											<li><a href="shop-grid.html">History </a></li>
										</ul>
										<ul class="item item03">
											<li class="title">Customer Favourite</li>
											<li><a href="shop-grid.html">Mystery</a></li>
											<li><a href="shop-grid.html">Religion & Inspiration</a></li>
											<li><a href="shop-grid.html">Romance</a></li>
											<li><a href="shop-grid.html">Fiction/Fantasy</a></li>
											<li><a href="shop-grid.html">Sleeveless</a></li>
										</ul>
										<ul class="item item03">
											<li class="title">Collections</li>
											<li><a href="shop-grid.html">Science </a></li>
											<li><a href="shop-grid.html">Fiction/Fantasy</a></li>
											<li><a href="shop-grid.html">Self-Improvemen</a></li>
											<li><a href="shop-grid.html">Home & Garden</a></li>
											<li><a href="shop-grid.html">Humor Books</a></li>
										</ul>
									</div>
								</li>
								<li class="drop"><a href="shop-grid.html">Classes</a>
									<div class="megamenu mega02">
										<ul class="item item02">
											<li><a href="<%=path%>/bookaro/searchClasses/1">Class 1 <sup>st</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/2">Class 2 <sup>nd</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/3">Class 3 <sup>rd</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/4">Class 4 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/5">Class 5 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/6">Class 6 <sup>th</sup></a></li>
										</ul>
										<ul class="item item02">
											<li><a href="<%=path%>/bookaro/searchClasses/7">Class 7 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/8">Class 8 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/9">Class 9 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/10">Class 10 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/11">Class 11 <sup>th</sup></a></li>
											<li><a href="<%=path%>/bookaro/searchClasses/12">Class 12 <sup>th</sup></a></li>
										</ul>
									</div>
								</li>
							
								<li><a href="<%=path%>/bookaro/contact">Contact</a></li>
							</ul>
						</nav>
					</div>
					<div class="col-md-6 col-sm-6 col-6 col-lg-2">
						<ul class="header__sidebar__right d-flex justify-content-end align-items-center">
							<li class="shop_search"><a class="search__active" href="#"></a></li>
							<li class="wishlist"><a href="#"></a></li>
							<li class="shopcart"><a class="cartbox_active" href="#"><span class="product_qun">${items}</span></a>
								<!-- Start Shopping Cart -->
								<div class="block-minicart minicart__active">
									<div class="minicart-content-wrapper">
										<div class="micart__close">
											<span>close</span>
										</div>
										
                                    <qu:set var="count" value="0"></qu:set>
                                    <qu:set var="total" value="0"></qu:set>
                                    
                                    <qu:forEach items="${cart}" var="book">
                                    	<div class="single__items">
											<div class="miniproduct">
												<div class="item01 d-flex">
													<div class="thumb">
													<a href="product-details.html"><img src="data:image/png;base64,${book.getBookPic()}"></a></td>
													</div>
													<div class="content">
														<h6><a href="product-details.html">${book.getBookSubject()}</a></h6>
														<span class="prize">${book.getBookPrice()} Rs.</span>
														<div class="product_prize d-flex justify-content-between">
															<span class="qun">Qty: ${book.getQuantity()}</span>
															
															<qu:set var="total" value="${total+(book.getBookPrice()*book.getQuantity())}"></qu:set>
															<ul class="d-flex justify-content-end">
																<a href="<%=path%>/bookaro/removeCart1/${count}"><i class="fa fa-trash" aria-hidden="true"></i></a>
																
																		</ul>
														</div>
													</div>
												</div>
											</div>
										</div>
										<qu:set var="count" value="${count+1}"></qu:set>
								    </qu:forEach>
                                   
									
										<div class="items-total d-flex justify-content-between">
								
											<span> ${items} items  </span>
											<span>Cart Subtotal</span>
										</div>
										<div class="total_amount text-right">
											<span>${total} Rs.</span>
										</div>
										<div class="mini_action checkout">
											<a class="checkout__btn" href="<%=path%>/bookaro/cart">Go to Checkout</a>
										</div>
										
									</div>
								</div>
							</li>
							<li class="setting__bar__icon"><a class="setting__active" href="#"></a>
								<div class="searchbar__content setting__block">
									<div class="content-inner">
										<div class="switcher-currency">
											<strong class="label switcher-label">
												<span>Currency</span>
											</strong>
											<div class="switcher-options">
												<div class="switcher-currency-trigger">
													<span class="currency-trigger">USD - US Dollar</span>
													<ul class="switcher-dropdown">
														<li>GBP - British Pound Sterling</li>
														<li>EUR - Euro</li>
													</ul>
												</div>
											</div>
										</div>
										<div class="switcher-currency">
											<strong class="label switcher-label">
												<span>Language</span>
											</strong>
											<div class="switcher-options">
												<div class="switcher-currency-trigger">
													<span class="currency-trigger">English01</span>
													<ul class="switcher-dropdown">
														<li>English02</li>
														<li>English03</li>
														<li>English04</li>
														<li>English05</li>
													</ul>
												</div>
											</div>
										</div>
										<div class="switcher-currency">
											<strong class="label switcher-label">
												<span>Select Store</span>
											</strong>
											<div class="switcher-options">
												<div class="switcher-currency-trigger">
													<span class="currency-trigger">Fashion Store</span>
													<ul class="switcher-dropdown">
														<li>Furniture</li>
														<li>Shoes</li>
														<li>Speaker Store</li>
														<li>Furniture</li>
													</ul>
												</div>
											</div>
										</div>
										<div class="switcher-currency">
											<strong class="label switcher-label">
												<span>My Account</span>
											</strong>
											<div class="switcher-options">
												<div class="switcher-currency-trigger">
													<div class="setting__menu">
														<span><a href="#">Compare Product</a></span>
														<span><a href="#">My Account</a></span>
														<span><a href="#">My Wishlist</a></span>
														<span><a href="#">Sign In</a></span>
														<span><a href="#">Create An Account</a></span>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<!-- Start Mobile Menu -->
				<div class="row d-none">
					<div class="col-lg-12 d-none">
						<nav class="mobilemenu__nav">
							<ul class="meninmenu">
								<li><a href="index.html">Home</a></li>
								<li><a href="#">Pages</a>
									<ul>
										<li><a href="about.html">About Page</a></li>
										<li><a href="portfolio.html">Portfolio</a>
											<ul>
												<li><a href="portfolio.html">Portfolio</a></li>
												<li><a href="portfolio-details.html">Portfolio Details</a></li>
											</ul>
										</li>
										<li><a href="my-account.html">My Account</a></li>
										<li><a href="cart.html">Cart Page</a></li>
										<li><a href="checkout.html">Checkout Page</a></li>
										<li><a href="wishlist.html">Wishlist Page</a></li>
										<li><a href="error404.html">404 Page</a></li>
										<li><a href="faq.html">Faq Page</a></li>
										<li><a href="team.html">Team Page</a></li>
									</ul>
								</li>
								<li><a href="shop-grid.html">Shop</a>
									<ul>
										<li><a href="shop-grid.html">Shop Grid</a></li>
										<li><a href="single-product.html">Single Product</a></li>
									</ul>
								</li>
								<li><a href="blog.html">Blog</a>
									<ul>
										<li><a href="blog.html">Blog Page</a></li>
										<li><a href="blog-details.html">Blog Details</a></li>
									</ul>
								</li>
								<li><a href="contact.html">Contact</a></li>
							</ul>
						</nav>
					</div>
				</div>
				<!-- End Mobile Menu -->
	            <div class="mobile-menu d-block d-lg-none">
	            </div>
	            <!-- Mobile Menu -->	
			</div>		
		</header>
		<div class="brown--color box-search-content search_active block-bg close__top">
			<form id="search_mini_form" class="minisearch" action="<%=path%>/bookaro/buy">
				<div class="field__search">
					<input type="text" placeholder="Search entire store here..." name="search">
					<div class="action">
					
					<input type="submit" value="Search"><i class="fa fa-search" aria-hidden="true"></i></a>
					</div>
				</div>
			</form>
			<div class="close__wrap">
				<span>close</span>
			</div>
		</div>
	