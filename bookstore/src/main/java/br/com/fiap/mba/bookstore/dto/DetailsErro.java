package br.com.fiap.mba.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailsErro {
	
	private String title;
	
	private Long status;
	
	private Long timestamp;

}
