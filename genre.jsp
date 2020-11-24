<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	HttpSession hs = request.getSession();
session.getAttribute("no");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/Best_body_Maker/css/genre.css">
					<%session.setAttribute("ac", (int) (Math.random() * 1000));%>
</head>
<body>
	<header>
		<h1>ボディビルダー診断</h1>
	</header>


		<div class="box1">
			<%
			if (session.getAttribute("no") != null) {
		%>
			<p>ジャンルが選択されていませんどれかのジャンルを選択してください！！</p>
			<br>
			<%
				}
			%>
			<h1>好きなジャンルは？</h1>
		</div>
		<form method="post" action="Genre">
			<div class="box2">
				<a href="Genre?genre=F">フィジーク<input type="hidden" name="ac"value="<%=hs.getAttribute("ac")%>"></a>
				</div>
				<div class="box3">
				 <a href="Genre?genre=C">クラシックフィジーク<input type="hidden"name="ac" value="<%=hs.getAttribute("ac")%>"></a>
				</div>
				<div class="box4">
				<a href="Genre?genre=O">ボディビル<input type="hidden" name="ac"
					value="<%=hs.getAttribute("ac")%>"></a>
					</div>

		</form>

	<footer> <a href="top.jsp">最初から診断を始める</a></footer>
</body>
</html>
