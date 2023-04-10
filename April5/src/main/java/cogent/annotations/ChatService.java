package cogent.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("chat")
public class ChatService {
	private final HistoryService hs;
	private final ChatRoomService crs;
	@Autowired
	public ChatService(HistoryService hs, ChatRoomService crs) {
		super();
		this.hs = hs;
		this.crs = crs;
	}
	
	public void chat() {
		hs.store();
		crs.start();
	}
	
}
