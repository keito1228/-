package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class F
 */
@WebServlet("/F")
public class F extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public F() {
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
				Player_data.setName("レイモンド・エドモンド");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/raymontedmonds/?hl=ja");
				//画像URL
				Player_data.setImage("https://coolfitness.jp/wp-content/uploads/2019/09/69622105_242969426682939_163109564343650329_n-min-e1568694059576.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//腕が太い+筋肉が大きい
				Player_data.setName("ローガン・フランクリン");
				Player_data.setPlayerCaption("https://www.instagram.com/logan_franklin/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://i.pinimg.com/originals/11/58/f9/1158f9542c9ce55bf2a272bc965bf43a.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//腕が太い+逆▼
				Player_data.setName("カイロン・ホールデン");
				Player_data.setPlayerCaption("https://www.instagram.com/kyron_igm/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://zuna-lab.com/wp-content/uploads/2019/03/DSC6266.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//腕が太い+腹筋
				Player_data.setName("アンドレ・ファーガソン");
				Player_data.setPlayerCaption("https://www.instagram.com/luckylibra213/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://la7gsydt1o.user-space.cdn.idcfcloud.net/production/imgs/images/000/066/346/original.jpg?1599948442");
			}
		}else if(session.getAttribute("mast").equals("leg")) {
			if(session.getAttribute("second").equals("1")) {
				//脚が太い+シルエットが大きい
				Player_data.setName("ブワン・チャウハン");
				Player_data.setPlayerCaption("https://www.instagram.com/bhuwan_ifbbpro/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://b3f6f0e5768faad06eb5-eed32e48d61a94a225946419bf18d661.ssl.cf2.rackcdn.com/Chauhan-MP-IMG0737-Asun.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//脚が太い+筋肉が大きい
				Player_data.setName("ザヴィサス・ガイデン");
				Player_data.setPlayerCaption("https://www.instagram.com/xavisus_gayden/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://b3f6f0e5768faad06eb5-eed32e48d61a94a225946419bf18d661.ssl.cf2.rackcdn.com/Gayden-MP-IMG4677-Asun.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//脚が太い+逆▼
				//脚が太い+筋肉が大きい
				Player_data.setName("ブランドン・ヘンドリクソン");
				Player_data.setPlayerCaption("https://www.instagram.com/brandon.d.hendrickson/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://cdn-ak.f.st-hatena.com/images/fotolife/N/N1KI/20190422/20190422151909.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//脚が太い+腹筋
				//脚が太い+筋肉が大きい
				Player_data.setName("ジョセフ・リー");
				Player_data.setPlayerCaption("https://www.instagram.com/joemonji/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://b3f6f0e5768faad06eb5-eed32e48d61a94a225946419bf18d661.ssl.cf2.rackcdn.com/Lee-MP-IMG4758-Asun.jpg");
			}
		}else if(session.getAttribute("mast").equals("back")) {
			if(session.getAttribute("second").equals("1")) {
				//背中が太い+シルエットが大きい
				Player_data.setName("レイモンド・エドモンド");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/raymontedmonds/?hl=ja");
				//画像URL
				Player_data.setImage("https://coolfitness.jp/wp-content/uploads/2019/09/69622105_242969426682939_163109564343650329_n-min-e1568694059576.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//背中が太い+筋肉が大きい
				Player_data.setName("ブランドン・ヘンドリクソン");
				Player_data.setPlayerCaption("https://www.instagram.com/brandon.d.hendrickson/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://cdn-ak.f.st-hatena.com/images/fotolife/N/N1KI/20190422/20190422151909.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//背中が太い+逆▼
				Player_data.setName("アンドレ・ファーガソン");
				Player_data.setPlayerCaption("https://www.instagram.com/luckylibra213/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://la7gsydt1o.user-space.cdn.idcfcloud.net/production/imgs/images/000/066/346/original.jpg?1599948442");
			}else if(session.getAttribute("second").equals("4")) {
				//背中が太い+腹筋
				Player_data.setName("カルロス・デ・オリヴェイラ");
				Player_data.setPlayerCaption("https://www.instagram.com/fernando_chala/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://cdn-ak.f.st-hatena.com/images/fotolife/l/lifebuilding/20191230/20191230144516.jpg");
			}
		}else if(session.getAttribute("mast").equals("chest")) {
			if(session.getAttribute("second").equals("1")) {
				//胸が強い+シルエットが大きい
				Player_data.setName("ヤッサー・フェルナンド・チャラ・ブランドン");
				Player_data.setPlayerCaption("https://www.instagram.com/caikepro/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://www.muscleandfitness.com/wp-content/uploads/2019/09/PFP182110.jpg?w=600&quality=86&strip=all");
			}else if(session.getAttribute("second").equals("2")) {
				//胸が強い+筋肉が大きい
				Player_data.setName("ジェレミー・ブエンディア");
				Player_data.setPlayerCaption("https://www.instagram.com/jeremy_buendia/?hl=ja");
				//画像URL
				Player_data.setImage("https://friendsfarms.jp/wp-content/uploads/2019/01/Jeremy-Buendia-P-1.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//胸が強い+逆▼
				Player_data.setName("ジェレミー・ポトビン");
				Player_data.setPlayerCaption("https://www.instagram.com/jeremypotvin_/?hl=ja");
				//画像URL
				Player_data.setImage("https://www.greatestphysiques.com/wp-content/uploads/2016/11/1865927.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//胸が強い+腹筋
				Player_data.setName("ライアン・テリー");
				Player_data.setPlayerCaption("https://www.instagram.com/ryanjterry/?hl=ja");
				//画像URL
				Player_data.setImage("https://i0.wp.com/fitvista.blog/wp-content/uploads/2017/08/df98ddfe99c6d566183ae12dcc796012-bodybuilding-fitness-ryan-terry.jpg?w=780&ssl=1");
			}
		}

		session.setAttribute("Player_data", Player_data);
		System.out.print(Player_data.getImage());
		System.out.print(Player_data.getName());
		System.out.print(Player_data.getPlayerCaption());

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
