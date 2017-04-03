package Game;

public class History {
	public String id;
	public String referee;
	public String[] tempid = new String[8];
	public String[] tempname = new String[8];
	public String[] tempresult = new String[8];
	public String[] temprank = new String[8];
	
	public History(String id,String referee,String[] tempid,String[] tempname,String[] tempresult,String[] temprank){
		this.id=id;
		this.referee=referee;
		this.tempid=tempid;
		this.tempname=tempname;
		this.tempresult=tempresult;
		this.temprank=temprank;
	}
	public String getid() {
		return id;
	}
	public String getreferee() {
		return referee;
	}
	public String[] gettempid() {
		return tempid;
	}
	public String[] gettempname() {
		return tempname;
	}
	public String[] gettempresult() {
		return tempresult;
	}
	public String[] gettemprank() {
		return temprank;
	}
	
}
