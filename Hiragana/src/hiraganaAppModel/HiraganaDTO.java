package hiraganaAppModel;

public class HiraganaDTO {
/*히라가나 종류/平仮名の種類*/
	private boolean chkSeion,chkSokuon,chkHatsuon,chkYouon,chkDakuon,chkHandakuon;
/*히라가나에 해당되는 숫자/平仮名に与えられた数字*/
	private int seionNum,sokuonNum,hatsuonNum,youonNum,dakuonNum,handakuonNum;
/*반복되는 수, 무작위 수/反復数、ランダム数*/
	private int repeatNum;
	private int randomNum;
/*점수/点数*/
	private int score;
	
/*getter and setter*/
	public boolean isChkSeion() {
		return chkSeion;
	}
	public void setChkSeion(boolean chkSeion) {
		this.chkSeion = chkSeion;
	}
	public boolean isChkSokuon() {
		return chkSokuon;
	}
	public void setChkSokuon(boolean chkSokuon) {
		this.chkSokuon = chkSokuon;
	}
	public boolean isChkHatsuon() {
		return chkHatsuon;
	}
	public void setChkHatsuon(boolean chkHatsuon) {
		this.chkHatsuon = chkHatsuon;
	}
	public boolean isChkYouon() {
		return chkYouon;
	}
	public void setChkYouon(boolean chkYouon) {
		this.chkYouon = chkYouon;
	}
	public boolean isChkDakuon() {
		return chkDakuon;
	}
	public void setChkDakuon(boolean chkDakuon) {
		this.chkDakuon = chkDakuon;
	}
	public boolean isChkHandakuon() {
		return chkHandakuon;
	}
	public void setChkHandakuon(boolean chkHandakuon) {
		this.chkHandakuon = chkHandakuon;
	}
	public int getSeionNum() {
		return seionNum;
	}
	public void setSeionNum(int seionNum) {
		this.seionNum = seionNum;
	}
	public int getSokuonNum() {
		return sokuonNum;
	}
	public void setSokuonNum(int sokuonNum) {
		this.sokuonNum = sokuonNum;
	}
	public int getHatsuonNum() {
		return hatsuonNum;
	}
	public void setHatsuonNum(int hatsuonNum) {
		this.hatsuonNum = hatsuonNum;
	}
	public int getYouonNum() {
		return youonNum;
	}
	public void setYouonNum(int youonNum) {
		this.youonNum = youonNum;
	}
	public int getDakuonNum() {
		return dakuonNum;
	}
	public void setDakuonNum(int dakuonNum) {
		this.dakuonNum = dakuonNum;
	}
	public int getHandakuonNum() {
		return handakuonNum;
	}
	public void setHandakuonNum(int handakuonNum) {
		this.handakuonNum = handakuonNum;
	}
	public int getRepeatNum() {
		return repeatNum;
	}
	public void setRepeatNum(int repeatNum) {
		this.repeatNum = repeatNum;
	}
	public int getRandomNum() {
		return randomNum;
	}
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}//HiraganaDTO class
