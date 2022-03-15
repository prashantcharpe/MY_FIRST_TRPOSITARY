package encapsulation;

public class carshowroom {

	private int xuv = 1000000;
	private int bmw;
	private int Rroyals;

	public int getxuv300cost(int modelno) {

		if (modelno == 300) {
			return this.xuv;
		} else {
			return 0;
		}
	}

	public int getbmw100cost(int modelno) {

		if (modelno == 100) {
			return this.bmw;
		} else {
			return 0;
		}
	}

	public int getRroyals200cost(int modelno) {

		if (modelno == 200) {
			return this.Rroyals;
		} else {
			return 0;
		}
	}

	public void setxuv300cost(int modelno) {
		this.xuv = modelno;
	}

	public void setbmw100cost(int modelno) {
		this.bmw = modelno;
	}

	public void setRroyals200cost(int modelno) {
		this.xuv = modelno;
	}

}
