package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session = request.getSession();
		 try{
	            request.setCharacterEncoding("UTF-8");//リクエストパラメータの文字コードをUTF-8に変更

	            //アクセスルートチェック
	            //String accesschk = request.getParameter("ac");
	            //if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
	                //throw new Exception("不正なアクセスです");
	            //}

	            //条件分岐を行う
	            //まずはgenreに格納されている物事にサーブレットを分ける。（処理の記述が長くなりすぎるため）
	            if(session.getAttribute("genre").equals("F")) {
	            	System.out.println("ジャンルでフィジークが選択されていたのでフィジークで診断を行います");
	            	RequestDispatcher dis = request.getRequestDispatcher("F");
	                dis.forward(request, response);
	                return;
	            }else if(session.getAttribute("genre").equals("C")) {
	            	RequestDispatcher dis = request.getRequestDispatcher("C");
	            	System.out.println("ジャンルでクラシックが選択されていたのでフィジークで診断を行います");
	                dis.forward(request, response);
	                return;

	            }else if(session.getAttribute("genre").equals("O")) {
	            	System.out.println("ジャンルでオープンボディビルが選択されていたのでフィジークで診断を行います");
	            	RequestDispatcher dis = request.getRequestDispatcher("O");
	                dis.forward(request, response);
	                return;
	            }









		 }catch(Exception e){
	            request.setAttribute("error", e.getMessage());
	            request.getRequestDispatcher("/error.jsp").forward(request, response);
	        }
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
