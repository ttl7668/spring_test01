package ex03.setter;

public class MemberDAO {
	
	private DatabaseDev datasource;

	//세터
	public void setDatasource(DatabaseDev datasource) {
		this.datasource = datasource;
	}
	
	public void info() {
		System.out.println("DB주소:"+datasource.getUrl());
		System.out.println("DB주소:"+datasource.getUid());
		System.out.println("DB주소:"+datasource.getUpw());
	}

}
