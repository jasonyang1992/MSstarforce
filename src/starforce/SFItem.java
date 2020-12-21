package starforce;

public class SFItem {

	private int currentStar;
	private int successRate;
	private int failRate;
	private int destroyRate;

	public SFItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SFItem(int currentStar) {
		super();
		this.currentStar = currentStar;
	}
	
	public void addSuccess() {
		successRate++;
	}
	
	public void addFail() {
		failRate++;
	}
	
	public void addDestroyRate() {
		destroyRate++;
	}
	
	public int getSuccess() {
		return successRate;
	}
	
	public int getFail() {
		return failRate;
	}
	
	public int getdestroyRate() {
		return destroyRate;
	}

	public void addStar() {
		currentStar++;
	}
	
	public void subStar() {
		currentStar--;
	}
	
	public int getCurrentStar() {
		return currentStar;
	}
	
	public void destroyed() {
		this.currentStar = 12;
	}

	public void setCurrentStar(int currentStar) {
		this.currentStar = currentStar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentStar;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SFItem other = (SFItem) obj;
		if (currentStar != other.currentStar)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SFItem [currentStar=" + currentStar + "]";
	}
	
	
}
