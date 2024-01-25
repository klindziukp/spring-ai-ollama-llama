/*
 * Copyright (c) Dandelion development.
 */

package com.klindziuk.ai.service.impl;

import com.klindziuk.ai.model.LlamaResponse;
import com.klindziuk.ai.service.LlamaAiService;
import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlamaAiServiceImpl implements LlamaAiService {

  private final ChatClient chatClient;

  @Autowired
  public LlamaAiServiceImpl(ChatClient chatClient) {
    this.chatClient = chatClient;
  }

  @Override
  public LlamaResponse generateMessage(String promptMessage) {
    final String llamaMessage = chatClient.call(promptMessage);
    return new LlamaResponse().setMessage(llamaMessage);
  }

  @Override
  public LlamaResponse generateJoke(String topic) {
    final String llamaMessage = chatClient.call(String.format("Tell me a joke about %s", topic));
    return new LlamaResponse().setMessage(llamaMessage);
  }
}
