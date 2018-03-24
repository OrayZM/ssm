<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=2.0" />
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">
	function checkUser() {
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		var age = document.getElementById("age").value;

		if (age == "") {
			alert("年龄不能为空");
			return false;
		} else if (username == "") {
			alert("用户名不能为空");
			return false;
		} else if (password == "") {
			alert("密码不能为空");
			return false;
		} else {
			document.getElementById("logonForm").submit();
		}

	}
</script>
</head>


<body>
	<div class="login">
		<img src="../img/login._02.png" alt="" />
	</div>
	<div class="tab-content">${sessionScope.message}</div>
	<form action="${pageContext.request.contextPath}/user/showUser.do"
		method="post" id="logonForm">
		<div class="login_input">
			<div class="login_input_box" align="center">
				<span>账号：</span> <input type="text" name="username"
					placeholder="username" id="username" /> <br /> <span>年龄：</span> <input
					type="text" name="age" placeholder="age" id="age" /> <br /> <span>密码：</span>
				<input type="password" name="password" placeholder="password"
					id="password" />
				<!--  //<input type="submit"  > -->
				<br />
				<div align="center">
					<button id="logon" class="login_btn" onclick="checkUser();"
						value="Login">Login</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>