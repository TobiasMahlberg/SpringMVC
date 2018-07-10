<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

    <style>
	.login-container{
	    position: relative;
	    width: 400px;
	    margin: 80px auto;
	    padding: 20px 40px 40px;
	    text-align: center;
	    background: #fff;
	    border: 1px solid #ccc;
	}
	.login-container::before,.login-container::after{
	    content: "";
	    position: absolute;
	    width: 100%;
	    height: 100%;
	    top: 3.5px;left: 0;
	    background: #fff;
	    z-index: -1;
	    -webkit-transform: rotateZ(4deg);
	    -moz-transform: rotateZ(4deg);
	    -ms-transform: rotateZ(4deg);
	    border: 1px solid #ccc;
	
	}
	.login-container::after{
	    top: 5px;
	    z-index: -2;
	    -webkit-transform: rotateZ(-2deg);
	     -moz-transform: rotateZ(-2deg);
	     -ms-transform: rotateZ(-2deg);
	
	}
	.form-box input{
	    width: 100%;
	    padding: 10px;
	    text-align: center;
	    height:40px;
	    border: 1px solid #ccc;;
	    background: #fafafa;
	    transition:0.2s ease-in-out;
	
	}
	.form-box input:focus{ outline: 0; background: #eee; }
	.form-box input[type="text"]{ border-radius: 5px 5px 0 0; text-transform: lowercase; }
	.form-box input[type="password"]{ border-radius: 0 0 5px 5px; border-top: 0; }
	.form-box button.login{ margin-top:15px; padding: 10px 20px; }

	</style>
  </head>
  <body>
    <p><font color="red">${errorMessage}</font></p>
   	
   	<form action="/login" method="POST">

	  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

	  <div class="login-container">
		<div class="form-box">
   		  <fieldset class="form-group">
			<label><spring:message code="login.name" /></label> <input name="username" type="text" class="form-control" />
		  </fieldset>
		  <fieldset class="form-group">
			<label><spring:message code="login.password" /></label> <input name="password" type="password" class="form-control" />
		  </fieldset>
   		  <input name="submit" type="submit" value="Login">
   		  <!--  <button class="btn btn-info btn-block login" type="submit">Login</button>  -->
   	  	</div>
 	  </div>
   	</form>
  
<%@ include file="common/footer.jspf"%>