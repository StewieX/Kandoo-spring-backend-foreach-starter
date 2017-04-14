package across.samples.application.domain.page;

import com.foreach.across.modules.hibernate.business.SettableIdAuditableEntity;
import com.foreach.across.modules.hibernate.id.AcrossSequenceGenerator;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name = "my_page")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Getter
public class Page extends SettableIdAuditableEntity<Page>
{
	@Id
	@GeneratedValue(generator = "seq_my_page_id")
	@GenericGenerator(
			name = "seq_my_page_id",
			strategy = AcrossSequenceGenerator.STRATEGY,
			parameters = {
					@org.hibernate.annotations.Parameter(name = "sequenceName", value = "seq_my_page_id"),
					@org.hibernate.annotations.Parameter(name = "allocationSize", value = "1")
			}
	)
	private Long id;

	@Column
	@NotBlank
	@Length(max = 255)
	private String name;

	@Column
	private boolean active;

//	@Override
//	public void setId(Long aLong) {
//		this.id = aLong;
//	}
//
//	@Override
//	public Long getId() {
//		return this.id;
//	}
}
