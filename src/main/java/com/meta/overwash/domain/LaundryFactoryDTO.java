package com.meta.overwash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LaundryFactoryDTO {

	Integer factoryId;
	String factoryContact;
	String factoryAddress;
}
