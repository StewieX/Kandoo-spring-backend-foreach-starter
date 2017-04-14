package across.samples.application.domain.theme;

import com.foreach.across.modules.user.business.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class ThemeMember {
    @Id
    private String id;

    private ThemeRole role;

    @DBRef
    private User user;

    @DBRef
    private Theme theme;

    public ThemeMember(ThemeRole role, User user, Theme theme) {
        this.role = role;
        this.user = user;
        this.theme = theme;
    }


    public String getId() {
        return id;
    }

    public ThemeRole getRole() {
        return role;
    }

    public void setRole(ThemeRole role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
