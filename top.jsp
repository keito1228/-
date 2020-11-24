<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	HttpSession hs = request.getSession();
%>
<meta charset="UTF-8">
<title>top</title>


<link rel="stylesheet" type="text/css"
	href="/Best_body_Maker/css/style.css">
</head>
<body>
	<!-- 聖杯レイアウトに設定 -->
	<header>
		<h1>ボディビルダー診断</h1>
	</header>
	<div class="main">
		<div class="left">
			<!-- 左 -->
			<div class="Image2">
				<img
					src="https://www.navit-j.com/service/joseikin-now/blog/wp-content/uploads/2019/07/kintore_machine.png"><br>
			</div>
		</div>
		<div class="center">
			<!-- 中央 -->

			<div class="coment-left">
				ここではあなたの理想のボディビル選手を診断することができます。
			</div>

			<div class="coment-right">さっそく、診断を開始しましょう。</div>

<div class = "click-down">
			<form action="genre.jsp" method="POST">
				<input type="submit" name="btnSubmit" value="診断を開始する">
			</form>
		</div>
		</div>
		<div class="right">
			<!-- 右 -->
			<div class="Image">
				<img
					src="https://1.bp.blogspot.com/-3BEwXvye2Kg/X2VqTu7h48I/AAAAAAABbEc/JPk1zN2wOQ8fRewxQcQ7n0eOuqoBVxrBwCNcBGAsYHQ/s1600/sports_bodybuilder_man.png"><br>
			</div>
		</div>
	</div>
	<footer> </footer>
</body>
</html>