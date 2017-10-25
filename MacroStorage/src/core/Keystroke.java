package core;

public class Keystroke extends Step{
	protected String key;
	protected boolean isPush;
	public Keystroke(String someKey, boolean someState){
		key=someKey;
		isPush=someState;
	}
	public String getKey(){
		return key;
	}
	public boolean getState(){
		return isPush;
	}
}
