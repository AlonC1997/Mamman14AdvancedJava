
public class ClientRequest {
	private String name  ;
	private int id;
	private String request  ;

	public ClientRequest(String name, int id, String request) {
		this.name = name;
		this.id = id;
		this.request = request;
	}

	public <T extends ClientRequest> boolean contains(T e) {
		if (this.id == e.getID() && this.request.equals(e.getReq())) {
			return true;
		}
		return false ;
	}
	
	protected int getID() {
		return this.id; 
	}
	
	protected String getReq() {
		return this.request;
	}
	
	protected String getName() {
		return this.name; 
	}

}
