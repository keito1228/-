package main;

public class Player_Name_Beans {
	private String name;
	private String Image;
	private String PlayerCaption;

	public Player_Name_Beans(){
		this.name = "";
		this.PlayerCaption = "";
		this.Image = "";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		//空文字(未入力)の場合空文字をセット
		if(name.trim().length()==0){
			this.name = "";
		}else{
			this.name = name;
		}
	}

	public String getPlayerCaption() {
		return PlayerCaption;
	}
	public void setPlayerCaption(String PlayerCaption) {
		//空文字(未入力)の場合空文字をセット
		if(PlayerCaption.trim().length()==0){
			this.PlayerCaption = "";
		}else{
			this.PlayerCaption = PlayerCaption;
		}
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String Image) {

		this.Image =Image;
	}

}
