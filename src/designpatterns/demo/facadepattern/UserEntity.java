package designpatterns.demo.facadepattern;

public class UserEntity {
	
	private String userName;
	
	private Integer cardId;
	
	public UserEntity(String userName,Integer cardId) {
		this.userName = userName;
		this.cardId = cardId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	
}
