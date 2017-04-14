package across.samples.application.domain.user;

import com.foreach.across.modules.user.business.User;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * Created by Steven Gentens on 3/28/2017.
 */
@Document
public class UserSettings {
    @Id
    private String id;

    @DBRef
    private User user;

    private boolean showNotifications;
}
