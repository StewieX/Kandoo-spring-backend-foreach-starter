package across.samples.application.domain.theme;

import com.foreach.across.modules.user.business.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class Theme {
    @Id
    private String id;

    private String title;

    private String description;

    private List<String> tags;

    private boolean isPublic;

    @DBRef
    private List<ThemeMember> members;

    public Theme(String title, String description, List<String> tags, boolean isPublic, User themeCreator) {
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.isPublic = isPublic;

        this.members = new ArrayList<>();
        ThemeMember creator = new ThemeMember(ThemeRole.Organiser, themeCreator, this);
        this.members.add(creator);
    }

    public String getId() {
        return id;
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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public List<ThemeMember> getMembers() {
        return members;
    }

    public void setMembers(List<ThemeMember> members) {
        this.members = members;
    }
}
