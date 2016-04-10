
public class PezDispenser {
	
	//	Constant naming convention up case and under scored
	//  final keyword makes it sure that noone can change the value
	//  public static constant field
	public static final int MAX_PEZ = 12;
	private int mPezCount;
	
	//	Common prefix for member variables start with "mVarName"
	private String mCharacterName;
	
	
	// Method also have an access level modifier too
	
	public PezDispenser(String characterName) {
		mCharacterName = characterName;
		mPezCount = 0;
	}
	
	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			mPezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}
	
	public void load() {
		load(MAX_PEZ);
	}
	
	public void load(int pezAmount) {
		int newAmount = mPezCount + pezAmount;
		if (newAmount > MAX_PEZ) {
			throw new IllegalArgumentException("Too many PEZ!!!");
		}
		mPezCount = newAmount;
	}
	
	public int getPezCount() {
		return mPezCount;
	}
	
	public boolean isEmpty() {
		return mPezCount == 0;
	}
	
	public String getCharacterName() {
		return mCharacterName;
	}
}
