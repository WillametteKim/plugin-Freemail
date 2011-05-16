package freemail.wot;

public class OwnIdentity extends Identity {
	private final String insertURI;

	public OwnIdentity(String identityID, String requestURI, String insertURI, String nickname) {
		super(identityID, requestURI, nickname);

		this.insertURI = insertURI;
	}
}
