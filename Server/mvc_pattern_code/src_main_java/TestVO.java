package intern.sinc.project;

public class TestVO {
	private String SSG_id;

	public TestVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TestVO(String sSG_id) {
		super();
		SSG_id = sSG_id;
	}

	public String getSSG_id() {
		return SSG_id;
	}

	public void setSSG_id(String sSG_id) {
		SSG_id = sSG_id;
	}

	@Override
	public String toString() {
		return "TestVO [SSG_id=" + SSG_id + "]";
	}
	
	
}
