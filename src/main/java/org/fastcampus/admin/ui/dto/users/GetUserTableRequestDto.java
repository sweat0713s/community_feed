package org.fastcampus.admin.ui.dto.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.fastcampus.common.domain.Pageable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetUserTableRequestDto extends Pageable {

  private String name;

}
