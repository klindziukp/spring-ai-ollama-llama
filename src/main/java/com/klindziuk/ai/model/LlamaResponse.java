/*
 * Copyright (c) Dandelion development.
 */

package com.klindziuk.ai.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LlamaResponse {

  private String message;
}
