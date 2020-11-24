package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class C
 */
@WebServlet("/C")
public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public C() {
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
				Player_data.setName("ウェスレイ・ヴィッサーズ");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/wesleyvissers/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://cyberflexing.com/wp-content/uploads/2018/04/wesley6.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//腕が太い+筋肉が大きい
				Player_data.setName("ジョージ・ピーターソン");
				Player_data.setPlayerCaption("https://www.instagram.com/georgep_dabull/?hl=ja");
				//画像URL
				Player_data.setImage("https://fitnessvolt.com/wp-content/uploads/2019/09/george-peterson-at-olympia.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//腕が太い+逆▼
				Player_data.setName("ジェイソン・ロウ");
				Player_data.setPlayerCaption("https://www.instagram.com/ifbb_broku/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://b3f6f0e5768faad06eb5-eed32e48d61a94a225946419bf18d661.ssl.cf2.rackcdn.com/Lowe-CP-DSC8407-Dan-Ray.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//腕が太い+腹筋
				Player_data.setName("ダビデ・マルティネス・カンポス");
				Player_data.setPlayerCaption("https://www.instagram.com/davidmcs/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://b3f6f0e5768faad06eb5-eed32e48d61a94a225946419bf18d661.ssl.cf2.rackcdn.com/Martinez-Campos-CP-IMG1040-Asun.jpg");
			}
		}else if(session.getAttribute("mast").equals("leg")) {
			if(session.getAttribute("second").equals("1")) {
				//脚が太い+シルエットが大きい
				Player_data.setName("クリス・バムステッド");
				Player_data.setPlayerCaption("https://www.instagram.com/cbum/?hl=ja");
				//画像URL
				Player_data.setImage("https://cdn-ak.f.st-hatena.com/images/fotolife/h/happy-pump-media/20190224/20190224204942.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				//脚が太い+筋肉が大きい
				Player_data.setName("リッキー・モートン");
				Player_data.setPlayerCaption("https://www.instagram.com/officialrealt_ifbbpro/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://i.pinimg.com/736x/6d/f1/a3/6df1a37dab4e938bceeb1ed5f90215fc.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//脚が太い+逆▼
				//脚が太い+筋肉が大きい
				Player_data.setName("キーオン・ピアーソン");
				Player_data.setPlayerCaption("https://www.instagram.com/keone_prodigy/");
				//画像URL
				Player_data.setImage("https://www.greatestphysiques.com/wp-content/uploads/2018/10/Keone-Pearson.08.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//脚が太い+腹筋
				//脚が太い+筋肉が大きい
				Player_data.setName("ファビオ・ロペス");
				Player_data.setPlayerCaption("https://www.instagram.com/fabiolopes_1/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://b3f6f0e5768faad06eb5-eed32e48d61a94a225946419bf18d661.ssl.cf2.rackcdn.com/Lopes-212-342A4943-mkay.jpg");
			}
		}else if(session.getAttribute("mast").equals("back")) {
			if(session.getAttribute("second").equals("1")) {
				//背中が太い+シルエットが大きい
				Player_data.setName("ブレオン・アンズレイ");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/breonma_/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://be-fit-light.jp/blog/wp-content/uploads/2020/07/Breon-Ansley%EF%BC%88%E3%83%96%E3%83%AC%E3%82%AA%E3%83%B3%E3%83%BB%E3%82%A2%E3%83%B3%E3%82%BA%E3%83%AC%E3%82%A4%EF%BC%89-243x300.png");
			}else if(session.getAttribute("second").equals("2")) {
				//背中が太い+筋肉が大きい
				Player_data.setName("ジョージ・ピーターソン");
				Player_data.setPlayerCaption("https://www.instagram.com/georgep_dabull/?hl=ja");
				//画像URL
				Player_data.setImage("https://fitnessvolt.com/wp-content/uploads/2019/09/george-peterson-at-olympia.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//背中が太い+逆▼
				Player_data.setName("キーオン・ピアーソン");
				Player_data.setPlayerCaption("https://www.instagram.com/keone_prodigy/");
				//画像URL
				Player_data.setImage("https://www.greatestphysiques.com/wp-content/uploads/2018/10/Keone-Pearson.08.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//背中が太い+腹筋
				Player_data.setName("ブレオン・アンズレイ");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/breonma_/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://be-fit-light.jp/blog/wp-content/uploads/2020/07/Breon-Ansley%EF%BC%88%E3%83%96%E3%83%AC%E3%82%AA%E3%83%B3%E3%83%BB%E3%82%A2%E3%83%B3%E3%82%BA%E3%83%AC%E3%82%A4%EF%BC%89-243x300.png");
			}
		}else if(session.getAttribute("mast").equals("chest")) {
			if(session.getAttribute("second").equals("1")) {
				//胸が強い+シルエットが大きい
				Player_data.setName("スティーブ・ローレウス");
				Player_data.setPlayerCaption("https://www.instagram.com/steve.laureus/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://i.pinimg.com/originals/88/f9/41/88f94173e306ea7e9f3ac1643b65a6f9.jpg");
			}else if(session.getAttribute("second").equals("2")) {
				Player_data.setName("クリス・バムステッド");
				Player_data.setPlayerCaption("https://www.instagram.com/cbum/?hl=ja");
				//画像URL
				Player_data.setImage("https://cdn-ak.f.st-hatena.com/images/fotolife/h/happy-pump-media/20190224/20190224204942.jpg");
			}else if(session.getAttribute("second").equals("3")) {
				//胸が強い+逆▼
				Player_data.setName("サディク・ハゾビック");
				Player_data.setPlayerCaption("https://www.instagram.com/sadikhadzovic/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://sasakamaprotein.com/wp-content/uploads/2019/08/21689831_276300889441018_5301724767101911040_n.jpg");
			}else if(session.getAttribute("second").equals("4")) {
				//胸が強い+腹筋
				Player_data.setName("ブレオン・アンズレイ");
				//インスタグラムURL
				Player_data.setPlayerCaption("https://www.instagram.com/breonma_/?utm_source=ig_embed");
				//画像URL
				Player_data.setImage("https://be-fit-light.jp/blog/wp-content/uploads/2020/07/Breon-Ansley%EF%BC%88%E3%83%96%E3%83%AC%E3%82%AA%E3%83%B3%E3%83%BB%E3%82%A2%E3%83%B3%E3%82%BA%E3%83%AC%E3%82%A4%EF%BC%89-243x300.png");
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
