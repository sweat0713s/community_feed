package org.fastcampus.admin.ui.dto.users;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetDailyRegisterUserResponseDto {
  private LocalDate date;
  private Long count;

}
