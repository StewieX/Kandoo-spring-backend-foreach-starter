package across.samples.application.domain.session;


import be.kdg.stevengentens.domain.card.Card;
import com.foreach.across.modules.user.business.User;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class SessionEvent {

    @Id
    private String id;

    private EventType eventType;

    @DBRef
    private User user;

    @DBRef
    @Transient
    private Card card;

    @CreatedDate
    private DateTime created;

    public SessionEvent(){}

    public SessionEvent(EventType eventType, User user, Card card) {
        this.eventType = eventType;
        this.user = user;
        this.card = card;
    }

    public String getId() {
        return id;
    }

    public DateTime getCreated() {
        return created;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
