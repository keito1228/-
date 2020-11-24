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
 * Servlet implementation class Question1
 */
@WebServlet("/Question1")
public class Question1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question1() {
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
	               // throw new Exception("不正なアクセスです");
	            //}
	            if(request.getParameter("second")==null) {
	            	System.out.print("ジャンルの選択がされませんでした");
	            	 String n = "NO";
	            	session.setAttribute("n", n);
	            	 request.getRequestDispatcher("/genre.jsp").forward(request, response);
	            	 return;
	            }
	            System.out.println("second情報を格納します");
	            String second = request.getParameter("second");
	            session.setAttribute("second", second);


	            RequestDispatcher dis = request.getRequestDispatcher("Result");
                dis.forward(request, response);
                return;
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
