package Commands;

public class Person {
	Seva s;
	public void doVisit(int i)
	{
		s=new Seva();
		s.execute(0);
		
	}
	public static void main(String[] args) {
		Seva.commandList.add(new DeathCeritificate());
		Person person=new Person();
		person.doVisit(0);
	}

}
