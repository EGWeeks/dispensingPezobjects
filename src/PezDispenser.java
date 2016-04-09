
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
	
	public void load() {
		mPezCount = MAX_PEZ;
	}
	
	public int getPezCount() {
		return mPezCount;
	}
	
	public String getCharacterName() {
		return mCharacterName;
	}
}
