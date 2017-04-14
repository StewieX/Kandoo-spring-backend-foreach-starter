package across.samples.application.domain.session;

import com.foreach.across.modules.user.business.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class SessionParticipant {
    @Id
    private String id;

    @DBRef
    private User user;

    @DBRef
    private Session session;

    public SessionParticipant(User user, Session session) {
        this.user = user;
        this.session = session;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
