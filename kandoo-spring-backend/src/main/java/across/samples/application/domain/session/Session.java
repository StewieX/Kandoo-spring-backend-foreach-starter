package across.samples.application.domain.session;

import com.foreach.across.modules.user.business.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class Session {
    @Id
    private String id;

    private SessionStatus sessionStatus;

    private String title;

    private String description;

    private long turnDuration;

    private int minCardsPerParticipant;

    private int maxCardsPerParticipant;

    private boolean cardsCanBeReviewed;

    private boolean cardsCanBeAdded;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private List<String> invitees;

    @DBRef
    private List<SessionParticipant> sessionParticipants;

    @DBRef
    private List<SessionEvent> sessionEvents;

    public Session(){

    }

    public Session(String title, String description,
                   long turnDuration, int minCardsPerParticipant, int maxCardsPerParticipant,
                   boolean cardsCanBeReviewed, boolean cardsCanBeAdded, LocalDateTime startDate, User sessionCreator) {
        this.sessionStatus = SessionStatus.Created;
        this.title = title;
        this.description = description;
        this.turnDuration = turnDuration;
        this.minCardsPerParticipant = minCardsPerParticipant;
        this.maxCardsPerParticipant = maxCardsPerParticipant;
        this.cardsCanBeReviewed = cardsCanBeReviewed;
        this.cardsCanBeAdded = cardsCanBeAdded;
        this.startDate = startDate;
        this.endDate = null;
        this.invitees = new ArrayList<>();
        this.sessionParticipants = new ArrayList<>();
        SessionParticipant creator = new SessionParticipant(sessionCreator, this);
        this.sessionParticipants.add(creator);
        this.sessionEvents = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public SessionStatus getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(SessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTurnDuration() {
        return turnDuration;
    }

    public void setTurnDuration(long turnDuration) {
        this.turnDuration = turnDuration;
    }

    public int getMinCardsPerParticipant() {
        return minCardsPerParticipant;
    }

    public void setMinCardsPerParticipant(int minCardsPerParticipant) {
        this.minCardsPerParticipant = minCardsPerParticipant;
    }

    public int getMaxCardsPerParticipant() {
        return maxCardsPerParticipant;
    }

    public void setMaxCardsPerParticipant(int maxCardsPerParticipant) {
        this.maxCardsPerParticipant = maxCardsPerParticipant;
    }

    public boolean isCardsCanBeReviewed() {
        return cardsCanBeReviewed;
    }

    public void setCardsCanBeReviewed(boolean cardsCanBeReviewed) {
        this.cardsCanBeReviewed = cardsCanBeReviewed;
    }

    public boolean isCardsCanBeAdded() {
        return cardsCanBeAdded;
    }

    public void setCardsCanBeAdded(boolean cardsCanBeAdded) {
        this.cardsCanBeAdded = cardsCanBeAdded;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public List<String> getInvitees() {
        return invitees;
    }

    public void setInvitees(List<String> invitees) {
        this.invitees = invitees;
    }

    public List<SessionParticipant> getSessionParticipants() {
        return sessionParticipants;
    }

    public void setSessionParticipants(List<SessionParticipant> sessionParticipants) {
        this.sessionParticipants = sessionParticipants;
    }

    public List<SessionEvent> getSessionEvents() {
        return sessionEvents;
    }

    public void setSessionEvents(List<SessionEvent> sessionEvents) {
        this.sessionEvents = sessionEvents;
    }
}
