<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%HttpSession hs = request.getSession(); %>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="/Best_body_Maker/css/question2.css">
	<%session.setAttribute("ac", (int) (Math.random() * 1000));%>
</head>
<body>
	<header>
		<h1>ボディビルダー診断</h1>
		<h1>あなたの一番好きな部位は？</h1>
		<%if(session.getAttribute("on")!=null){ %>
			<br><p>好きな部位が選択されていません。いずれかの部位を選択してください！！</p><%}%>
	</header>

<form method="post" action="Question_Major_Items">
		<div class="box1">
		<a href="Question_Major_Items?mast=arm">何といってもたくましい腕だ！！<input type="hidden" name="ac"value="<%=hs.getAttribute("ac")%>"></a>
		</div>
			<div class="box2">
				<a href="Question_Major_Items?mast=leg">丸太のように太い脚だ！！<input type="hidden" name="ac"value="<%=hs.getAttribute("ac")%>"></a>
				</div>
				<div class="box3">
				 <a href="Question_Major_Items?mast=back">羽のように広がった背中が一番だ！！<input type="hidden"name="ac" value="<%=hs.getAttribute("ac")%>"></a>
				</div>
				<div class="box4">
				<a href="Question_Major_Items?mast=chest">分厚い大胸筋だ！！<input type="hidden" name="ac"
					value="<%=hs.getAttribute("ac")%>"></a>
					</div>

		</form>
    	<footer><a href="top.jsp">最初から診断を始める</a> </footer>
</body>
</html>