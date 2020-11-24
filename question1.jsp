<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%HttpSession hs = request.getSession(); %>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/Best_body_Maker/css/question1.css">
</head>
<body>
	<header>
		<h1>ボディビルダー診断</h1>
		<h1>大事なのは？</h1>
		<%if(session.getAttribute("on")!=null){ %>
			<br><p>大事なものがなになのか選択されていません。いずれかを選択してください</p><%}%>
	</header>

<form method="post" action="Question1">
		<div class="box1">
		<a href="Question1?second=1">綺麗なアウトライン！！<input type="hidden" name="ac"value="<%=hs.getAttribute("ac")%>"></a>
		</div>
			<div class="box2">
				<a href="Question1?second=2">なによりも迫力だ！！<input type="hidden" name="ac"value="<%=hs.getAttribute("ac")%>"></a>
				</div>
				<div class="box3">
				 <a href="Question1?second=3">逆三角形！！<input type="hidden"name="ac" value="<%=hs.getAttribute("ac")%>"></a>
				</div>
				<div class="box4">
				<a href="Question1?second=4">弾丸のような腹筋だ！<input type="hidden" name="ac"value="<%=hs.getAttribute("ac")%>"></a>
				</div>

		</form>
    	<footer><a href="top.jsp">最初から診断を始める</a> </footer>
</body>
</html>