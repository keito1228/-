package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class O
 */
@WebServlet("/O")
public class O extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public O() {
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
		System.out.println("ジャンル、フィジークで診断を始めます（F.javaに移動が完了）");
		//綺麗なアウトライン！！"second"="1"
		//なによりも迫力だ！！"second"="2"
		//逆三角形！！"second" ="3"
		//弾丸のような腹筋だ！"second" ="4"
		Player_Name_Beans Player_data = new Player_Name_Beans();
		if(session.getAttribute("mast").equals("arm")) {
			if(session.getAttribute("second").equals("1")) {
				//腕が太い+シルエットが大きい
				Player_data.setName("フィル・ヒース");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/philheath/?hl=ja");
				//画像URL
				Player_data.setImage("https://i0.wp.com/kinntoreprotein.com/wp-content/uploads/2017/09/8c37d07e0d13eec71c8c7c9ffae0b4a8-e1506080244247.png?fit=747%2C727");
			}else if(session.getAttribute("second").equals("2")) {
				//腕が太い+筋肉が大きい
				Player_data.setName("ローリー・ウィンクラー");
				Player_data.setPlayerCaption("https://www.instagram.com/roellywinklaar/?hl=ja");
				//画像URL
				Player_data.setImage("https://bodymakingtips.com/wp-content/uploads/2018/03/c45e77523e59e6ff050037ad83c9fd9f-1024x578.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//腕が太い+逆▼
				Player_data.setName("セルジオ・オリバ");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://stat.ameba.jp/user_images/20141125/23/musclewasshoi/7f/f7/j/o0405073413140509449.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//腕が太い+腹筋
				Player_data.setName("フランク・ゼイン");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://images-na.ssl-images-amazon.com/images/I/812wtYImb0L._AC_SL1500_.jpg");
			}
		}else if(session.getAttribute("mast").equals("leg")) {
			if(session.getAttribute("second").equals("1")) {
				//脚が太い+シルエットが大きい
				Player_data.setName("ジェイ・カトラー");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://images-na.ssl-images-amazon.com/images/I/514RW3xYHVL._AC_SY450_.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//脚が太い+筋肉が大きい
				Player_data.setName("ロニー・コールマン");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://image.space.rakuten.co.jp/lg01/66/0001305366/79/img3868646fzikfzj.jpeg");
			}else if(session.getAttribute("second").equals("3")) {
				//脚が太い+逆▼
				//脚が太い+筋肉が大きい
				Player_data.setName("ハディチョーパン");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://pbs.twimg.com/media/EQP1WDlUUAEP2AN.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//脚が太い+腹筋
				Player_data.setName("山岸秀匡");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://blog-imgs-126.fc2.com/s/a/k/sakabept/fc2blog_2019061323415180f.jpg");
			}
		}else if(session.getAttribute("mast").equals("back")) {
			if(session.getAttribute("second").equals("1")) {
				//背中が太い+シルエットが大きい
				Player_data.setName("ドリアンイエーツ");
				//インスタグラムURL
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://stat.ameba.jp/user_images/20130102/18/chog-dairy/8a/e0/j/o0300045012359640458.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//背中が太い+筋肉が大きい
				Player_data.setName("カイグリーン");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://physiqueonline.jp/system/photos/images/000/013/496/medium/uploadimage.jpg?1502691563");
			}else if(session.getAttribute("second").equals("3")) {
				//背中が太い+逆▼
				Player_data.setName("ブランドンカリー");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://stat.ameba.jp/user_images/20200513/06/wade003-2/26/6a/j/o0577112514757903149.jpg?caw=800");
			}else if(session.getAttribute("second").equals("4")) {
				//背中が太い+腹筋
				Player_data.setName("ウィリアムボナック");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://mr-gorilla.com/wp-content/uploads/2018/10/Arnold-Classic-winner-William-Bonac-719x1024-719x720.jpg");
			}
		}else if(session.getAttribute("mast").equals("chest")) {
			if(session.getAttribute("second").equals("1")) {
				//胸が強い+シルエットが大きい
				Player_data.setName("アーノルド・シュワルツェネッガー");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://i.pinimg.com/originals/7e/27/2f/7e272fe69bf6a7c4b5807b74708abc89.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//胸が強い+筋肉が大きい
				Player_data.setName("フレックスルイス");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://be-fit-light.jp/blog/wp-content/uploads/2020/09/200902_m07.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//胸が強い+逆▼
				Player_data.setName("リープリースト");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://la7gsydt1o.user-space.cdn.idcfcloud.net/production/imgs/images/000/064/665/original.jpg?1599548964");
			}else if(session.getAttribute("second").equals("4")) {
				//胸が強い+腹筋
				Player_data.setName("フレックスウィラー");
				Player_data.setPlayerCaption("");
				//画像URL
				Player_data.setImage("https://la7gsydt1o.user-space.cdn.idcfcloud.net/production/imgs/images/000/048/513/original.jpg?1596290058");
			}
		}

		session.setAttribute("Player_data", Player_data);


		System.out.println("結果表示ページへ移動");
		request.getRequestDispatcher("/result.jsp").forward(request, response);



	}catch(Exception e){
		//何らかの理由で失敗したらエラーページにエラー文を渡して表示。想定は不正なアクセスとDBエラー
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
