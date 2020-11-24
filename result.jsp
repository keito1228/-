<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="main.Player_Name_Beans" %>
<!DOCTYPE html>
<html>
<head>

<%
HttpSession hs = request.getSession();
Player_Name_Beans  Player_data = (Player_Name_Beans)session.getAttribute("Player_data");

System.out.print("結果表示画面へ到達");
System.out.println(Player_data.getName());%>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/Best_body_Maker/css/reserlt.css">
</head>
<body>


  <header>
  	<h2>診断結果</h2><br>
  	<h1>あなたの好きなボディビルダーは</h1>
  </header>
  <div class="container">
    <div class="main">
    	<img class= "Imeage" src="<%=Player_data.getImage()%>"><br>
    	<p><%=Player_data.getName()%>です</p>
    </div>
    <div class="side">
    	<a class="logo1" href="<%=Player_data.getPlayerCaption()%>"> <img  src="https://i.pinimg.com/736x/52/c7/79/52c779f45c9a0e4aa220ac87e9bfb492.jpg"></a>
    	<a class= "logo2"><img  src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJcAAABxCAMAAADvXMHUAAAAaVBMVEX///9eqt7///1aqN5Vpt3///tRpN1Oo96TxObv9vlQpdtPo9pys97Q4/Df7fbz+PnX6PSx1PC21excq9xwsuHn8feDu+Lo8/V5uOKcyOiIvefG4O+Nwef4/fqjyeNmsN+81eSJu9y/3PBqMi0kAAAEl0lEQVR4nO2aeXO6PBDHyUE4QjhioKKIT3n/L/IJVv1ZOVyalfYPvtPpOB2Kn2z2SDbxvE2bNm3atGnTpk0/EL39/ClRSi9M9M+BfeRKqTT7bY67rKVoqfecC95rV6tsaLPfMKOvKhIzchMTpoien9GDvyzU4oHR8iD/QX1J7rr7e+wH/5jsfUeu7LjwH7R4puoVmPLGFWkSBLnrPBYiXfAK6jVihMqKE9VHaKRC+5Eb1/xxMox8wB/PprCsm/FjqhsSWCxCXM1Fj5wwMxJPE4+H8RRW72XBdYpF7UZlQ6uxo2PmAwjWTlrr25R+nqhrouCXKTCR//o1lOYSgsWSPtdSzyXjZsHXq87l62c9aiBYIundws9058ClgusYiXoZQbQLAMaKQ5u5yq6SxgHL07eZ4Vy/ejYzY4nrSTuddrUtAcJELg6m/zmybOfD0lccMo1nJvoaxXIHqm9cJEjSmScpDUHBeB3k0a0O6cd8xKSeDm/qneFYsYvP9+q+20DspxN1CfCuG5Z2rY7lU4gxXmcTJlPgaQxcrWU1yJQ8Lsb9X4Pc3o6MpK5rHKuR2Bc7u8wbGq0AclWQFP1KdMQKOxaf2+HLgVykxFhB0wlv5rLqvtc3CuVyyqf3b6OfYjc+H0JU3ePYu1W5vHQ6/Dknpj6WWb9q8Sg0Hl03HDeyeu77rNWYqWqt0iiFYaFxZef5hMkIY7GUEpq+IoQscQFLgY4D0xm8KJ+F6n918ArzUiw5YXBpu4SgPmTBB+U6oHR4Qrnv7DYtJVgmY85boYsKzmKW1F2BhEVeL3tB+k9cAk6guX6wtK0wrhzPs65cGFXbCpsrxsHyGsQcYcX2OFgUWo2B4i1Sn/D0ogot5VI4WA87WxwhVW27i04QDcYrvH5vvmC7+koCJ6v2on6BCIaUvbxLN77Bikl2wOzaW7C57uQCCYQN7SOYV+MEJcuQ1qp3sI4gzCWrAd3QhSqb2DlfyBT/1M/30iYenK8sEj9gQ11HSVXlxOXWIhyRr5tWF214ADWcp7AqfO9KA865o4OJ/A1nypBW87xYiA7Vn2Q416IApV8yUOiYv0T9FiwauWGx8+kdWNZjc6caiZ8j7uocwET7NizqO6yozXtm8arjD5MFi/GWgyOiXlT9qEJynL3/HNrRcLYMbcdEscLdElu7Y7mITdar3Hmx6/28qJsEPInNandxqEdT6KEer1D6qTAuWkAnMtiviJWfoZks/lztPhVNQw71ehnSle7x+WXNwCsLWeCvUJ90vS2oqtFLVBOTqN5/69G+P1I1CxZQ7aM3UWXZl5lOWVSqdt8fn4HFGF7nZsDV7g9NEzaV2UkB9vWLAoNyKjsu6qkk6E/LyG78aHRKguD2R4Zkp6NZ4OhXW53bE257ZMhlJ7NLFlVpTlq0Fuo8m11BQM88WWC6tepOf+Mu0omc321bN+TC1OXlpHsdMCvfz0pdETkVlJaJJG2erX57/FJ9S6UT1l967mP0Ji5sCulvBdye+g3Z7y3zrqgPh8TKmKqpi0599JulXyK6kz3YhN5v/f+1K/abNm3atGnTpk2bFul/qKY2y2ZtLpoAAAAASUVORK5CYII="></a>
    </div>

  </div>

  <footer><a href="top.jsp">最初から診断を始める</a></footer>



</body>
</html>