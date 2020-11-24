package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Genre
 */
@WebServlet("/Genre")
public class Genre extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Genre() {
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
	            System.out.println("到達");
	            //アクセスルートチェック
	            //String accesschk = request.getParameter("ac");
	            //if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
	               // throw new Exception("不正なアクセスです");
	           // }
	            System.out.println("アクセスチェッククリア");
	            if(request.getParameter("genre")==null) {
	            	System.out.println("ジャンルの選択がされませんでした");
	            	 String no = "NO";
	            	session.setAttribute("no", no);
	            	 request.getRequestDispatcher("/genre.jsp").forward(request, response);
	            	 return;
	            }
	            System.out.println("ジャンル情報を格納します");
	            String genre = request.getParameter("genre");
	            session.setAttribute("genre", genre);









	            request.getRequestDispatcher("/question_major_items.jsp").forward(request, response);
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
