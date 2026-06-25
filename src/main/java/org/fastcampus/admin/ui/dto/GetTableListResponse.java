package org.fastcampus.admin.ui.dto;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetTableListResponse<T> {

  private int totalCount;
  private List<T> tableData;
}
