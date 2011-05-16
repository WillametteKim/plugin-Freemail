package freemail.wot;

public class Identity {
	private final String identityID;
	private final String requestURI;
	private final String nickname;

	public Identity(String identityID, String requestURI, String nickname) {
		this.identityID = identityID;
		this.requestURI = requestURI;
		this.nickname = nickname;
	}
}
