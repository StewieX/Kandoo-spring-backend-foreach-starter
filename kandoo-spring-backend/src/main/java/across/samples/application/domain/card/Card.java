package across.samples.application.domain.card;

import com.foreach.across.modules.hibernate.business.SettableIdAuditableEntity;
import com.foreach.across.modules.hibernate.id.AcrossSequenceGenerator;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * Created by Steven Gentens on 3/30/2017.
 */
@Entity
@Table(name = "my_card")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Getter
public class Card extends SettableIdAuditableEntity<Card> {

    @Id
    @GeneratedValue(generator = "seq_my_card_id")
    @GenericGenerator(
            name = "seq_my_card_id",
            strategy = AcrossSequenceGenerator.STRATEGY,
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequenceName", value = "seq_my_card_id"),
                    @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1")
            }
    )
    private Long id;

    @Column
    @NotBlank
    @Length(max = 2000)
    private String description;

}
