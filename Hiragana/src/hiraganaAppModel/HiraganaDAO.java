package hiraganaAppModel;

import javax.swing.text.StyledEditorKit.BoldAction;

public class HiraganaDAO {
	/*로직모음,저장될 데이터 정리.*/
	public HiraganaDAO(){
		HiraganaDTO dto=new HiraganaDTO();
	}
	//프로그램 정보.プログラム情報
	public String programInfo(){
		String prgStr="";
		//TODO 프로그램정보에 나타낼 말 적기.
		return prgStr;
	}
	//랜덤으로 숫자를 부여한다.ランダムで数字を与える
	
	public int select(boolean schkSeion,boolean chkSokuon,
					boolean chkHatsuon,boolean chkYouon,
					boolean chkDakuon,boolean chkHandakuon) {
		//TODO 로직 짜기.
		//초기화.初期化
		int num=0;
		int seionNum=0;
		int sokuonNum=0;
		int hatsuonNum=0;
		int youonNum=0;
		int dakuonNum=0;
		int handakuonNum=0;
		//１）全部または複数選択
		//２）清音のみ
		//３）促音のみ
		//４）撥音のみ
		//５）拗音のみ
		//６）濁音のみ
		//７）半濁音のみ
		return num;
	}
	/**/
	//랜덤수→글자변환ランダム数→文字変換　
	public String setMoji(int selectedNum) {
		String moji=null;
		//TODO 로직짜기.메소드 형식 char? string?고민중.
		return moji;
	}
}//class
