package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Question_Major_Items
 */
@WebServlet("/Question_Major_Items")
public class Question_Major_Items extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question_Major_Items() {
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
	            if(request.getParameter("mast")==null) {
	            	System.out.println("好きな部位の選択がされませんでした");
	            	 String on = "NO";
	            	session.setAttribute("on", on);
	            	 request.getRequestDispatcher("/genre.jsp").forward(request, response);
	            	 return;
	            }
	            System.out.println("mast情報を格納します");
	            String mast = request.getParameter("mast");
	            session.setAttribute("mast", mast);









	            request.getRequestDispatcher("/question1.jsp").forward(request, response);
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
