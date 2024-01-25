/*
 * Copyright (c) Dandelion development.
 */

package com.klindziuk.ai.service;

import com.klindziuk.ai.model.LlamaResponse;

public interface LlamaAiService {

  LlamaResponse generateMessage(String prompt);

  LlamaResponse generateJoke(String topic);
}
