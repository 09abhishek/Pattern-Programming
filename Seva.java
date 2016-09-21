package Commands;

import java.util.ArrayList;

public class Seva {
	public static ArrayList<Commands> commandList=new ArrayList<Commands>();
	void execute(int command)
	{
		commandList.get(0).doTask();
	}

}
