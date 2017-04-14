package across.samples.application.domain.session;

import be.kdg.stevengentens.domain.card.Card;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class SessionCard {
    @Id
    private String id;

    @DBRef
    private Session session;

    @DBRef
    private Card card;

    private String commentary;

    public SessionCard(Session session, Card card) {
        this.session = session;
        this.card = card;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
