package hiraganaAppView;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hiraganaAppModel.HiraganaDAO;

public class HiraganaSetting extends JFrame{
/*시각적부분. 컴포넌트 설정등.*/
	/*변수.変数*/
	HiraganaDAO dao=new HiraganaDAO();
	//선택된 랜덤숫자.選択されたランダム数字
	int selectedNum;
	int countNum;
	//점수.点数
	int scoreNum;
	//질문횟수.質問回数
	int questionNum=30;
	//퀴즈가 시작되었는지 판단용.クイズが始まったか判断用
	boolean isStart=false; 
	//CheckBox-히라가나 종류 선택.ひらがな種類選択
	JCheckBox seion,sokuon,hatsuon,youon,dakuon,handakuon;
	//문제횟수기입란.기본 30문제로 세팅.問題回数の記入欄。基本３０問にセット。
	JTextField setNumber;
	//히라가나화면, 숫자화면.ひらがな画面、点数画面
	JLabel setnumberlbl,hiraganaGamen,showHiraganaScore;
}//HiraganaSetting class
